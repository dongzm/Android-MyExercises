package com.dongzm.surfaceview;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

/**
 * Created by dongzhongmin on 2016-4-5.
 */
public class Rect extends Contanier {
    //申明一个画笔
    private Paint paint = null;

    public Rect() {
        //设置画笔
        paint = new Paint();
        paint.setColor(Color.RED);
    }

    @Override
    public void childrenView(Canvas canvas) {
        super.childrenView(canvas);
        canvas.drawRect(0, 0 , 200, 200, paint);
        //每次加一个像素
        this.setY(this.getY() + 1);
    }
}
