package com.example.admin.remindme.adapters;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.admin.remindme.Const;
import com.example.admin.remindme.adapters.fragments.CustomFragment;
import com.example.admin.remindme.adapters.fragments.FragmentBirthdays;
import com.example.admin.remindme.adapters.fragments.FragmentHistory;
import com.example.admin.remindme.adapters.fragments.FragmentIdeas;
import com.example.admin.remindme.adapters.fragments.FragmentTODO;

import java.util.HashMap;
import java.util.Map;

public class TabsFragmentAdapter extends FragmentPagerAdapter {

    private Map<Integer,CustomFragment> tabsName;
    private Context context;

    public TabsFragmentAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;
        initFragmentsOnMap();
    }

    @Override
    public Fragment getItem(int position) {
        return tabsName.get(position);
    }

    @Override
    public int getCount() {
        return tabsName.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return tabsName.get(position).getTitle();
    }

    private void initFragmentsOnMap (){
        tabsName = new HashMap<>();
        tabsName.put(Const.TAB_HISTORY_POSITION, FragmentHistory.getInstance(context));
        tabsName.put(Const.TAB_IDEAS_POSITION, FragmentIdeas.getInstance(context));
        tabsName.put(Const.TAB_TODO_POSITION, FragmentTODO.getInstance(context));
        tabsName.put(Const.TAB_BIRTHDAYS_POSITION, FragmentBirthdays.getInstance(context));
    }
}
