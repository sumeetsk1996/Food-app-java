package com.example.foodorderapp.Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.foodorderapp.Modelss.MainModel;
import com.example.foodorderapp.R;
import com.example.foodorderapp.detailsActivity;

import java.util.ArrayList;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.viewHolder>{
    ArrayList<MainModel> list;
    Context context;

    public MainAdapter(ArrayList<MainModel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.sample_mainfood,parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {

        final MainModel model=list.get(position);
        holder.foodImage.setImageResource(model.getImage());
        holder.mainName.setText(model.getName());
        holder.price.setText(model.getPrice());
        holder.description.setText(model.getDescription());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(context, detailsActivity.class);
                intent.putExtra("image",model.getImage());
                intent.putExtra("price",model.getPrice());
                intent.putExtra("desc",model.getDescription());
                intent.putExtra("name",model.getName());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {

        ImageView foodImage;
        TextView mainName,price,description;
        public viewHolder(@NonNull View itemView) {
            super(itemView);


            foodImage=itemView.findViewById(R.id.imageView);
            mainName=itemView.findViewById(R.id.name);
            price=itemView.findViewById(R.id.orderPrice);
            description=itemView.findViewById(R.id.description);
        }
    }
}
