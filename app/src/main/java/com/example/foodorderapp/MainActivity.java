package com.example.foodorderapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.foodorderapp.Adapters.MainAdapter;
import com.example.foodorderapp.Modelss.MainModel;
import com.example.foodorderapp.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

   ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ArrayList<MainModel> list=new ArrayList<>();

        list.add(new MainModel(R.drawable.burgur3,"Burger","15","Cheesy Veggie Burger with Fries"));
        list.add(new MainModel(R.drawable.pizza2,"Pizza","10"," BBQ Chicken Pizza"));
        list.add(new MainModel(R.drawable.coffie1,"Coffee","14","Double Espresso Coffee"));
        list.add(new MainModel(R.drawable.prawnpasta,"Prawns Pasta","17","Creamy Tomato Garlic Butter Shrimp Pasta"));
        list.add(new MainModel(R.drawable.pasta1,"Yellow Pasta","19","Cheese yellow macaroni pasta"));

        MainAdapter adapter=new MainAdapter(list,this);
        binding.recyclerView.setAdapter(adapter);

        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        binding.recyclerView.setLayoutManager(layoutManager);

    }
}