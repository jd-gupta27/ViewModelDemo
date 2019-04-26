package com.admin.viewmodeldemo;

import android.arch.lifecycle.ViewModel;
import android.util.Log;

import java.util.Random;

public class MainActivityDataGenerator extends ViewModel {
    private String name;
    private String myRandomNumber;
    public String getName(){
        if(name==null){
            Log.d("DataGenerator","null");
            name =  "demo";
        }
        return name;
    }
    public static String onUsernameTextChanged(String text) {
        Log.d("name",text);
        return text;
    }
    public String getNumber(){
        Log.d("DataGenerator","Get Number");
        if(myRandomNumber == null){
            createNumber();
        }
        return myRandomNumber;
    }
    private void createNumber() {
        Log.d("DataGenerator","Create New Number");
        Random random = new Random();
        myRandomNumber = "Number: "+(random.nextInt(10-1)+1);
    }

    @Override
    protected void onCleared() {
        super.onCleared();
        Log.d("DataGenerator","View Model Destroyed");
        System.out.println("DataGenerator");
    }
}
