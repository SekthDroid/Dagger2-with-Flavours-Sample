package com.sekthdroid.dagger2flavourssample.di;

import android.app.Application;
import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;
import dagger.android.support.DaggerApplication;
import javax.inject.Singleton;

/**
 * Created by SekthDroid on 04/09/15.
 * Project: Dagger2FlavoursSample
 * Package: com.sekthdroid.dagger2flavourssample.components
 */
@Singleton @Component(modules = {
    AppModule.class, AndroidSupportInjectionModule.class, ActivityBuilder.class
}) public interface ApplicationComponent extends AndroidInjector<DaggerApplication> {

  @Override void inject(DaggerApplication instance);

  @Component.Builder interface Builder {
    @BindsInstance Builder application(Application application);

    ApplicationComponent build();
  }

  Application application();
}
