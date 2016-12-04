package com.example.sasata299.databindingapplication;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * Created by sasata299 on 2016/12/04.
 */

public class User extends BaseObservable {
    private String firstName;
    private String lastName;

    @Bindable
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
        notifyPropertyChanged(BR.firstName);
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}