package com.dongzm.uicontrols;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;

public class AtyUsingAutoCompleteTextView extends AppCompatActivity {
    private AutoCompleteTextView actv;
    private MultiAutoCompleteTextView mactv;
    private ArrayAdapter<String> actvadapter,mactvadapter;
    private String[] data = new String[]{
            "hello",
            "hello tom",
            "hello tomcat",
            "hello android",
            "hello java",
            "java",
            "javascript",
            "php",
            "python"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aty_using_auto_complete_text_view);
        actv = (AutoCompleteTextView) findViewById(R.id.actv);
        mactv = (MultiAutoCompleteTextView) findViewById(R.id.mactv);
        actvadapter = new ArrayAdapter<>(this,android.R.layout.simple_dropdown_item_1line,data);
        actv.setAdapter(actvadapter);
        mactvadapter = new ArrayAdapter<>(this,android.R.layout.simple_dropdown_item_1line,data);
        mactv.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
        mactv.setAdapter(mactvadapter);
    }
}
