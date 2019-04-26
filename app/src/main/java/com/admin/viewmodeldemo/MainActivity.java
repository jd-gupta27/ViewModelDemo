package com.admin.viewmodeldemo;

import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.admin.viewmodeldemo.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding activityMainBinding;
    RandomModel randomModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        //MainActivityDataGenerator mainActivityDataGenerator = new MainActivityDataGenerator();
        MainActivityDataGenerator model = ViewModelProviders.of(this).get(MainActivityDataGenerator.class);
        activityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        randomModel = new RandomModel();
        randomModel.setRandomNumber(model.getNumber());
        randomModel.setName(model.getName());
        activityMainBinding.setRandomModel(randomModel);
    }

}
