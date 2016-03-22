package com.dongzm.usinglistview;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ListView lv;
    //    private ArrayAdapter<String> adapter;
    private ArrayAdapter<ListCellData> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //使用系统的列表项simple_expandable_list_item_1
        adapter = new ArrayAdapter<ListCellData>(this,android.R.layout.simple_expandable_list_item_1);
        //使用自定义列表项list_cell
//        adapter = new ArrayAdapter<String>(this, R.layout.list_cell);

        lv = (ListView) findViewById(R.id.listView);
        lv.setAdapter(adapter);
        adapter.add(new ListCellData("小明","男",19));
        adapter.add(new ListCellData("小丽","女",29));

        lv.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        ListCellData data = adapter.getItem(position);
        Toast.makeText(this, String.format("名字：%s，性别：%s，年龄：%d",data.getUserName(),data.getSex(),data.getAge()),Toast.LENGTH_LONG).show();
    }
}
