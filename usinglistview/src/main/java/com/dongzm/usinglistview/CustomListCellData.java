package com.dongzm.usinglistview;

/**
 * Created by dongzhongmin on 2016-3-22.
 */
public class CustomListCellData {
    private String name = "";
    private String dec = "";
    private int iconId = 0;

    public CustomListCellData(String name, String dec, int iconId) {
        this.name = name;
        this.dec = dec;
        this.iconId = iconId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDec() {
        return dec;
    }

    public void setDec(String dec) {
        this.dec = dec;
    }

    public int getIconId() {
        return iconId;
    }

    public void setIconId(int iconId) {
        this.iconId = iconId;
    }
}