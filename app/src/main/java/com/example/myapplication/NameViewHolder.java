package com.example.myapplication;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class NameViewHolder extends RecyclerView.ViewHolder {

    private ImageView imageview_item;
    private TextView textview_item;

    public NameViewHolder(@NonNull View itemView) {
        super(itemView);
        imageview_item = itemView.findViewById(R.id.imageview_item);
        textview_item = itemView.findViewById(R.id.textview_item);

    }

    public void setItems(String name, int imageId) {
        textview_item.setText(name);
        imageview_item.setImageResource(imageId);
        imageview_item.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), name, Toast.LENGTH_SHORT).show();
            }
        });
    }


}

