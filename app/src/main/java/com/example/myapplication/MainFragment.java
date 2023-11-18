package com.example.myapplication;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class MainFragment extends Fragment {
    private RecyclerView rv_meals;
    private ArrayList<String> mealList = new ArrayList<>();


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rv_meals = requireActivity().findViewById(R.id.rv_meals);
        loadData();
        initAdapter();
    }
    private void loadData() {
        mealList.add("Pizza");
        mealList.add("Pelmeny");
        mealList.add("Salad");
        mealList.add("French fries");
        mealList.add("Pasta");
        mealList.add("Lagman");
        mealList.add("Soup");
        mealList.add("Kebap");
        mealList.add("Steak");
        mealList.add("Hamburger");
        mealList.add("Sandwich");
        mealList.add("Pancakes");
        mealList.add("Sushi");
        mealList.add("Fish");
    }

    private void initAdapter() {
        MealAdapter adapter = new MealAdapter(mealList);
        rv_meals.setAdapter(adapter);
    }
}