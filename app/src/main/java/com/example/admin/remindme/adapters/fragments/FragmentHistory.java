package com.example.admin.remindme.adapters.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.admin.remindme.R;
import com.example.admin.remindme.adapters.RemindListAdapter;
import com.example.admin.remindme.dto.RemindDTO;

import java.util.ArrayList;
import java.util.List;

public class FragmentHistory extends CustomFragment {
    private static final int LAYOUT = R.layout.fragment_history;
    private static final String TAG = "FragmentHistory";

    public static FragmentHistory getInstance(Context context){
        Bundle args = new Bundle();
        FragmentHistory exampleFragment = new FragmentHistory();
        exampleFragment.setTitle(context.getString(R.string.tab_history));
        exampleFragment.setContext(context);
        exampleFragment.setArguments(args);

        return exampleFragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(LAYOUT,container,false);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView_history);
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        recyclerView.setAdapter(new RemindListAdapter(getList()));

        return view;
    }


    public List<RemindDTO> getList() {
        List<RemindDTO> list = new ArrayList<>();
        list.add(new RemindDTO("Title 1"));
        list.add(new RemindDTO("Title 2"));
        list.add(new RemindDTO("Title 3"));
        list.add(new RemindDTO("Title 4"));
        list.add(new RemindDTO("Title 5"));
        Log.i(TAG, "getList: list is created. Size is " + list.size());

        return list;
    }
}
