package com.example.android.miamitour;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.example.android.miamitour.adapters.SiteAdapter;

import java.util.ArrayList;

import static com.example.android.miamitour.adapters.SiteAdapter.*;

public class SiteActivity extends Activity implements OnItemClick {
    public static final String EXTRA_NAME = "name";
    public static final String EXTRA_ADDRESS = "address";
    public static final String EXTRA_DESCRIPTION = "description";


    private Fragment siteDetailsFragment;
    private RecyclerView mRecyclerView;
    private ArrayList<Site> mSites;
    private SiteAdapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private FragmentTransaction mFragmentTransaction;
    private Site site;
    private ViewGroup frameContainer;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_site);
        mRecyclerView = (RecyclerView) findViewById(R.id.list);

        mRecyclerView.setHasFixedSize(true);

        final ArrayList<Site> mSites = new ArrayList<>();
        mSites.add(new Site(getString(R.string.wynwood), "2520 NW 2nd Ave, Miami, FL 33127", "This is description for wynwood"));
        mSites.add(new Site(getString(R.string.overtown), "999 NW 1st Ave, Miami, FL 33136", "This is description for overtown"));
        mSites.add(new Site(getString(R.string.littleHavana), "806 SW 13th Ave, Miami, FL 33135", "This is description for little havana"));
        mSites.add(new Site(getString(R.string.opalackaCityHall), "780 Fisherman St, Opa-locka, FL 33054", "This is description for opalaca"));



        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        mAdapter = new SiteAdapter(this,mSites,this);
        mRecyclerView.setAdapter(mAdapter);
        //mAdapter.setOnItemClickListener(this);


    }

    @Override
    public void respond(String name, String address, String description) {

        Intent intent = new Intent(this, SiteDetailActivity.class);

        intent.putExtra(EXTRA_NAME, "testing again");

       // Log.d("valeTag", "***Value of name is :" + name );
        intent.putExtra(EXTRA_ADDRESS, "test");
        intent.putExtra(EXTRA_DESCRIPTION,"test");
        startActivity(intent);
    }

}