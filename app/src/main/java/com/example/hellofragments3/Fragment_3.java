package com.example.hellofragments3;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentResultListener;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Fragment_3 extends Fragment {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_3, container, false);
        return view;
    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        List<Item> items2 = new ArrayList<>();
        for (int i = 0; i <= 200; i++) {
            items2.add(new Item(R.drawable.image2, "Лапка! (RecyclerView)"));
        }

        RecyclerView itemsList2 = view.findViewById(R.id.list2);
        CustomRecyclerViewAdapter adapter = new CustomRecyclerViewAdapter(getContext(), items2);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity().getApplicationContext());
        itemsList2.setLayoutManager(layoutManager);
        itemsList2.setAdapter(adapter);



    }
}