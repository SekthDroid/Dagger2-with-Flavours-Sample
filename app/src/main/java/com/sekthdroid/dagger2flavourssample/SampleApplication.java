package com.sekthdroid.dagger2flavourssample;

import com.sekthdroid.dagger2flavourssample.di.ApplicationComponent;
import com.sekthdroid.dagger2flavourssample.di.DaggerApplicationComponent;
import dagger.android.AndroidInjector;
import dagger.android.support.DaggerApplication;

/**
 * Created by SekthDroid on 04/09/15.
 * Project: Dagger2FlavoursSample
 * Package: com.sekthdroid.dagger2flavourssample
 */
public class SampleApplication extends DaggerApplication {

  @Override protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
    ApplicationComponent applicationComponent =
        DaggerApplicationComponent.builder().application(this).build();

    applicationComponent.inject(this);
    return applicationComponent;
  }
}
