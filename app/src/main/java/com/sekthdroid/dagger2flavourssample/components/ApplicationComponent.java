package com.sekthdroid.dagger2flavourssample.components;

import com.sekthdroid.dagger2flavourssample.ApplicationModule;
import com.sekthdroid.dagger2flavourssample.SampleApplication;
import com.sekthdroid.dagger2flavourssample.base.BaseActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by SekthDroid on 04/09/15.
 * Project: Dagger2FlavoursSample
 * Package: com.sekthdroid.dagger2flavourssample.components
 */
@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {
    void injectApplication(SampleApplication application);
    void injectActivity(BaseActivity activity);
}
