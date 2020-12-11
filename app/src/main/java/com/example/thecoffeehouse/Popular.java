package com.example.thecoffeehouse;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomsheet.BottomSheetDialog;

import java.util.ArrayList;
import java.util.List;

public class Popular extends Fragment {
    private View view;
    private orderScreen orderScreen;
    RecyclerView order_recycle;
    GridView gridView;
    GirdViewBaseAdapter adapter;
    ArrayList<OrderItem> arr_bean;


    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    public Popular() {
    }
    public static Popular newInstance(String param1, String param2) {
        Popular fragment = new Popular();
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
        view = inflater.inflate(R.layout.fragment_popular,container,false);

        recycle_list();
        Button button = (Button) view.findViewById(R.id.bt_dialog);
        button.setOnClickListener(view1 -> {
            Dialog dialog = new Dialog(getContext());
            dialog.setContentView(R.layout.dialog_oder);
            dialog.show();
        });
        return  view;
    }


    public void Dialog1(){

    }

    private  List<OrderItem> getListData() {
        List<OrderItem> list = new ArrayList<OrderItem>();
        OrderItem vietnam = new OrderItem("TRÀ OOLONG BƯỞI MẬT ONG", "50,000 đ", R.drawable.product_1);
        OrderItem usa = new OrderItem("TRÀ SỮA MẮC CA TRÂN CHÂU TRẮNG", "45,000 đ", R.drawable.product_2);
        OrderItem russia = new OrderItem("TRÀ SỮA MẮC CA TRÂN CHÂU TRẮNG", "45,000 đ", R.drawable.product_2);
        OrderItem australia = new OrderItem("TRÀ SỮA MẮC CA TRÂN CHÂU TRẮNG", "45,000 đ", R.drawable.product_2);
        OrderItem japan = new OrderItem("TRÀ SỮA MẮC CA TRÂN CHÂU TRẮNG", "45,000 đ", R.drawable.product_2);
        OrderItem vietnamm = new OrderItem("TRÀ SỮA MẮC CA TRÂN CHÂU TRẮNG", "45,000 đ", R.drawable.product_2);
        OrderItem usaa = new OrderItem("TRÀ SỮA MẮC CA TRÂN CHÂU TRẮNG", "45,000 đ", R.drawable.product_2);
        OrderItem russiaa = new OrderItem("TRÀ SỮA MẮC CA TRÂN CHÂU TRẮNG", "45,000 đ", R.drawable.product_2);
        OrderItem australiaa = new OrderItem("TRÀ SỮA MẮC CA TRÂN CHÂU TRẮNG", "45,000 đ", R.drawable.product_2);
        OrderItem japann = new OrderItem("TRÀ SỮA MẮC CA TRÂN CHÂU TRẮNG", "45,000 đ", R.drawable.product_2);

        list.add(vietnam);
        list.add(usa);
        list.add(russia);
        list.add(australia);
        list.add(japan);
        list.add(vietnamm);
        list.add(usaa);
        list.add(russiaa);
        list.add(australiaa);
        list.add(japann);

        return list;
    }

    private void homeData() {
        arr_bean.add(new OrderItem("TRÀ OOLONG BƯỞI MẬT ONG", "50,000 đ", R.drawable.product_1));
        arr_bean.add(new OrderItem("TRÀ SỮA MẮC CA TRÂN CHÂU TRẮNG", "45,000 đ", R.drawable.product_2));
        arr_bean.add(new OrderItem("TRÀ ĐÀO CAM SẢ", "45,000 đ", R.drawable.product_3));
        arr_bean.add(new OrderItem("CARAMEL MACCHIATO", "55,000 đ", R.drawable.product_4));
        arr_bean.add(new OrderItem("MOCHA", "49,000 đ", R.drawable.product_5));
        arr_bean.add(new OrderItem("CAPPUCCINO", "45,000 đ", R.drawable.product_6));
        arr_bean.add(new OrderItem("Socola Lúa Mạch Nóng", "69.000đ", R.drawable.product_7));
        arr_bean.add(new OrderItem("Socola Lúa Mạch Nóng", "69.000đ", R.drawable.product_9));
        arr_bean.add(new OrderItem("Socola Lúa Mạch Nóng", "69.000đ", R.drawable.product_10));
        arr_bean.add(new OrderItem("Socola Lúa Mạch Nóng", "69.000đ", R.drawable.product_11));
        arr_bean.add(new OrderItem("Socola Lúa Mạch Nóng", "69.000đ", R.drawable.product_10));
        arr_bean.add(new OrderItem("Socola Lúa Mạch Nóng", "69.000đ", R.drawable.product_10));
        arr_bean.add(new OrderItem("Socola Lúa Mạch Nóng", "69.000đ", R.drawable.product_10));
        arr_bean.add(new OrderItem("Socola Lúa Mạch Nóng", "69.000đ", R.drawable.product_11));
        arr_bean.add(new OrderItem("Socola Lúa Mạch Nóng", "69.000đ", R.drawable.product_10));
        arr_bean.add(new OrderItem("Socola Lúa Mạch Nóng", "69.000đ", R.drawable.product_10));
        arr_bean.add(new OrderItem("Socola Lúa Mạch Nóng", "69.000đ", R.drawable.coffee_2));
        arr_bean.add(new OrderItem("Socola Lúa Mạch Nóng", "69.000đ", R.drawable.coffee_1));
        arr_bean.add(new OrderItem("Socola Lúa Mạch Nóng", "69.000đ", R.drawable.coffee_2));
        arr_bean.add(new OrderItem("Socola Lúa Mạch Nóng", "69.000đ", R.drawable.coffee_2));
        arr_bean.add(new OrderItem("Socola Lúa Mạch Nóng", "69.000đ", R.drawable.coffee_1));
        //adapter = new GirdViewBaseAdapter(getContext(),arr_bean,R.layout.row_grid);
        gridView.setAdapter(adapter);
    }

