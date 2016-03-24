package com.dongzm.uicontrols;

import android.content.Context;
import android.content.Intent;

/**
 * Created by dongzhongmin on 2016-3-22.
 */
public class ListCellData {
    private String controlName = "";
    private Context context = null;
    private Intent relatedIntent = null;

    public ListCellData(String controlName, Context context, Intent relatedIntent) {
        this.controlName = controlName;
        this.context = context;
        this.relatedIntent = relatedIntent;
    }

    public String getControlName() {
        return controlName;
    }

    public Context getContext() {
        return context;
    }

    public Intent getRelatedIntent() {
        return relatedIntent;
    }

    public void startActivity(){
        getContext().startActivity(relatedIntent);
    }

    @Override
    public String toString() {
        return controlName;
    }
}
