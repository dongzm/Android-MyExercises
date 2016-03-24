package com.dongzm.uicontrols;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.RadioButton;

public class AtyUsingRadioGroup extends AppCompatActivity {

    private RadioButton radioRight;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aty_using_radiogroup);
        radioRight = (RadioButton) findViewById(R.id.radioRight);
    }

    public void submit(View view){
        if (radioRight.isChecked()){
           /* new AlertDialog.Builder(this).setTitle("判断").setMessage("回到正确").setPositiveButton("正确", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                }
            }).show();*/
            new AlertDialog.Builder(this).setTitle("判断").setMessage("回到正确").setPositiveButton("关闭", null).show();
        }else {
            new AlertDialog.Builder(this).setTitle("判断").setMessage("错误").setPositiveButton("关闭", null).show();
        }
    }
}
