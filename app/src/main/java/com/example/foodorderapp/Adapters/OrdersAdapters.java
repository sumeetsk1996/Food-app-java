package com.example.foodorderapp.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.foodorderapp.Modelss.OrdersModel;
import com.example.foodorderapp.R;

import java.util.ArrayList;

public class OrdersAdapters extends RecyclerView.Adapter<OrdersAdapters.viewHolder>{

    ArrayList<OrdersModel>list;
    Context context;

    public OrdersAdapters(ArrayList<OrdersModel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.order_sample,parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {

        final OrdersModel model=list.get(position);
        holder.orderImage.setImageResource(model.getOrderImage());
        holder.soldItemName.setText(model.getSoldItemName());
        holder.orderNumber.setText(model.getOrderNumber());
        holder.price.setText(model.getPrice());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        ImageView orderImage;
        TextView soldItemName,orderNumber,price;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            orderImage=itemView.findViewById(R.id.orderimage);
            soldItemName=itemView.findViewById(R.id.orderitemName);
            orderNumber=itemView.findViewById(R.id.orderNumber);
            price=itemView.findViewById(R.id.orderPrice1);
        }
    }
}