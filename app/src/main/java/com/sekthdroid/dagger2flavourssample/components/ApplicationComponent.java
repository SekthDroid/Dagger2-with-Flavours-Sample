package com.sekthdroid.dagger2flavourssample.components;

import android.app.Application;

import com.sekthdroid.dagger2flavourssample.FlavorApplicationModule;
import com.sekthdroid.dagger2flavourssample.base.BaseActivity;
import com.sekthdroid.dagger2flavourssample.data.ItemsRepository;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by SekthDroid on 04/09/15.
 * Project: Dagger2FlavoursSample
 * Package: com.sekthdroid.dagger2flavourssample.components
 */
@Singleton
@Component(modules = FlavorApplicationModule.class)
public interface ApplicationComponent {
    void injectActivity(BaseActivity activity);

    Application application();
    ItemsRepository userRepository();
}
