package com.sekthdroid.dagger2flavourssample.base;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.sekthdroid.dagger2flavourssample.SampleApplication;
import com.sekthdroid.dagger2flavourssample.components.ApplicationComponent;

/**
 * Created by SekthDroid on 04/09/15.
 * Project: Dagger2FlavoursSample
 * Package: com.sekthdroid.dagger2flavourssample.base
 */
public class BaseActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getApplicationComponent().injectActivity(this);
    }

    protected ApplicationComponent getApplicationComponent(){
        return ((SampleApplication)getApplication()).component();
    }

    protected ActivityModule getActivityModule(){
        return new ActivityModule(this);
    }
}
