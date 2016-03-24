package com.dongzm.uicontrols;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.GridView;

public class AtyUsingGridView extends AppCompatActivity {
    private GridView gridView;
    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aty_using_grid_view);
        gridView = (GridView) findViewById(R.id.gridView);
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1);
        gridView.setAdapter(adapter);
        for (int i=0; i<30; i++){
            adapter.add("hello" + i);
        }
    }
}
