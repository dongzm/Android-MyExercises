package com.dongzm.usingnotification;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public static final int  NOTIFICATION_ID = 1200;
    private int counter = 0;
    private NotificationManager manager = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //获取系统的NotificationManager
        manager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
    }

    public void showNotification(View view){
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this);
        //Notification最小的三个属性
        builder.setSmallIcon(R.mipmap.ic_launcher);
        builder.setContentTitle("你有" + ++counter +"个新消息");
        builder.setContentText("你已经创建一个Notification了");
        //创建Notification
        Notification notification = builder.build();
        //使用id更新
        manager.notify(NOTIFICATION_ID,notification);
    }
}
