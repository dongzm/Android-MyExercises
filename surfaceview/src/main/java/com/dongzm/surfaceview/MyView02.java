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
public class MyView02 extends SurfaceView implements SurfaceHolder.Callback {

    //申明一个画笔
    private Paint paint = null;

    public MyView02(Context context) {
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
        canvas.drawRect(0,0,100,100,paint);
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
