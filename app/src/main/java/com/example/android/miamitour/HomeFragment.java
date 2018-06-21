package com.example.android.miamitour;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.android.miamitour.adapters.TabFragmentPagerAdapter;

public class HomeFragment extends Fragment implements View.OnClickListener {
    Button buttonToMap;
    Button buttonToLocations;
    private Fragment siteFragment;
    public static final String VIEWPAGER_FRAGMENT = "viewpager_fragment";

    @Override
    public View onCreateView(LayoutInflater inflater,
                                @Nullable ViewGroup container,
                                @Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_home);
        View view = inflater.inflate(R.layout.activity_home, container, false);

        buttonToMap = view.findViewById(R.id.button_to_map);
        buttonToLocations = view.findViewById(R.id.button_to_sites);
        buttonToLocations.setOnClickListener(this);
        buttonToMap.setOnClickListener(this);



    ViewPager viewPager = view.findViewById(R.id.viewpager);
    viewPager.setAdapter(new TabFragmentPagerAdapter(getChildFragmentManager(), this.getContext()));

    TabLayout tabLayout = (TabLayout) view.findViewById(R.id.tabLayout);
    tabLayout.setupWithViewPager(viewPager);
return view;
    }


    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.button_to_map:
                Intent i = new Intent(getContext(), MapsActivity.class);
                startActivity(i);
                // code for button when user clicks buttonOne.
                break;

            case R.id.button_to_sites:
                siteFragment = null;
                SiteFragment siteFragment = new SiteFragment();
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                getActivity().setTitle("Sites");
                fragmentTransaction.replace(R.id.frame, siteFragment);
                fragmentTransaction.commit();
                break;

            default:
                break;
        }


    }

}




