package com.zubchenok.crin.ui.activity;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.zubchenok.crin.R;
import com.zubchenok.crin.ui.adapter.RootPagerAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RootActivity extends AppCompatActivity {

    @BindView(R.id.root_tab_layout)
    public TabLayout tabLayout;

    @BindView(R.id.root_viewpager)
    public ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_root);
        ButterKnife.bind(this);

        RootPagerAdapter adapter = new RootPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
        setTabImages();
    }

    private void setTabImages() {
        tabLayout.getTabAt(0).setIcon(R.drawable.ic_investments);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_currencies);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_history);
    }
}
