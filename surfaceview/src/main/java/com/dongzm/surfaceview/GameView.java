package com.dongzm.surfaceview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by dongzhongmin on 2016-4-5.
 */
public class GameView extends SurfaceView implements SurfaceHolder.Callback {

    //申明一个画笔
    private Contanier contaniter = null;
    private Rect rect = null;
    private Circlc circlc = null;

    public GameView(Context context) {
        super(context);
        //设置画笔
        contaniter = new Contanier();
        rect = new Rect();
        circlc = new Circlc();
        rect.addChildrenView(circlc);
        contaniter.addChildrenView(rect);
        //添加一个回掉函数
        getHolder().addCallback(this);
    }

    public void draw(){
        //锁定画布
        Canvas canvas = getHolder().lockCanvas();
        //画布颜色 白色
        canvas.drawColor(Color.WHITE);
        contaniter.draw(canvas);
        //解锁画布
        getHolder().unlockCanvasAndPost(canvas);
    }

    private Timer timer = null;
    private TimerTask task = null;

    public void startTimer(){
        if (timer == null){
            timer = new Timer();
            task = new TimerTask() {
                @Override
                public void run() {
                    draw();
                }
            };
            timer.schedule(task, 100, 100);
        }
    }

    public void stopTimer(){
        if (timer != null){
            task.cancel();
            task = null;
            timer.cancel();
            timer = null;
        }
    }

    @Override
    public void surfaceCreated(SurfaceHolder holder) {
        startTimer();
    }

    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {

    }

    @Override
    public void surfaceDestroyed(SurfaceHolder holder) {
        stopTimer();
    }
}
