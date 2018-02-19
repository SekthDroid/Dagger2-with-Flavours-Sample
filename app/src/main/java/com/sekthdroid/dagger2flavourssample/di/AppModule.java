package com.sekthdroid.dagger2flavourssample.di;

import android.app.Application;
import android.content.Context;
import dagger.Binds;
import dagger.Module;

/**
 * Created by SekthDroid on 19/2/18.
 */
@Module public abstract class AppModule {
  @Binds abstract Context provideContext(Application application);
}
