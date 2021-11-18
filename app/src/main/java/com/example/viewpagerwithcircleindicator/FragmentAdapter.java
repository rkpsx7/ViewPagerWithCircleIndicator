package com.example.viewpagerwithcircleindicator;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class FragmentAdapter extends FragmentStateAdapter {

    public FragmentAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return FragmentFirst.newInstance();
            case 1:
                return FragmentSecond.newInstance();
            case 2:
                return FragmentThird.newInstance();
            case 3:
                return FragmentFourth.newInstance();
        }
        return FragmentFirst.newInstance();
    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
