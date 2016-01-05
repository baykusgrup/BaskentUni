package com.baykusgrup.baskentuni;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ExpandableListView;

import com.baykusgrup.baskentuni.adapters.ExpandableListAdapter;

public class ServisAyrintiActivity extends AppCompatActivity {

    ProgressDialog progressDialog;
    ExpandableListAdapter expandableListAdapter;
    ExpandableListView expandableListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_servis_ayrinti);

        expandableListView=(ExpandableListView)findViewById(R.id.exp_list);


    }

    private  void makeJsonRequest(){

       // JsonObjectRequest jsonObjectRequest=
    }
}