    public void recycle_list(){
         order_recycle=view.findViewById(R.id.popular_recycle);
        order_recycle.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager=new GridLayoutManager(orderScreen,2);
        order_recycle.setLayoutManager(linearLayoutManager);
        List<OrderItem> OrderItems = new ArrayList<>();

        OrderItems.add(new OrderItem("Socola Lúa Mạch Nóng","69.000đ",R.drawable.pb1));
        OrderItems.add(new OrderItem("Socola Lúa Mạch Đá xay","69.000đ",R.drawable.pb2));
        OrderItems.add(new OrderItem("Cà phê Lúa Mạch Nóng","69.000đ",R.drawable.pb3));
        OrderItems.add(new OrderItem("Cà phế lúa mạch đá","69.000đ",R.drawable.pb4));
        OrderItems.add(new OrderItem("Mắc ca Socola","69.000đ",R.drawable.pb1));
        OrderItems.add(new OrderItem("Trà sữa mắc ca","69.000đ",R.drawable.product_10));
        OrderItems.add(new OrderItem("Socola Lúa Mạch Nóng","69.000đ",R.drawable.pb1));
        OrderItems.add(new OrderItem("Socola Lúa Mạch Đá xay","69.000đ",R.drawable.pb2));
        OrderItems.add(new OrderItem("Cà phê Lúa Mạch Nóng","69.000đ",R.drawable.pb3));
        OrderItems.add(new OrderItem("Cà phế lúa mạch đá","69.000đ",R.drawable.pb4));
        OrderItems.add(new OrderItem("Mắc ca Socola","69.000đ",R.drawable.pb1));
        OrderItems.add(new OrderItem("Socola Lúa Mạch Nóng","69.000đ",R.drawable.pb1));
        OrderItems.add(new OrderItem("Socola Lúa Mạch Đá xay","69.000đ",R.drawable.pb2));
        OrderItems.add(new OrderItem("Cà phê Lúa Mạch Nóng","69.000đ",R.drawable.pb3));
        OrderItems.add(new OrderItem("Cà phế lúa mạch đá","69.000đ",R.drawable.pb4));
        OrderItems.add(new OrderItem("Mắc ca Socola","69.000đ",R.drawable.pb1));
        OrderItems.add(new OrderItem("Socola Lúa Mạch Nóng","69.000đ",R.drawable.pb1));
        OrderItems.add(new OrderItem("Socola Lúa Mạch Đá xay","69.000đ",R.drawable.pb2));
        OrderItems.add(new OrderItem("Cà phê Lúa Mạch Nóng","69.000đ",R.drawable.pb3));
        OrderItems.add(new OrderItem("Cà phế lúa mạch đá","69.000đ",R.drawable.pb4));
        OrderItems.add(new OrderItem("Mắc ca Socola","69.000đ",R.drawable.pb1));
        OrderItems.add(new OrderItem("Socola Lúa Mạch Nóng","69.000đ",R.drawable.coffee_2));
        OrderItems.add(new OrderItem("Socola Lúa Mạch Nóng","69.000đ",R.drawable.coffee_2));
        OrderItems.add(new OrderItem("Socola Lúa Mạch Nóng","69.000đ",R.drawable.coffee_1));
        OrderAdapter orderAdapter=new OrderAdapter(orderScreen, OrderItems,R.layout.row_grid);
        order_recycle.setAdapter(orderAdapter);
    }
}