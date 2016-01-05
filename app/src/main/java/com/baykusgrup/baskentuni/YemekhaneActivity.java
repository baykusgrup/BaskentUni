package com.baykusgrup.baskentuni;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.support.v7.widget.Toolbar;
import android.util.Log;

import com.baykusgrup.baskentuni.adapters.YemekAdapter;
import com.baykusgrup.baskentuni.model.Yemek;
import com.baykusgrup.baskentuni.utils.SharedPrefs;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class YemekhaneActivity extends AppCompatActivity {


    private StaggeredGridLayoutManager gaggeredGridLayoutManager;
    JSONObject jsonObject;
    SharedPrefs sharedPrefs = new SharedPrefs();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yemekhane);
        final Toolbar[] toolbar = {(Toolbar) findViewById(R.id.toolbar)};
        setSupportActionBar(toolbar[0]);

        final RecyclerView recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
        recyclerView.setHasFixedSize(true);

        gaggeredGridLayoutManager = new StaggeredGridLayoutManager(1, 1);
        recyclerView.setLayoutManager(gaggeredGridLayoutManager);

        String json = sharedPrefs.readJson("jsonData", getApplicationContext());
        List<Yemek> listViewItems;
        listViewItems = new ArrayList<Yemek>();

        try {
            JSONObject jsonData = new JSONObject(json);
            String name = jsonData.getString("yemekhane");
            Log.i("volsefsdley", name);
            JSONArray items = new JSONArray(name);
            for (int i = 0; i < items.length(); i++) {
                JSONObject person = (JSONObject) items.get(i);

                String yemek = person.getString("yemek").replaceAll(",", "\n");
                String tarih = person.getString("tarih");

                listViewItems.add(new Yemek(tarih, yemek));
            }
            YemekAdapter rcAdapter = new YemekAdapter(YemekhaneActivity.this, listViewItems);
            recyclerView.setAdapter(rcAdapter);
        } catch (JSONException e) {
            e.printStackTrace();
        }

    }


}
