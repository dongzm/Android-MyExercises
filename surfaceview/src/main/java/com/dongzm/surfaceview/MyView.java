package com.dongzm.surfaceview;

import android.content.Context;
import android.graphics.Canvas;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

/**
 * Created by dongzhongmin on 2016-4-5.
 */
public class MyView extends SurfaceView implements SurfaceHolder.Callback {
    public MyView(Context context) {
        super(context);
        //添加一个回掉函数
        getHolder().addCallback(this);
    }

    public void draw(){
        //锁定画布
        Canvas canvas = getHolder().lockCanvas();

        //解锁画布
        getHolder().unlockCanvasAndPost(canvas);
    }

    @Override
    public void surfaceCreated(SurfaceHolder holder) {

    }

    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {

    }

    @Override
    public void surfaceDestroyed(SurfaceHolder holder) {

    }
}
