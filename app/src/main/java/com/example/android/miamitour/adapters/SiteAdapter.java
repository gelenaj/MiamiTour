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

public class SiteAdapter extends ArrayAdapter<Site> {

    public SiteAdapter(Activity context, ArrayList<Site> sites) {
        super(context, 0, sites);
    }

    @NonNull
    @Override
    /**
     * Displays locations sent from SiteActivity.
     */
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.site_list_item, parent, false);
        }

        Site currentSite = getItem(position);

        TextView siteTextView = (TextView) listItemView.findViewById(R.id.site_name_text_view);
        siteTextView.setText(currentSite.getName());

        return listItemView;
    }
}