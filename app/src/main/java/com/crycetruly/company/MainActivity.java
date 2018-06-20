package com.crycetruly.company;

import android.support.design.widget.TabLayout;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
private TabLayout tabLayout;
private ViewPager viewPager;
private PagerAdapter pagerAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pagerAdapter=new Adapter(getSupportFragmentManager());
        tabLayout=findViewById(R.id.tabs);
        viewPager=findViewById(R.id.pager);
        tabLayout.setupWithViewPager(viewPager);
        viewPager.setAdapter(pagerAdapter);

        getSupportActionBar().setTitle("Cordinex");
    }
}
