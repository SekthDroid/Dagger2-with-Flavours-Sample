package com.sekthdroid.dagger2flavourssample;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.sekthdroid.dagger2flavourssample.base.BaseActivity;
import com.sekthdroid.dagger2flavourssample.data.ItemsRepository;
import com.sekthdroid.dagger2flavourssample.data.StubItemRepository;
import com.sekthdroid.dagger2flavourssample.model.Item;

import java.util.List;

public class MainActivity extends BaseActivity {
    private ListView mList;
    private ItemsRepository repository;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mList = (ListView) findViewById(R.id.list);

        this.repository = new StubItemRepository();

        List<Item> items = repository.getItems();

        mList.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, items));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
