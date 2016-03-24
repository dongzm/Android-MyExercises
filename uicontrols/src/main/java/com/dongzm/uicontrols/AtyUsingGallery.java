package com.dongzm.uicontrols;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Gallery;

public class AtyUsingGallery extends AppCompatActivity {
    private Gallery gallery;
    private ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aty_using_gallery);
        gallery = (Gallery) findViewById(R.id.gallery);
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1);
        gallery.setAdapter(adapter);
        for (int i=0; i<20; i++){
            adapter.add("Item" + i);
        }
    }
}
