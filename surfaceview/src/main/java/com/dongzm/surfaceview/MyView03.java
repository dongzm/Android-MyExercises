package com.dongzm.surfaceview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

/**
 * Created by dongzhongmin on 2016-4-5.
 */
public class MyView03 extends SurfaceView implements SurfaceHolder.Callback {

    //申明一个画笔
    private Paint paint = null;

    public MyView03(Context context) {
        super(context);
        //设置画笔
        paint = new Paint();
        paint.setColor(Color.RED);
        //添加一个回掉函数
        getHolder().addCallback(this);
    }

    public void draw(){
        //锁定画布
        Canvas canvas = getHolder().lockCanvas();
        //画布颜色 白色
        canvas.drawColor(Color.WHITE);
        //第一条线旋转90度
        canvas.save();
        canvas.rotate(90,getWidth()/2,getHeight()/2);
        canvas.drawLine(0, getHeight() / 2, getWidth(), getHeight(),paint);
        //还原画布，防止后面的也旋转
        canvas.restore();
        canvas.drawLine(0,getHeight()/2 + 100,getWidth(),getHeight()+100,paint);
        //解锁画布
        getHolder().unlockCanvasAndPost(canvas);
    }

    @Override
    public void surfaceCreated(SurfaceHolder holder) {

    }

    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {
        draw();
    }

    @Override
    public void surfaceDestroyed(SurfaceHolder holder) {

    }
}
