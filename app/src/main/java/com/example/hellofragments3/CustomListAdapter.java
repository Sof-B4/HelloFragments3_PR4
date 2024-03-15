package com.example.hellofragments3;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;


public class CustomListAdapter extends ArrayAdapter<Item> {
    private LayoutInflater inflater;
    private int layout;
    private List<Item> items;
    public CustomListAdapter(Context context, int resource, List<Item> items) {
        super(context, resource, items);
        this.items = items;
        this.layout = resource;
        this.inflater = LayoutInflater.from(context);
    }
    public View getView(int position, View convertView, ViewGroup parent) {

        View view=inflater.inflate(this.layout, parent, false);

        TextView textView = view.findViewById(R.id.textView);
        ImageView imageView = view.findViewById(R.id.imageView);

        Item item = items.get(position);

        imageView.setImageResource(item.getItemImageResId());
        textView.setText(item.getItemName());

        return view;
    }
}