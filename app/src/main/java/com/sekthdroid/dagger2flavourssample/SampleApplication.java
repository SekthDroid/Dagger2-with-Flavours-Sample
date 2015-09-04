package com.sekthdroid.dagger2flavourssample;

import android.app.Application;

import com.sekthdroid.dagger2flavourssample.components.ApplicationComponent;
import com.sekthdroid.dagger2flavourssample.components.DaggerApplicationComponent;

/**
 * Created by SekthDroid on 04/09/15.
 * Project: Dagger2FlavoursSample
 * Package: com.sekthdroid.dagger2flavourssample
 */
public class SampleApplication extends Application{
    private ApplicationComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        this.component = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();
        component.injectApplication(this);

    }

    public ApplicationComponent component() {
        return component;
    }
}
