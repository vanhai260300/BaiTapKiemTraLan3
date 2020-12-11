package com.example.thecoffeehouse;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class Food extends Fragment {
    private View view;
    private orderScreen orderScreen;

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    public Food() {
    }
    public static Food newInstance(String param1, String param2) {
        Food fragment = new Food();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_food,container,false);
        recycle_list();
        return view;
    }
    public void recycle_list(){
        RecyclerView order_recycle=view.findViewById(R.id.thucuong_recycle);
        order_recycle.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager=new GridLayoutManager(orderScreen,2);
        order_recycle.setLayoutManager(linearLayoutManager);
        List<OrderItem> OrderItems = new ArrayList<>();
        OrderItems.add(new OrderItem("Cà phê sữa đá","50,000 đ",R.drawable.dr1));
        OrderItems.add(new OrderItem("Bặc xỉu","45,000 đ",R.drawable.dr2));
        OrderItems.add(new OrderItem("TRÀ ĐÀO CAM SẢ","45,000 đ",R.drawable.dr3));
        OrderItems.add(new OrderItem("CARAMEL MACCHIATO","55,000 đ",R.drawable.dr4));
        OrderItems.add(new OrderItem("MOCHA","49,000 đ",R.drawable.product_5));
        OrderItems.add(new OrderItem("CAPPUCCINO","45,000 đ",R.drawable.product_6));
        OrderItems.add(new OrderItem("Cà phê sữa đá","50,000 đ",R.drawable.dr1));
        OrderItems.add(new OrderItem("Bặc xỉu","45,000 đ",R.drawable.dr2));
        OrderItems.add(new OrderItem("TRÀ ĐÀO CAM SẢ","45,000 đ",R.drawable.dr3));
        OrderItems.add(new OrderItem("CARAMEL MACCHIATO","55,000 đ",R.drawable.dr4));
        OrderItems.add(new OrderItem("MOCHA","49,000 đ",R.drawable.product_5));
        OrderItems.add(new OrderItem("CAPPUCCINO","45,000 đ",R.drawable.product_6));
        OrderItems.add(new OrderItem("Cà phê sữa đá","50,000 đ",R.drawable.dr1));
        OrderItems.add(new OrderItem("Bặc xỉu","45,000 đ",R.drawable.dr2));
        OrderItems.add(new OrderItem("TRÀ ĐÀO CAM SẢ","45,000 đ",R.drawable.dr3));
        OrderItems.add(new OrderItem("CARAMEL MACCHIATO","55,000 đ",R.drawable.dr4));
        OrderItems.add(new OrderItem("MOCHA","49,000 đ",R.drawable.product_5));
        OrderItems.add(new OrderItem("CAPPUCCINO","45,000 đ",R.drawable.product_6));
        OrderItems.add(new OrderItem("Cà phê sữa đá","50,000 đ",R.drawable.dr1));
        OrderItems.add(new OrderItem("Bặc xỉu","45,000 đ",R.drawable.dr2));
        OrderItems.add(new OrderItem("TRÀ ĐÀO CAM SẢ","45,000 đ",R.drawable.dr3));
        OrderItems.add(new OrderItem("CARAMEL MACCHIATO","55,000 đ",R.drawable.dr4));
        OrderItems.add(new OrderItem("MOCHA","49,000 đ",R.drawable.product_5));
        OrderItems.add(new OrderItem("CAPPUCCINO","45,000 đ",R.drawable.product_6));


        OrderAdapter orderAdapter=new OrderAdapter(orderScreen, OrderItems,R.layout.row_grid);
        order_recycle.setAdapter(orderAdapter);
    }
}