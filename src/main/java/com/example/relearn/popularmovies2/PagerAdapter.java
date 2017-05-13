package com.example.relearn.popularmovies2;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.relearn.popularmovies2.tabs.*;

public class PagerAdapter extends FragmentStatePagerAdapter {

    int mNumOfTabs;

    public PagerAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                OverviewFragment tab1 = new OverviewFragment();
                return tab1;
            case 1:
                TrailerFragment tab2 = new TrailerFragment();
                return tab2;
            case 2:
                ReviewFragment tab3 = new ReviewFragment();
                return tab3;
            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }

}
