package com.dongzm.uicontrols;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.ImageSwitcher;
import android.widget.ImageView;

public class AtyUsingImageSwitcher extends AppCompatActivity {
    private ImageSwitcher imageSwitcher;
    private boolean showImg1 = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aty_using_image_switcher);
        imageSwitcher = (ImageSwitcher) findViewById(R.id.imageSwitcher);
        //需要设置ui对象
        imageSwitcher.setFactory(new ImageSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                return new ImageView(AtyUsingImageSwitcher.this);
            }
        });
        //设置动画效果
        imageSwitcher.setInAnimation(AnimationUtils.loadAnimation(this, android.R.anim.fade_in));
        imageSwitcher.setOutAnimation(AnimationUtils.loadAnimation(this,android.R.anim.fade_out));
        imageSwitcher.setImageResource(R.mipmap.img1);
    }

    public void changeValue(View v){
        showImg1 = !showImg1;
        showCurrentImg();
    }

    private void showCurrentImg(){
        if (showImg1){
            imageSwitcher.setImageResource(R.mipmap.img1);
        }else{
            imageSwitcher.setImageResource(R.mipmap.img2);
        }
    }
}
