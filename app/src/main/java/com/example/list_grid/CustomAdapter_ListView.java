package com.example.list_grid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

public class CustomAdapter_ListView extends BaseAdapter {
    private List<Product_ListView> listProduct;
    private int layout;
    private Context ctx;

    public CustomAdapter_ListView(List<Product_ListView> listProduct, int layout, Context ctx) {
        this.listProduct = listProduct;
        this.layout = layout;
        this.ctx = ctx;
    }

    @Override
    public int getCount() {
        return listProduct.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {

        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        view = LayoutInflater.from(ctx).inflate(layout, parent, false);
        TextView tvName = view.findViewById(R.id.tvName);
        TextView tvShopName = view.findViewById(R.id.tvShopName);
        ImageView img = view.findViewById(R.id.img);
        tvName.setText(listProduct.get(position).getName());
        tvShopName.setText(listProduct.get(position).getShopName());
        img.setImageResource(listProduct.get(position).getImg());
        return view;
    }
}
