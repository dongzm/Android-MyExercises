package com.dongzm.usinglistview;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

public class CustomListView extends AppCompatActivity {

    private ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list_view);
        lv = (ListView) findViewById(R.id.listView);
        //lv.setAdapter(adapter);
        CustomListViewAdapter customAdapter =new CustomListViewAdapter(this);
        lv.setAdapter(customAdapter);
    }

    private BaseAdapter adapter = new BaseAdapter() {

        private String[] data = new String[]{"Hello1","Hello2","Hello3","Hello4","Hello5","Hello1","Hello2","Hello3","Hello4","Hello5","Hello1","Hello2","Hello3","Hello4","Hello5"};
        @Override
        public int getCount() {
            return data.length;
        }

        @Override
        public String getItem(int position) {
            return data[position];
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            //1、最简单的用法,确定时，刷新ListView时会不断创建View，数据多时，会创建很多对象
            /*TextView tv = new TextView(CustomListView.this);
            tv.setText(getItem(position));
            tv.setTextSize(50);
            Log.e("ListView",">>>>>>>>>>>>>");
            return tv;*/
            //2、convertView表示被回收的对象，如果不为空可以拿来使用,只有ListView只会创建屏幕看的到的ui
            /*TextView tv = null;
            if (convertView != null){
                tv = (TextView)convertView;
            }else {
                tv = new TextView(CustomListView.this);
                Log.e("ListView",">>>>>>>>>>>>>");
            }
            tv.setText(getItem(position));
            tv.setTextSize(50);

            return tv;*/
            //3、创建一个带图片的ListView
            return null;
        }
    };

}
