package com.sekthdroid.dagger2flavourssample;

import android.app.Application;

import com.sekthdroid.dagger2flavourssample.data.ItemsRepository;
import com.sekthdroid.dagger2flavourssample.data.ProductionItemRepository;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by SekthDroid on 04/09/15.
 * Project: Dagger2FlavoursSample
 * Package: com.sekthdroid.dagger2flavourssample.data
 */
@Module
public class FlavorApplicationModule{
    private SampleApplication application;

    public FlavorApplicationModule(SampleApplication application) {
        this.application = application;
    }

    @Provides
    Application application(){
        return this.application;
    }

    @Singleton
    @Provides
    ItemsRepository provideItemsRepository(){
        return new ProductionItemRepository();
    }
}
