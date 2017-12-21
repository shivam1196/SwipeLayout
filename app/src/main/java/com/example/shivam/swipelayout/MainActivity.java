package com.example.shivam.swipelayout;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ViewPager mViewPager;
    List<Details> mDetails = new ArrayList<>();
    Details details,details1,details2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mViewPager=(ViewPager)findViewById(R.id.viewpager);
         details = new Details();
        details.setName("Shivam");
        details.setTitle("Srivastava");
         details1 = new Details();
        details1.setTitle("Susheem");
        details1.setName("Kashyap");
         details2 = new Details();
        details2.setName("Ashi");
        details2.setTitle("Agarwal");
        mDetails.add(details);
        mDetails.add(details1);
        mDetails.add(details2);
        FragmentManager fragmentManager = getSupportFragmentManager();
        mViewPager.setAdapter(new FragmentStatePagerAdapter(fragmentManager) {
            @Override
            public Fragment getItem(int position) {
                Details details3= mDetails.get(position);
                return SwipeFragment.getName(details3.getName(),details3.getTitle());
            }

            @Override
            public int getCount() {
                return mDetails.size();
            }
        });

    }
}
