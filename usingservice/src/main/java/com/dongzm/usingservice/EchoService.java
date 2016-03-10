package com.dongzm.usingservice;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;

import java.util.Timer;
import java.util.TimerTask;

public class EchoService extends Service {

    private static final String ServiceTag = "EchoService";

    @Override
    public IBinder onBind(Intent intent) {
        Log.e(ServiceTag, "onBind");
        return echoServiceBinder;
    }

    private final EchoServiceBinder echoServiceBinder = new EchoServiceBinder();

    public class EchoServiceBinder extends Binder {
        //返回服务对象
        public EchoService getService(){
            return EchoService.this;
        }
    }

    //公开一个方法
    public int getCurrentNum(){
        return i;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        startTimer();
        Log.e(ServiceTag, "onCreate");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        stopTimer();
        Log.e(ServiceTag, "onDestroy");
    }

    private Timer timer = null;
    private TimerTask timerTask = null;
    private int i = 0;

    public void startTimer() {
        if (timer == null) {
            timer = new Timer();
            timerTask = new TimerTask() {
                @Override
                public void run() {
                    i++;
                    Log.e(ServiceTag, "" + i);
                }
            };
            timer.schedule(timerTask, 1000, 1000);
        }
    }

    public void stopTimer() {
        if (timer != null) {
            timerTask.cancel();
            timer.cancel();
            timerTask = null;
            timer = null;
        }
    }
}
