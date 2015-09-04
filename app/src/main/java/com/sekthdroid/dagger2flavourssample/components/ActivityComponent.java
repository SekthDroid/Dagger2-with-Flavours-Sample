package com.sekthdroid.dagger2flavourssample.components;

import android.support.v7.app.AppCompatActivity;

import com.sekthdroid.dagger2flavourssample.annotations.PerActivity;
import com.sekthdroid.dagger2flavourssample.base.ActivityModule;

import dagger.Component;

/**
 * Created by SekthDroid on 04/09/15.
 * Project: Dagger2FlavoursSample
 * Package: com.sekthdroid.dagger2flavourssample.components
 */
@PerActivity // Subtypes of AbstractActivityComponent should be decorated with @PerActivity.
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {
    AppCompatActivity appCompatActivity();
}
