package com.example.viewpagerwithcircleindicator;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentFourth extends Fragment {

    public FragmentFourth() {
        // Required empty public constructor
    }

    public static FragmentFourth newInstance() {
        FragmentFourth fragment = new FragmentFourth();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_fourth, container, false);
    }
}