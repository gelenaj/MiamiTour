package com.example.android.miamitour;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class SiteDetailFragment extends Fragment {
    private Site site;
    TextView name;
    TextView detailNameTx;
    TextView descriptionTx;
    TextView addressTx;

    public static Fragment newInstance() {
        SiteDetailFragment siteDetailFragment = new SiteDetailFragment();
        return siteDetailFragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String name = getArguments().getString(getString(R.string.name));
        String address = getArguments().getString(getString(R.string.address));
        String description = getArguments().getString(getString(R.string.description));
        site = new Site(name, address, description);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_site_detail, container, false);

        detailNameTx = view.findViewById(R.id.site_location_name_text_view);
        addressTx = view.findViewById(R.id.site_address_name_text_view);
        descriptionTx = view.findViewById(R.id.site_description_text_view);

        detailNameTx.setText(site.getName());
        addressTx.setText(site.getAddress());
        descriptionTx.setText(site.getDescription());
        return view;

    }

}




