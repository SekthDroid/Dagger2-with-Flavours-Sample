package com.sekthdroid.dagger2flavourssample.components;

import com.sekthdroid.dagger2flavourssample.MainActivity;
import com.sekthdroid.dagger2flavourssample.annotations.PerActivity;
import com.sekthdroid.dagger2flavourssample.base.ActivityModule;

import dagger.Component;

/**
 * Created by SekthDroid on 04/09/15.
 * Project: Dagger2FlavoursSample
 * Package: com.sekthdroid.dagger2flavourssample.components
 */
@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface MainActivityComponent extends ActivityComponent{
    void inject(MainActivity homeActivity);
}
