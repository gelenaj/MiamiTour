package com.example.android.miamitour;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.android.miamitour.adapters.SiteAdapter;

import java.util.ArrayList;

import static com.example.android.miamitour.R.*;

public class SiteFragment extends Fragment {
    private Fragment detailsFragment;
    private FragmentManager mFragmentManager;
    private FragmentTransaction mFragmentTransaction;
    private Site site;
    private ViewGroup frameContainer;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.activity_site, container,false);


        final ArrayList<Site> sites = new ArrayList<>();
        sites.add(new Site("Wynwood", "this is description for wynwood"));
        sites.add(new Site("Overtown", "this is description for overtown"));
        sites.add(new Site("Little Havana", "this is description for little havana"));
        sites.add(new Site("Opalaca City Hall", "this is description for opalaca"));

        final SiteAdapter customAdapter = new SiteAdapter(getActivity(), sites);

        final ListView listView = (ListView) view.findViewById(R.id.list);

        listView.setAdapter(customAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    //Intent intent = new Intent(view.getContext(), WynwoodActivity.class);
                    Toast.makeText(getActivity(), "Wynwood clicked", Toast.LENGTH_SHORT).show();
//                    Site site = sites.get(position);
//                    String siteName = site.getName();
//
//                    String siteDescription = site.getDescription();
//
//                    intent.putExtra("name", siteName);
//                    intent.putExtra("description", siteDescription);
//                    startActivity(intent);
                }
                if (position == 1) {
                    Intent intent = new Intent(view.getContext(), OvertownActivity.class);
                    startActivity(intent);
                }
                if (position == 2) {
                    Intent intent = new Intent(view.getContext(), OvertownActivity.class);
                    startActivity(intent);
                }
                if (position == 3) {
                    Intent intent = new Intent(view.getContext(), OvertownActivity.class);
                    startActivity(intent);
                }
            }
        });
        return view;

        }



    }