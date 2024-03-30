package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NavigationRes;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AdapterName extends RecyclerView.Adapter<NameViewHolder> {

    String[] names = {};
    int[] ids = {};

    public AdapterName() {
        TempListItem tempListItem = new TempListItem();
        names = tempListItem.getName();
        ids = tempListItem.getAvatar();
    }

    @NonNull
    @Override
    public NameViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recyclerview_item, parent, false);

        return new NameViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NameViewHolder holder, int position) {
        holder.setItems(names[position], ids[position]);
    }

    @Override
    public int getItemCount() {
        return names.length;
    }


}
