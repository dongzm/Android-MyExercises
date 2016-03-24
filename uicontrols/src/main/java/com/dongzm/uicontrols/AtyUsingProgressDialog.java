package com.dongzm.uicontrols;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class AtyUsingProgressDialog extends AppCompatActivity {
    private ProgressDialog progressDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aty_using_progress_dialog);
    }

    public void showProgressDialog(View v){
        progressDialog = ProgressDialog.show(this,"加载中","正在加载，请稍等");
        new Thread(){
            @Override
            public void run() {
                try {
                    Thread.sleep(3 * 1000);
                    progressDialog.cancel();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }.start();
    }

}
