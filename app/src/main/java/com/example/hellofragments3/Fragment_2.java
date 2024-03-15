package com.example.hellofragments3;


import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentResultListener;

import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Fragment_2 extends Fragment {
    private static final String TAG = "MyApp";
    private int defaultValue = 0;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_2, container, false);
        return view;

    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        List<Item> items = new ArrayList<>();
        for (int i = 0; i <= 200; i++) {
            items.add(new Item(R.drawable.image, "Пандочка! (ListView)"));
        }

        ListView itemsList1 = view.findViewById(R.id.list1);
        CustomListAdapter adapter = new CustomListAdapter(getContext(), R.layout.list_item, items);
        itemsList1.setAdapter(adapter);

        itemsList1.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                Toast.makeText(getContext(),"Нажатие на элемент списка №" + position, Toast.LENGTH_LONG)
                        .show();
                Log.i(TAG, "Нажатие на элемент списка №" + position);
            } });
    }
}

