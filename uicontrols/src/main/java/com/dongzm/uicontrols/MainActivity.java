package com.dongzm.uicontrols;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends ListActivity {

    private ArrayAdapter<ListCellData> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        adapter = new ArrayAdapter<ListCellData>(this, android.R.layout.simple_list_item_1);
        setListAdapter(adapter);
        adapter.add(new ListCellData("RadioGroup", this, new Intent(this, AtyUsingRadioGroup.class)));
        adapter.add(new ListCellData("CheckBox", this, new Intent(this, AtyUsingCheckbos.class)));
        adapter.add(new ListCellData("DatePicker", this, new Intent(this, AtyUsingDatePicker.class)));
        adapter.add(new ListCellData("TimePicker", this, new Intent(this, AtyUsingTimePicker.class)));
        adapter.add(new ListCellData("Spinner", this, new Intent(this, AtyUsingSpinner.class)));
        adapter.add(new ListCellData("ProgressBar", this, new Intent(this, AtyUsingProgressBar.class)));
        adapter.add(new ListCellData("AutoCompleteTextView", this, new Intent(this, AtyUsingAutoCompleteTextView.class)));
        adapter.add(new ListCellData("SeekBar", this, new Intent(this, AtyUsingSeekBar.class)));
        adapter.add(new ListCellData("GridView", this, new Intent(this, AtyUsingGridView.class)));
        adapter.add(new ListCellData("ProgressDialog", this, new Intent(this, AtyUsingProgressDialog.class)));
        adapter.add(new ListCellData("Notification", this, new Intent(this, AtyUsingNotification.class)));
        adapter.add(new ListCellData("ScrollView", this, new Intent(this, AtyUsingScrollView.class)));
        adapter.add(new ListCellData("RatingBar", this, new Intent(this, AtyUsingRatingBar.class)));
        adapter.add(new ListCellData("ImageSwitcher", this, new Intent(this, AtyUsingImageSwitcher.class)));
        adapter.add(new ListCellData("Gallery", this, new Intent(this, AtyUsingGallery.class)));
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {

        ListCellData data = adapter.getItem(position);
        data.startActivity();
        super.onListItemClick(l, v, position, id);
    }
}
