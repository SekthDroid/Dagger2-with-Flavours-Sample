package com.sekthdroid.dagger2flavourssample.ui.main;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.sekthdroid.dagger2flavourssample.R;
import com.sekthdroid.dagger2flavourssample.data.ItemsRepository;
import com.sekthdroid.dagger2flavourssample.model.Item;
import dagger.android.support.DaggerAppCompatActivity;
import java.util.List;
import javax.inject.Inject;

public class MainActivity extends DaggerAppCompatActivity {
  private ListView mList;

  @Inject ItemsRepository repository;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    mList = findViewById(R.id.list);

    if (repository == null) {
      return;
    }

    List<Item> items = repository.getItems();

    mList.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, items));
  }
}
