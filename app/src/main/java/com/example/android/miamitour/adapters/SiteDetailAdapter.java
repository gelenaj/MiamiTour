package com.example.android.miamitour.adapters;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.android.miamitour.R;
import com.example.android.miamitour.Site;

import java.util.ArrayList;

public class SiteDetailAdapter extends ArrayAdapter<Site> {

    public SiteDetailAdapter(Activity context, ArrayList<Site> sites) {
        super(context, 0, sites);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.activity_site_detail, parent, false);
        }

        Site currentSite = getItem(position);

        TextView siteTextView = (TextView) listItemView.findViewById(R.id.site_location_name_text_view);
        siteTextView.setText(currentSite.getName());

        TextView siteDescriptionTextView = (TextView) listItemView.findViewById(R.id.site_description_text_view);

        siteTextView.setText(currentSite.getDescription());

        return listItemView;
    }
}