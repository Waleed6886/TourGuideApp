package com.example.waleed.tourguideapp;

import android.graphics.Color;
import android.os.Build;
import android.support.design.widget.TabLayout;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    public void init() {
        ViewPager viewPager = (ViewPager) findViewById(R.id.pager);
        final CitiesAdapter adapter = new CitiesAdapter(getSupportFragmentManager(), this);
        viewPager.setAdapter(adapter);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        tabLayout.setBackgroundColor(Color.WHITE);
        tabLayout.setupWithViewPager(viewPager);

        final int drawables[] = new int[]{
                R.drawable.event,
                R.drawable.location,
                R.drawable.info,
                R.drawable.restaurant,
        };

        for (int i = 0; i < tabLayout.getTabCount(); i++) {
            tabLayout.getTabAt(i).setIcon(drawables[i]);
        }

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
                @Override
                public void onTabSelected(TabLayout.Tab tab) {
                    switch (tab.getPosition()) {
                        case 0:
                            if (adapter.getEventFragment().getView() != null)
                                animateView(adapter.getEventFragment().getView());
                            changeStatusBarColor(R.color.colorPrimaryDark);
                            getSupportActionBar().setBackgroundDrawable(getResources().getDrawable(R.drawable.blue, null));
                            break;
                        case 1:
                            if (adapter.getHistoricalSiteFragment().getView() != null)
                                animateView(adapter.getHistoricalSiteFragment().getView());
                            changeStatusBarColor(R.color.darkRed);
                            getSupportActionBar().setBackgroundDrawable(getResources().getDrawable(R.drawable.red, null));
                            break;
                        case 2:
                            if (adapter.getCityInformationFragment().getView() != null)
                                animateView(adapter.getCityInformationFragment().getView());
                            changeStatusBarColor(R.color.darkGreen);
                            getSupportActionBar().setBackgroundDrawable(getResources().getDrawable(R.drawable.green, null));
                            break;
                        case 3:
                            if (adapter.getRestaurantFragment().getView() != null)
                                animateView(adapter.getRestaurantFragment().getView());
                            changeStatusBarColor(R.color.darkYellow);
                            getSupportActionBar().setBackgroundDrawable(getResources().getDrawable(R.drawable.yellow, null));
                            break;
                    }
                }

                @Override
                public void onTabUnselected(TabLayout.Tab tab) {

                }

                @Override
                public void onTabReselected(TabLayout.Tab tab) {

                }
            });
        }
    }

    private void changeStatusBarColor(int color) {
        Window window = getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.setStatusBarColor(ContextCompat.getColor(this, color));

    }

    private void animateView(View v) {
        v.setAlpha(0);
        v.animate().alpha(1).setDuration(700);
    }
}

