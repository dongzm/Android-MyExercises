package com.dongzm.uicontrols;

import android.app.AlertDialog;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.CheckBox;

public class AtyUsingCheckbos extends AppCompatActivity {
    private CheckBox checkBox1,checkBox2,checkBox3,checkBox4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aty_using_checkbos);
        checkBox1 = (CheckBox) findViewById(R.id.checkBox);
        checkBox2 = (CheckBox) findViewById(R.id.checkBox2);
        checkBox3 = (CheckBox) findViewById(R.id.checkBox3);
        checkBox4 = (CheckBox) findViewById(R.id.checkBox4);
    }
    public void submit(View view){
        String str = "中午要吃的东西有:\n";
        if (checkBox1.isChecked()){
            str += "肉饼\n";
        }
        if (checkBox2.isChecked()){
            str += "红烧肉盖饭\n";
        }
        if (checkBox3.isChecked()){
            str += "红烧排骨\n";
        }
        if (checkBox4.isChecked()){
            str += "豆腐\n";
        }

        new AlertDialog.Builder(this).setTitle("结果").setMessage(str).setPositiveButton("关闭", null).show();
    }
}
