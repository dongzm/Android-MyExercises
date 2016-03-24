package com.dongzm.uicontrols;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ProgressBar;

import java.util.Timer;
import java.util.TimerTask;

public class AtyUsingProgressBar extends AppCompatActivity {
    ProgressBar progressBar;
    Timer timer = null;
    TimerTask task = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aty_using_progress_bar);
        progressBar = (ProgressBar) findViewById(R.id.progressBar);
        progressBar.setMax(100);
        progressBar.setProgress(50);
    }

    @Override
    protected void onResume() {
        startTimer();
        super.onResume();
    }

    @Override
    protected void onStop() {
        stopTimer();
        super.onStop();
    }

    private void startTimer() {

        if (timer == null) {
            timer = new Timer();
            task = new TimerTask() {
                int i = 0;

                @Override
                public void run() {
                    progressBar.setProgress(i++);
                    try {
                        Thread.sleep(3 * 1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            };
        }
        timer.schedule(task, 1000, 1000);
    }

    private void stopTimer() {
        if (timer != null) {
            task.cancel();
            timer.cancel();
            task = null;
            timer = null;
        }
    }
}
