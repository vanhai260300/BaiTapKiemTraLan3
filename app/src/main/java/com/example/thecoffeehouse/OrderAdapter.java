package com.example.thecoffeehouse;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class OrderAdapter extends RecyclerView.Adapter<OrderAdapter.orderViewholder>{
        Context context;
        int row_layout;
        List<OrderItem> itemList;
        Dialog dialog;

        public OrderAdapter(Context context, List<OrderItem> itemList, int row_layout) {
            this.context = context;
            this.itemList = itemList;
            this.row_layout=row_layout;
        }

    @NonNull
    @Override
    public orderViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View itemView =layoutInflater.inflate(row_layout,parent,false);






        return new orderViewholder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull orderViewholder holder, int position) {
        holder.image.setImageResource(itemList.get(position).getImage());
        holder.title.setText(itemList.get(position).getTitle());
        holder.price.setText(itemList.get(position).getPrice());



        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
    public void Dialog1(){
        Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.dialog_oder);
        dialog.show();
    }


    @Override
    public int getItemCount() {
        return itemList.size();
    }

    public static final class orderViewholder extends RecyclerView.ViewHolder  {

            ImageView image;
            TextView title,price;

            public orderViewholder(@NonNull View itemView) {
                super(itemView);
                image=itemView.findViewById(R.id.line_image);
                title=itemView.findViewById(R.id.line_title);
                price=itemView.findViewById(R.id.line_price);
            }
        }
    }

