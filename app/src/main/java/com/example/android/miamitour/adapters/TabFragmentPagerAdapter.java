package com.example.android.miamitour.adapters;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.android.miamitour.AboutFragment;
import com.example.android.miamitour.TourOverviewFragment;
import com.example.android.miamitour.WelcomeFragment;

public class TabFragmentPagerAdapter extends android.support.v4.app.FragmentPagerAdapter {
    final int PAGE_COUNT = 3;
    private String tabTitles[] = new String[] {"Welcome", "About", "Tour Overview" };
    private Context context;

    final AboutFragment aboutFragment = new AboutFragment();
    final TourOverviewFragment tourOverviewFragment = new TourOverviewFragment();
    final WelcomeFragment welcomeFragment = new WelcomeFragment();

    public TabFragmentPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return welcomeFragment;
            case 1:
                return aboutFragment;
            case 2:
                return tourOverviewFragment;
            default:
                return null;
        }
    }
        @Override
        public CharSequence getPageTitle(int position){
            // Generate title based on item position
            return tabTitles[position];
        }
    }

