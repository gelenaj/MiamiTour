package com.example.android.miamitour;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.android.miamitour.adapters.SiteAdapter;

import java.util.ArrayList;

import static com.example.android.miamitour.R.string.wynwood;

public class SiteActivity extends AppCompatActivity {
    private Fragment siteDetailsFragment;
    private FragmentTransaction mFragmentTransaction;
    private Site site;
    private ViewGroup frameContainer;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_site);

        final ArrayList<Site> sites = new ArrayList<>();
        sites.add(new Site(getString(R.string.wynwood), "2520 NW 2nd Ave, Miami, FL 33127", "This is description for wynwood"));
        sites.add(new Site(getString(R.string.overtown), "999 NW 1st Ave, Miami, FL 33136", "This is description for overtown"));
        sites.add(new Site(getString(R.string.littleHavana), "806 SW 13th Ave, Miami, FL 33135", "This is description for little havana"));
        sites.add(new Site(getString(R.string.opalackaCityHall), "780 Fisherman St, Opa-locka, FL 33054", "This is description for opalaca"));

        final SiteAdapter customAdapter = new SiteAdapter(SiteActivity.this, sites);

        final ListView listView = findViewById(R.id.list);

        listView.setAdapter(customAdapter);

        /*
        * Handles clicks on individual cities and passes data to the SiteDetailActivity.
        * */
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(SiteActivity.this, SiteDetailActivity.class);
                intent.putExtra(getString(R.string.name), sites.get(position).getName());
                intent.putExtra(getString(R.string.address), sites.get(position).getAddress());
                intent.putExtra(getString(R.string.description), sites.get(position).getDescription());
                startActivity(intent);
            }

        });

    }

}