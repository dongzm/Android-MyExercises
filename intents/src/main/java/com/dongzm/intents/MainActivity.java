package com.dongzm.intents;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import java.io.File;
import java.net.URI;

public class MainActivity extends AppCompatActivity {

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

    public void startAty1(View view){
        //使用ComponentName来启动Activity
        Intent i = new Intent();
        i.setComponent(new ComponentName("com.dongzm.intents","com.dongzm.intents.Aty1"));//包名和完全限定名称
        startActivity(i);
    }
    public void startAty1_1(View view){
        //使用Action来启动Activity
        Intent i = new Intent("com.dongzm.intents.intent.action.Aty1");
        startActivity(i);
    }
    public void startImage(View view){
        //根据我自动手机的图片获取图片路径
        File f = new File(Environment.getExternalStorageDirectory().toString()+"/DCIM/P50412-122456.JPG");
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setDataAndType(Uri.fromFile(f),"image/*");
        startActivity(i);
    }
    public void cell(View view){
        //拨打电话
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("tel:10086"));
        startActivity(i);
    }
    public void openWeb(View view){
        //打开网页
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.baidu.com"));
        startActivity(i);
    }
}
