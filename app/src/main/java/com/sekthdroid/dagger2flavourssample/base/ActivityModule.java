package com.sekthdroid.dagger2flavourssample.base;

import android.support.v7.app.AppCompatActivity;

import com.sekthdroid.dagger2flavourssample.annotations.PerActivity;

import dagger.Module;
import dagger.Provides;

/**
 * Created by SekthDroid on 04/09/15.
 * Project: Dagger2FlavoursSample
 * Package: com.sekthdroid.dagger2flavourssample.base
 */
@Module
public class ActivityModule {
    private AppCompatActivity appCompatActivity;

    public ActivityModule(AppCompatActivity appCompatActivity) {
        this.appCompatActivity = appCompatActivity;
    }

    @Provides
    @PerActivity
    AppCompatActivity activity(){
        return this.appCompatActivity;
    }
}
