package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MealAdapter extends RecyclerView.Adapter<MealViewHolder> {
    private ArrayList<String> mealList;
    public MealAdapter(ArrayList<String> mealList) {
        this.mealList = mealList;
    }

    @NonNull
    @Override
    public MealViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MealViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_meal,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MealViewHolder holder, int position) {
        holder.bind(mealList.get(position));

    }

    @Override
    public int getItemCount() {
        return mealList.size() ;
    }
}
