package com.example.android.miamitour;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import static com.example.android.miamitour.SiteActivity.EXTRA_ADDRESS;
import static com.example.android.miamitour.SiteActivity.EXTRA_DESCRIPTION;
import static com.example.android.miamitour.SiteActivity.EXTRA_NAME;

public class SiteDetailFragment extends Fragment  {
    private Site site;
    String name;
    String address;
    String description;
    TextView detailNameTx;
    TextView descriptionTx;
    TextView addressTx;

    public static Fragment newInstance() {
        SiteDetailFragment siteDetailFragment = new SiteDetailFragment();
//        Bundle args = new Bundle();
//
//        args.putString("EXTRA_NAME", name);
//        siteDetailFragment.setArguments(args);
        return siteDetailFragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        name = getArguments().getString("EXTRA_NAME");
        address = getArguments().getString("EXTRA_ADDRESS");
        description = getArguments().getString("EXTRA_DESCRIPTION");
        //site = new Site(name, address, description);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_site_detail, container, false);

        detailNameTx = view.findViewById(R.id.site_location_name_text_view);
        addressTx = view.findViewById(R.id.site_address_name_text_view);
        descriptionTx = view.findViewById(R.id.site_description_text_view);

        detailNameTx.setText(name);
       addressTx.setText(address);
        descriptionTx.setText(description);
        return view;

    }

}




