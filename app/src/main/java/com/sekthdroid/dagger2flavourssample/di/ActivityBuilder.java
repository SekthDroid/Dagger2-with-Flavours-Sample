package com.sekthdroid.dagger2flavourssample.di;

import com.sekthdroid.dagger2flavourssample.DataModule;
import com.sekthdroid.dagger2flavourssample.ui.main.MainActivity;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by SekthDroid on 19/2/18.
 */
@Module public abstract class ActivityBuilder {
  @ContributesAndroidInjector(modules = DataModule.class)
  abstract MainActivity bindMainActivity();
}
