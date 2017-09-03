package com.adth.jack.vdemo;

import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private static final String TAG = "MainActivity";
    private final String title_array[] = {"Left","Right"};
    private ViewPager viewPager;
    private FragmentPagerAdapter fragmentPagerAdapter;
    private MyAdapter m_adapter;
    private TabLayout tabs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = (ViewPager) findViewById(R.id.viewpager);
        m_adapter = new MyAdapter( getSupportFragmentManager() );
        m_adapter.add( new LeftFragment(),getString(R.string.first_fragment_title) );
        m_adapter.add( new RightFragment(), getString(R.string.second_fragment_title) );
//        m_adapter.add( new BlankFragment(),"just for testing");
        viewPager.setAdapter(m_adapter);
        viewPager.addOnPageChangeListener( new ViewPager.OnPageChangeListener()
        {
            @Override
            public void onPageScrollStateChanged( int state )
            {
                //DO NOTHING
            }

            @Override
            public void onPageScrolled( int position, float positionOffset, int positionOffsetPixels )
            {
                //DO NOTHING
            }

            @Override
            public void onPageSelected( int position )
            {
            }
        });

        tabs = (TabLayout) findViewById(R.id.tab);
        tabs.setupWithViewPager(viewPager);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
        }
    }
}
