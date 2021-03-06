package com.dongzm.activitylifecycle;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String TagTitle = "MainActivity";
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
        Log.e("TagTitle","onCreate");
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

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("TagTitle", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("TagTitle", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("TagTitle", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("TagTitle", "onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("TagTitle", "onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("TagTitle", "onDestroy");
    }

    public void startAty1(View view){
        Intent i = new Intent(this, Aty1.class);
        /*Bundle b = new Bundle();
        b.putString("txt", "Hello Aty1");
        i.putExtras(b);*/
        //startActivity(i);
        i.putExtra("txt", "Hello Aty1");
        startActivityForResult(i, 0);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        String s = data.getStringExtra("result");
        TextView textView = (TextView) findViewById(R.id.tv_result);
        textView.setText(s);
        super.onActivityResult(requestCode,resultCode,data);
    }
}


