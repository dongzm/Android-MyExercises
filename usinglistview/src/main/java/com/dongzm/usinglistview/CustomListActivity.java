package com.dongzm.usinglistview;

import android.app.ListActivity;
import android.os.Bundle;
import android.os.PersistableBundle;

/**
 * Created by dongzhongmin on 2016-3-22.
 */
public class CustomListActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_listview);
        setListAdapter(new CustomListViewAdapter(this));
    }
}
