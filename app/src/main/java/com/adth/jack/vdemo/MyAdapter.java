package com.adth.jack.vdemo;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jack on 2017/9/3.
 */

public class MyAdapter extends FragmentPagerAdapter {
    private final List<Fragment> fragments_list = new ArrayList<>();
    private final List<String> fragments_title = new ArrayList<>();
    public MyAdapter(FragmentManager fm){
        super(fm);
    }

    public void add(Fragment fragment,String title)
    {
        fragments_list.add(fragment);
        fragments_title.add(title);
    }

    public void add(Fragment fragment)
    {
        add(fragment,"");
    }

    @Override
    public int getCount() {
        return fragments_list.size();
    }

    @Override
    public Fragment getItem(int position) {
        return fragments_list.get(position);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return fragments_title.get(position);
    }
}
