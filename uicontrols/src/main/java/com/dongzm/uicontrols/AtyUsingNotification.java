package com.dongzm.uicontrols;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class AtyUsingNotification extends AppCompatActivity {
    private NotificationManager manager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aty_using_notification);
        manager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
    }
    public void showNotification(View v){
        //Notification notification = new Notification(R.mipmap.ic_launcher,"Ticker Time",System.currentTimeMillis());
    }
}
