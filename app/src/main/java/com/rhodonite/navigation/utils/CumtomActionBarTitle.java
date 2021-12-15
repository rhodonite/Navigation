package com.rhodonite.navigation.utils;

import android.app.Activity;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.rhodonite.navigation.R;


public class CumtomActionBarTitle {
    public static void setTitle(Activity c, String TAG){
        ((AppCompatActivity) c).getSupportActionBar().show();
        View view = c.getLayoutInflater().inflate(R.layout.actionbar, null);
        ActionBar.LayoutParams params = new ActionBar.LayoutParams(
                ActionBar.LayoutParams.WRAP_CONTENT,
                ActionBar.LayoutParams.WRAP_CONTENT,
                Gravity.CENTER);
        TextView Title = view.findViewById(R.id.action_bar_title);

        Title.setText(TAG);
        ((AppCompatActivity) c).getSupportActionBar().setCustomView(view,params);
        ((AppCompatActivity) c).getSupportActionBar().setDisplayShowCustomEnabled(true); // show custom title
        ((AppCompatActivity) c).getSupportActionBar().setDisplayShowTitleEnabled(false); // hide the default title
        ((AppCompatActivity) c).getSupportActionBar().setElevation(0);
        ((AppCompatActivity) c).getSupportActionBar().setHomeAsUpIndicator(R.drawable.backicon);

        //Button b =  ((AppCompatActivity) c).getSupportActionBar().get
    }
}
