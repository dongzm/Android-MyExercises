package com.dongzm.usinglistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by dongzhongmin on 2016-3-22.
 */
public class CustomListViewAdapter  extends BaseAdapter{
    private Context context;
    public CustomListViewAdapter(Context context) {
        this.context = context;
    }

    private CustomListCellData[] data = new CustomListCellData[]{
            new CustomListCellData("img1", "dec img1", R.mipmap.img1),
            new CustomListCellData("img2", "dec img2", R.mipmap.img2),
            new CustomListCellData("img3", "dec img3", R.mipmap.img3)
    };
    @Override
    public int getCount() {
        return data.length;
    }

    @Override
    public CustomListCellData getItem(int position) {
        return data[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LinearLayout ll = null;
        if (convertView != null){
            ll = (LinearLayout) convertView;
        }else {
            //根据资源创建对象
            ll = (LinearLayout) LayoutInflater.from(context).inflate(R.layout.custom_listcell,null);
        }
        CustomListCellData data = getItem(position);
        ImageView icon = (ImageView) ll.findViewById(R.id.lv_icon);
        TextView title = (TextView) ll.findViewById(R.id.title);
        TextView dec = (TextView) ll.findViewById(R.id.dec);
        icon.setImageResource(data.getIconId());
        title.setText(data.getName());
        dec.setText(data.getDec());
        return ll;
    }
}
