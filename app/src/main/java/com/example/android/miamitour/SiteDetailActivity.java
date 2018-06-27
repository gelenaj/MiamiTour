package com.example.android.miamitour;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;


public class SiteDetailActivity extends AppCompatActivity {
    /*
    * Host activity got SiteDetailFragment.
    * */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_site_detail);

        Intent intent = getIntent();
        if (intent.hasExtra(getString(R.string.name)) && intent.hasExtra(getString(R.string.address)) && intent.hasExtra(getString(R.string.description))) {

            String name = intent.getStringExtra(getString(R.string.name));
            String address = intent.getStringExtra(getString(R.string.address));
            String description = intent.getStringExtra(getString(R.string.description));

            Bundle bundle = new Bundle();
            bundle.putString(getString(R.string.name), name);
            bundle.putString(getString(R.string.address), address);
            bundle.putString(getString(R.string.description), description);

            android.support.v4.app.Fragment siteDetailFragment = SiteDetailFragment.newInstance();
            siteDetailFragment.setArguments(bundle);

            android.support.v4.app.FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.add(R.id.fragment_site_detail, siteDetailFragment);
            ft.commit();
        }

    }
}
