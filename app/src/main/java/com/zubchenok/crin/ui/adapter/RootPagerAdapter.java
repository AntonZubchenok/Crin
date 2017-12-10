package com.zubchenok.crin.ui.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.zubchenok.crin.ui.fragment.CurrenciesFragment;
import com.zubchenok.crin.ui.fragment.HistoryFragment;
import com.zubchenok.crin.ui.fragment.InvestmentsFragment;

import java.util.ArrayList;
import java.util.List;

public class RootPagerAdapter extends FragmentPagerAdapter {

    private final List<Fragment> fragmentList;

    public RootPagerAdapter(FragmentManager manager) {
        super(manager);

        fragmentList = new ArrayList<>();
        fragmentList.add(new InvestmentsFragment());
        fragmentList.add(new CurrenciesFragment());
        fragmentList.add(new HistoryFragment());
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }
}
