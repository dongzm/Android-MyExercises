package com.dongzm.surfaceview;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

/**
 * Created by dongzhongmin on 2016-4-5.
 */
public class Circlc extends Contanier {
    //申明一个画笔
    private Paint paint = null;
    public Circlc() {
        //设置画笔
        paint = new Paint();
        paint.setColor(Color.BLUE);
    }

    @Override
    public void childrenView(Canvas canvas) {
        super.childrenView(canvas);
        canvas.drawCircle(50, 50, 50, paint);
    }
}
