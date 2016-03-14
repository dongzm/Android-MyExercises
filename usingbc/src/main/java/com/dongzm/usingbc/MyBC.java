package com.dongzm.usingbc;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class MyBC extends BroadcastReceiver {

    public final static String ACTION = "com.dongzm.usingbc.intent.action.MyBC";//命名格式：包名+ ".intent.action." + 自定义的ACTION名称

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.e("MyBC", "onReceive Send Data is " + intent.getStringExtra("txt"));
    }
}
