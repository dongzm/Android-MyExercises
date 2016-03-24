package com.dongzm.usingbaseadapter;

import android.app.ListActivity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.TextView;

public class MainActivity extends ListActivity {

    private MyListAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adapter = new MyListAdapter<String>(this, android.R.layout.simple_list_item_1) {
            @Override
            protected void initListCell(int position, View listCell, ViewGroup parent) {
                ((TextView)listCell).setText(adapter.getItem(position));
            }
        };
        setListAdapter(adapter);
        for (int i=0; i<5; i++){
            adapter.add("hello" + i);
        }
    }

    public void add(View v){
        adapter.add("hello" + adapter.getCount());
    }

    public void remove(View v){
        adapter.removeLast();
    }
}
