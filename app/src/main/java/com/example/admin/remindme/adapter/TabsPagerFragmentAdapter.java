package com.example.admin.remindme.adapter;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.admin.remindme.adapter.fragment.ExampleFragment;

/**
 * Created by Admin on 10.02.2018.
 */

public class TabsPagerFragmentAdapter extends FragmentPagerAdapter {

    private String[] tabsName;

    public TabsPagerFragmentAdapter(FragmentManager fm) {
        super(fm);

        tabsName = new String[] {
                "Tab 1",
                "Напоминания",
                "Tab 3"
        };
    }

    @Override
    public Fragment getItem(int position) {
        Fragment result = null;

        switch (position){
            case 0:
                result = ExampleFragment.getInstance();
                break;
            case 1:
                result = ExampleFragment.getInstance();
                break;
            case 2:
                result = ExampleFragment.getInstance();
                break;
        }

        return result;
    }

    @Override
    public int getCount() {
        return tabsName.length;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return tabsName[position];
    }
}
