package com.example.admin.remindme.adapters.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.admin.remindme.R;

public class FragmentBirthdays extends CustomFragment {
    private static final int LAYOUT = R.layout.fragment_example;

    public static FragmentBirthdays getInstance(Context context){
        Bundle args = new Bundle();
        FragmentBirthdays exampleFragment = new FragmentBirthdays();
        exampleFragment.setTitle(context.getString(R.string.tab_birthdays));
        exampleFragment.setArguments(args);

        return exampleFragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(LAYOUT,container,false);
    }
}
