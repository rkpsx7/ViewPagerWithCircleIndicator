package com.example.viewpagerwithcircleindicator;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentFirst extends Fragment {

    public FragmentFirst() {
    }

    public static FragmentFirst newInstance() {
        FragmentFirst fragment = new FragmentFirst();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

}