package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class ViewPagerAdapter extends FragmentStateAdapter {
    public ViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0: return new tab1();
            case 1: return new tab2();
            case 2: return new tab3();
            case 3: return new tab4();
            case 4: return new tab5();
            default: return new tab1();
        }
    }

    @Override
    public int getItemCount() {
        return 5;
    }
}
