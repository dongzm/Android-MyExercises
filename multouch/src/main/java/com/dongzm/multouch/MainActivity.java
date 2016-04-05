package com.dongzm.multouch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    private LinearLayout container;
    private ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        container = (LinearLayout) findViewById(R.id.container);
        iv = (ImageView) findViewById(R.id.iv);
        container.setOnTouchListener(new View.OnTouchListener() {
            //两点的距离
            float currentDistance;
            float lastDistance = -1;
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()){
                    case MotionEvent.ACTION_DOWN: System.out.println("ACTION_DOWN");
                        break;
                    case MotionEvent.ACTION_MOVE:System.out.println("ACTION_MOVE");
                        //获取多个触摸点
                        System.out.println("pointer count：" + event.getPointerCount());
                        if (event.getPointerCount() >= 2){
                            float offsetX = event.getX(0) -event.getX(1);
                            float offsetY = event.getY(0) -event.getY(1);
                            currentDistance = (float)Math.sqrt(offsetX*offsetX+offsetY*offsetY);
                            System.out.println(String.format("x1：%f  y1：%f; x2：%f  y2：%f",event.getX(0),event.getY(0),event.getX(1),event.getY(1)));
                            if (lastDistance < 0){
                                lastDistance = currentDistance;
                            }else {
                                if (currentDistance - lastDistance > 5){
                                    System.out.println("放大");
                                    LinearLayout.LayoutParams lp = (LinearLayout.LayoutParams) iv.getLayoutParams();
                                    lp.width = (int) (1.1 * iv.getWidth());
                                    lp.height = (int) (1.1 * iv.getHeight());
                                    iv.setLayoutParams(lp);
                                    lastDistance = currentDistance;
                                }else if(lastDistance - currentDistance > 5){
                                    System.out.println("缩小");
                                    LinearLayout.LayoutParams lp = (LinearLayout.LayoutParams) iv.getLayoutParams();
                                    lp.width = (int) (0.9 * iv.getWidth());
                                    lp.height = (int) (0.9 * iv.getHeight());
                                    iv.setLayoutParams(lp);
                                    lastDistance = currentDistance;
                                }
                            }
                        }
                        //设置图片
                        /*LinearLayout.LayoutParams lp = (LinearLayout.LayoutParams) iv.getLayoutParams();
                        lp.leftMargin = (int) event.getX();
                        lp.topMargin = (int) event.getY();
                        iv.setLayoutParams(lp);*/
                        //System.out.println(String.format("获取的x：%f，y：%f", event.getX(), event.getY()));
                        break;
                    case MotionEvent.ACTION_UP:System.out.println("ACTION_UP");
                        break;
                }
                //返回false表示后续事件不被触发，返回true表示后续事件被触发
                //ACTION_MOVE和ACTION_UP输出
                return true;
            }
        });
    }
}
