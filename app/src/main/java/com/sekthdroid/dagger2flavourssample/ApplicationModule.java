package com.sekthdroid.dagger2flavourssample;

import android.content.Context;

import com.sekthdroid.dagger2flavourssample.annotations.ForApplication;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by SekthDroid on 04/09/15.
 * Project: Dagger2FlavoursSample
 * Package: com.sekthdroid.dagger2flavourssample
 */
@Module
public class ApplicationModule {
    private final SampleApplication application;

    public ApplicationModule(SampleApplication application) {
        this.application = application;
    }

    @Provides
    @Singleton
    @ForApplication
    Context provideApplicationContext() {
        return application;
    }
}
