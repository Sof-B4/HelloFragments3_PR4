package com.example.hellofragments3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.util.Log;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CustomRecyclerViewAdapter  extends
        RecyclerView.Adapter< CustomRecyclerViewAdapter.ViewHolder>{

    private static final String TAG = "MyApp";
    private final LayoutInflater inflater;
    private final List<Item> items;
    CustomRecyclerViewAdapter(Context context, List<Item> items) {
        this.items = items;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public CustomRecyclerViewAdapter.ViewHolder
    onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.list_item, parent,
                false);
        return new ViewHolder(view);
    }

    @Override
    public void
    onBindViewHolder(CustomRecyclerViewAdapter.ViewHolder
                             holder, int position) {
        Item item = items.get(position);
        holder.textView.setText(item.getItemName());
        holder.imageView.setImageResource(item.getItemImageResId());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(holder.itemView.getContext(),"Нажатие на элемент списка" +
                        holder.getAdapterPosition(), Toast.LENGTH_LONG).show();
                Log.i(TAG, "Нажатие на элемент списка" + holder.getAdapterPosition());
            }
        });

    }
    @Override
    public int getItemCount() {
        return items.size();
    }
    public static class ViewHolder extends RecyclerView.ViewHolder {
        final TextView textView;
        final ImageView imageView;
        ViewHolder(View view){
            super(view);
            textView = view.findViewById(R.id.textView);
            imageView = view.findViewById(R.id.imageView);
        }
    }
}