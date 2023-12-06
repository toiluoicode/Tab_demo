package com.example.myapplication5;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class FragmentAdapter extends FragmentStateAdapter {
    private int nNumberTabs;

    public FragmentAdapter(@NonNull FragmentActivity fragmentActivity, int nNumberTabs) {

        super(fragmentActivity);
        this.nNumberTabs = nNumberTabs;
    }

    public FragmentAdapter(@NonNull Fragment fragment, int nNumberTabs) {
        super(fragment);
        this.nNumberTabs = nNumberTabs;
    }

    public FragmentAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle, int nNumberTabs) {
        super(fragmentManager, lifecycle);
        this.nNumberTabs = nNumberTabs;
    }

    public FragmentAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    public FragmentAdapter(@NonNull Fragment fragment) {
        super(fragment);
    }

    public FragmentAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new BlankFragment1();
            case 2:
                return new BlankFragment2();
            case 3:
                return new BlankFragment3();
            default:
                return null;
        }

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
