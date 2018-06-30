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
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

import static com.example.android.miamitour.SiteActivity.EXTRA_ADDRESS;
import static com.example.android.miamitour.SiteActivity.EXTRA_DESCRIPTION;
import static com.example.android.miamitour.SiteActivity.EXTRA_NAME;


public class SiteDetailActivity extends AppCompatActivity {
    /*
    * Host activity got SiteDetailFragment.
    * */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_site_detail);

        Intent intent = getIntent();
        if (intent.hasExtra(EXTRA_NAME) && intent.hasExtra(EXTRA_ADDRESS) && intent.hasExtra(EXTRA_DESCRIPTION)) {

            String name = intent.getStringExtra(EXTRA_NAME);
            String address = intent.getStringExtra(EXTRA_ADDRESS);
            String description = intent.getStringExtra(EXTRA_DESCRIPTION);

//            TextView nameTx = findViewById(R.id.site_name_text_view);
//            TextView addressTx = findViewById(R.id.site_address_name_text_view);
//            TextView descriptionTx = findViewById(R.id.site_description_text_view);

            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_NAME", name);
            bundle.putString("EXTRA_ADDRESS", address);
            bundle.putString("EXTRA_DESCRIPTION", description);

            android.support.v4.app.Fragment siteDetailFragment = SiteDetailFragment.newInstance();
            siteDetailFragment.setArguments(bundle);

            android.support.v4.app.FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.add(R.id.fragment_site_detail, siteDetailFragment);
            ft.commit();
        }

    }
}
