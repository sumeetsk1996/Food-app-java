package com.example.foodorderapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.example.foodorderapp.Adapters.OrdersAdapters;
import com.example.foodorderapp.Modelss.OrdersModel;
import com.example.foodorderapp.databinding.ActivityOrderBinding;

import java.util.ArrayList;

public class OrderActivity extends AppCompatActivity {
    ActivityOrderBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityOrderBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ArrayList<OrdersModel>list=new ArrayList<>();
        list.add(new OrdersModel(R.drawable.burgur8,"Cheese Burger","4","10"));
        list.add(new OrdersModel(R.drawable.burgur9,"Portobello Mushroom Burger","3","11"));
        list.add(new OrdersModel(R.drawable.burgur10,"Beef Burger","5","12"));
        list.add(new OrdersModel(R.drawable.burgur16,"Wild Salmon Burger","5.5","13"));
        list.add(new OrdersModel(R.drawable.burgur12,"Bison Burger","6","14"));
        list.add(new OrdersModel(R.drawable.burgur13,"Turkey Burger","6.5","15"));
        list.add(new OrdersModel(R.drawable.burgur14,"Veggie Burger","7","16"));
        list.add(new OrdersModel(R.drawable.burgur15,"Elk Burger","7.5","17"));


        OrdersAdapters adapter =new OrdersAdapters(list,this);
        binding.orderRecyclerView.setAdapter(adapter);

        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        binding.orderRecyclerView.setLayoutManager(layoutManager);

    }
}