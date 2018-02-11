package com.example.admin.remindme.adapter.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.admin.remindme.R;

public class FragmentIdeas extends CustomFragment {
    private static final int LAYOUT = R.layout.fragment_example;

    public static FragmentIdeas getInstance(Context context){
        Bundle args = new Bundle();
        FragmentIdeas exampleFragment = new FragmentIdeas();
        exampleFragment.setTitle(context.getString(R.string.tab_ideas));
        exampleFragment.setArguments(args);

        return exampleFragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(LAYOUT,container,false);
    }
}
