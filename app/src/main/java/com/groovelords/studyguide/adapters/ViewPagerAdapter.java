package com.groovelords.studyguide.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.groovelords.studyguide.CoursesFragment;
import com.groovelords.studyguide.GraphFragment;

/**
 * Created by Shabab on 3/6/2017.
 */

public class ViewPagerAdapter  extends FragmentStatePagerAdapter {

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position == 0)
        {
            return new CoursesFragment();
        }
        return new GraphFragment();
    }

    @Override
    public int getCount() {
        return 2;
    }
}
