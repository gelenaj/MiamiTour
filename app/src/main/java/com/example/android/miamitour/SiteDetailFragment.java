package com.example.android.miamitour;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import static com.example.android.miamitour.R.layout.activity_site_detail;

public class SiteDetailFragment extends Fragment {
    private Site site;
    TextView name;
    TextView detailNameTx;
    TextView descriptionTx;


    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_site_detail,container, false );

        String name = getArguments().getString("name");
        String description = getArguments().getString("description");

        detailNameTx = view.findViewById(R.id.site_location_name_text_view);
        descriptionTx = view.findViewById(R.id.site_description_text_view);

        detailNameTx.setText(name);
        detailNameTx.setText(description);

        return  inflater.inflate(R.layout.activity_site_detail, container, false );


    }

}




