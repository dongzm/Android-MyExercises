package com.dongzm.usingtoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showToastShort(View view){
        //Toast.makeText(this,"显示一个简短的Toast", Toast.LENGTH_LONG).show();
        Toast toast = Toast.makeText(this,"显示一个简短的Toast", Toast.LENGTH_LONG);
        //x偏移正数向右，y便宜正数向下
        toast.setGravity(Gravity.CENTER_HORIZONTAL, 100, 200);
        toast.show();
    }
    public void showToastLong(View view){
        Toast.makeText(this,"显示一个较长的Toast", Toast.LENGTH_SHORT).show();
    }

    public void showToastImage(View view){
        //设置了图片文字将不显示
        Toast toast = Toast.makeText(this, "显示一个较长的Toast", Toast.LENGTH_SHORT);
        //设置ui文件，可以使用布局文件替代
        ImageView imageView = new ImageView(this);
        imageView.setImageResource(R.mipmap.ic_launcher);
        //设置toast的view对象
        toast.setView(imageView);
        toast.show();
    }
}


