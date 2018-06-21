package com.example.android.miamitour;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class DetailsFragment extends Fragment {

    private Site site;
    private TextView name;
    private TextView detailName;
    private TextView description;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Bundle bundle = getArguments();
        if(bundle !=null)
        {
            View view = inflater.inflate(R.layout.activity_site_detail, container, false);
            Site site = (Site)getArguments().getSerializable("siteLog");
            name = view.findViewById(R.id.site_location_name_text_view);
            description = view.findViewById(R.id.site_description_text_view);

            name.setText(site.getName());
            description.setText(site.getDescription());

            return view;
        }


        return inflater.inflate(R.layout.activity_site_detail,container, false);
    }
}
