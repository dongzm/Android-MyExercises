package com.dongzm.backbutton;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //private int clickCount = 0;
    private long lastClickTime = 0;
    @Override
    public void onBackPressed() {
        /*if (clickCount < 1){
            Toast.makeText(this,"在按一次退出程序", Toast.LENGTH_LONG).show();
            clickCount++;
        }else{
            super.onBackPressed();
        }*/
        if (lastClickTime <= 0){
            Toast.makeText(this,"在按一次退出程序", Toast.LENGTH_SHORT).show();
            lastClickTime = System.currentTimeMillis();
        }else{
            long currentClickTime = System.currentTimeMillis();
            if (currentClickTime - lastClickTime < 1000){
                finish();
            }else{
                Toast.makeText(this,"在按一次退出程序", Toast.LENGTH_SHORT).show();
                lastClickTime = currentClickTime;
            }
        }
    }
}
