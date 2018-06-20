package com.crycetruly.company;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Elia on 20/06/2018.
 */

public class Adapter extends FragmentPagerAdapter {
    public Adapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position==0){
            return new HomeFragment();
        }else if (position==1){
            return new ServicesFragment();
        }else if (position==2){
            return new AboutFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position==0){
            return "HOME";
        }else if (position==1){
            return "SERVICES";
        }else if (position==2){
            return "About";
        }
        return super.getPageTitle(position);
    }
}
