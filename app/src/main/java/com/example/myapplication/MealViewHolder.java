package com.example.myapplication;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MealViewHolder extends RecyclerView.ViewHolder {
    private TextView menuName;
    public MealViewHolder(@NonNull View itemView) {
        super(itemView);
        menuName = itemView.findViewById(R.id.menu_name);
    }
    public void bind(String name ){
        menuName.setText(name);
    }
}
