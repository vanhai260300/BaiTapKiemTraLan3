package com.example.thecoffeehouse;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class GirdViewBaseAdapter extends BaseAdapter {

    private List<OrderItem> list;
    private int layout;
    private LayoutInflater layoutInflater;
    private Context context;

    public GirdViewBaseAdapter(Context aContext,  List<OrderItem> listData) {
        this.context = aContext;
        this.list = listData;
        layoutInflater = LayoutInflater.from(aContext);
    }


    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    static   class  ViewHolder{
        ImageView image;
        TextView txtTitle,txtPrice;
    }
    @Override


    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = layoutInflater.inflate(R.layout.row_grid, null);
            holder = new ViewHolder();
            holder.image=(ImageView) convertView.findViewById(R.id.line_image);
            holder.txtTitle=(TextView) convertView.findViewById(R.id.line_title);
            holder.txtPrice=(TextView) convertView.findViewById(R.id.line_price);
            convertView.setTag(holder);

        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        OrderItem orderItem = this.list.get(position);
        holder.txtTitle.setText(orderItem.getTitle());
        holder.txtPrice.setText("" + orderItem.getPrice());

        int imageId = this.getMipmapResIdByName(orderItem.getImage());

        holder.image.setImageResource(imageId);

        return convertView;
    }

    // Find Image ID corresponding to the name of the image (in the directory mipmap).
    public int getMipmapResIdByName(int resName)  {
        String pkgName = context.getPackageName();

        // Return 0 if not found.
        int resID = context.getResources().getIdentifier(String.valueOf(resName), "mipmap", pkgName);
        return resID;
    }


}
