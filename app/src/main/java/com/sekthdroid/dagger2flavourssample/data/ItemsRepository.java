package com.sekthdroid.dagger2flavourssample.data;

import com.sekthdroid.dagger2flavourssample.model.Item;
import java.util.List;

/**
 * Created by SekthDroid on 04/09/15.
 * Project: Dagger2FlavoursSample
 * Package: com.sekthdroid.com.sekthdroid.dagger2flavourssample.data
 */
public interface ItemsRepository {
    List<Item> getItems();
}
