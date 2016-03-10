package com.dongzm.usingservice;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity implements ServiceConnection {

    private final static String ActivityTag = "MainActivity";
    private Intent serviceIntent;
    private EchoService echoService = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        serviceIntent = new Intent(this, EchoService.class);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void startService(View view){
        startService(serviceIntent);
    }

    public void stopService(View view){
        stopService(serviceIntent);
    }

    public void bindService(View view){
        bindService(serviceIntent, this, Context.BIND_AUTO_CREATE);
        echoService = null;
    }

    public void unbindService(View view){
        unbindService(this);
    }

    public void getCurrentNum(View view){
        if (echoService != null){
            Log.e(ActivityTag, "当前的服务中的数字" + echoService.getCurrentNum());
        }
    }

    @Override
    public void onServiceConnected(ComponentName name, IBinder binder) {
        Log.e(ActivityTag, "onServiceConnected");
        //获取服务示例对象
        echoService = ((EchoService.EchoServiceBinder)binder).getService();
    }

    @Override
    public void onServiceDisconnected(ComponentName name) {
        Log.e(ActivityTag, "onServiceDisconnected");
    }
}
