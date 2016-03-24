package com.dongzm.usingbaseadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dongzhongmin on 2016-3-24.
 */
public abstract class MyListAdapter<T> extends BaseAdapter {

    public MyListAdapter(Context context, int resId){
        this.context = context;
        this.resId = resId;
    }

    private Context context;
    private int resId;
    private List<T> list = new ArrayList<>();

    public void add(T item){
        list.add(item);
        //通知ui更新
        notifyDataSetChanged();
    }

    public void remove(int position){
        list.remove(position);
        notifyDataSetChanged();
    }

    public  void removeLast(){
        remove(getCount()-1);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public T getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null){
            convertView = LayoutInflater.from(context).inflate(resId, null);
        }
        //执行抽象方法,执行ui操作
        initListCell(position, convertView, parent);
        return convertView;
    }

    protected abstract void initListCell(int position, View listCell, ViewGroup parent);
}
