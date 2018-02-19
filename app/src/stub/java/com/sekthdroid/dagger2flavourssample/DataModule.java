package com.sekthdroid.dagger2flavourssample;

import com.sekthdroid.dagger2flavourssample.data.ItemsRepository;
import com.sekthdroid.dagger2flavourssample.data.StubItemRepository;
import dagger.Module;
import dagger.Provides;

/**
 * Created by SekthDroid on 04/09/15.
 * Project: Dagger2FlavoursSample
 * Package: com.sekthdroid.dagger2flavourssample.data
 */
@Module public abstract class DataModule {
  @Provides static ItemsRepository provideItemsRepository() {
    return new StubItemRepository();
  }
}
