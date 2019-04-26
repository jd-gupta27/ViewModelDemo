package com.admin.viewmodeldemo;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.util.Log;

import com.admin.viewmodeldemo.BR;

public class RandomModel extends BaseObservable {
    String name;
    String randomNumber;

    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }

    @Bindable
    public String getRandomNumber() {
        return randomNumber;
    }

    public void setRandomNumber(String randomNumber) {
        this.randomNumber = randomNumber;
        notifyPropertyChanged(BR.randomNumber);
    }

    public void onTextChanged(CharSequence s, int start, int before, int count) {
        Log.w("tag", "onTextChanged " + s);
    }
}
