package com.dongzm.uicontrols;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;

public class AtyUsingDatePicker extends AppCompatActivity {
    private Button date;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aty_using_date_picker);
        date = (Button) findViewById(R.id.date);
    }

    public void selectDate(View view) {
        new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                date.setText(String.format("%d:%d:%d", year, monthOfYear, dayOfMonth));
            }
        }, 2016, 3, 24).show();
    }
}
