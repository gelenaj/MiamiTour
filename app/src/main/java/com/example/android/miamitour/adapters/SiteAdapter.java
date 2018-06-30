package com.example.android.miamitour.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.android.miamitour.R;
import com.example.android.miamitour.Site;

import java.util.ArrayList;

public class SiteAdapter extends RecyclerView.Adapter<SiteAdapter.ViewHolder>{
    private ArrayList<Site> sites;
    private Context ctx;
    private OnItemClick mOnItemClick;
    private LayoutInflater inflator;

    public interface OnItemClick {
        void respond(String name, String address, String description);
    }





    @Override
    public SiteAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.site_list_item, parent, false);

        ViewHolder holder = new ViewHolder(v, mOnItemClick);
        return holder;
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView mSiteNameTextView;
        TextView mSiteAddress;
        TextView mSitesDescription;
        OnItemClick mOnItemClick;


        public ViewHolder(View v, OnItemClick onItemClick) {
            super(v);
            mSiteAddress = v.findViewById(R.id.site_address_name_text_view);
            mSitesDescription = v.findViewById(R.id.site_description_text_view);
            mSiteNameTextView = v.findViewById(R.id.site_name_text_view);
            mOnItemClick = onItemClick;
            v.setOnClickListener(this);
        }



        @Override
        public void onClick(View v) {

            mOnItemClick.respond(sites.get(getAdapterPosition()).mName,sites.get(getAdapterPosition()).mAddress, sites.get(getAdapterPosition()).mDescription);

        }
    }


    public SiteAdapter(Context mContext, ArrayList<Site> sites, OnItemClick onItemClick) {
        inflator = LayoutInflater.from(mContext);
        this.sites = sites;
        this.mOnItemClick = onItemClick;
    }

    @Override
    public void onBindViewHolder(@NonNull SiteAdapter.ViewHolder holder, int position) {
        Site site = sites.get(position);
        holder.mSiteNameTextView.setText(site.getName());

    }
        @Override
        public int getItemCount () {
            return sites.size();
        }
    }
