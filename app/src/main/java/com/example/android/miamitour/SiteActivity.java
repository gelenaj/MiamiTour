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

public class SiteActivity extends AppCompatActivity {
    private Fragment siteDetailsFragment;
    private FragmentManager mFragmentManager;
    private FragmentTransaction mFragmentTransaction;
    private Site site;
    private ViewGroup frameContainer;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_site);

        final ArrayList<Site> sites = new ArrayList<>();
        sites.add(new Site("Wynwood", "this is description for wynwood"));
        sites.add(new Site("Overtown", "this is description for overtown"));
        sites.add(new Site("Little Havana", "this is description for little havana"));
        sites.add(new Site("Opalaca City Hall", "this is description for opalaca"));

        final SiteAdapter customAdapter = new SiteAdapter(SiteActivity.this, sites);

        final ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(customAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Site site = sites.get(position);

                Bundle bundle = new Bundle();
                bundle.putString("name", sites.get(position).getName());
                bundle.putString("description", sites.get(position).getDescription());

                SiteDetailFragment siteDetailFragment = new SiteDetailFragment();
                siteDetailFragment.setArguments(bundle);

//                String siteName = site.getName();
//                String siteDescription = site.getDescription();
//
//                Intent intent = new Intent(SiteActivity.this, SiteDetailFragment.class);
//
//
//                startActivity(intent);
            }
        });

    }

}