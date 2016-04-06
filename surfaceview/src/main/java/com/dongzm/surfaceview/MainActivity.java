package com.dongzm.surfaceview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(new MyView02(this));
        //setContentView(new MyView03(this));
        setContentView(new GameView(this));
    }
}
