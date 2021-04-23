package com.example.viewpager;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    ViewPager2 mvp2;
    RecyclerView.Adapter myfsa;
    int NUM_ITEMS = 6; //18:30 in video
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mvp2 = findViewById(R.id.container);
        myfsa = new MyFragmentStateAdapter(this);
        mvp2.setAdapter(myfsa);
    }

    private class MyFragmentStateAdapter extends FragmentStateAdapter {

        public MyFragmentStateAdapter (@NonNull FragmentActivity fragmentActivity) {
            super (fragmentActivity);
        }

        @NonNull
        @Override
        public Fragment createFragment(int position) {
            return null;
        }

        @Override
        public int getItemCount() {
            return NUM_ITEMS;
        }
    }
}