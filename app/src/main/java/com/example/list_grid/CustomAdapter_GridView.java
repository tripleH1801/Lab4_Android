package com.example.list_grid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.List;
import java.util.Locale;

public class CustomAdapter_GridView extends BaseAdapter {
    private List<Product_GridView> listProduct;
    private int layout;
    private Context ctx;

    public CustomAdapter_GridView(List<Product_GridView> listProduct, int layout, Context ctx) {
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
        TextView tvName = view.findViewById(R.id.tvNameGrid);
        TextView tvPrice = view.findViewById(R.id.tvPriceGrid);
        TextView tvDis = view.findViewById(R.id.tvDiscountGrid);
        TextView tvVote = view.findViewById(R.id.tvVoteGrid);
        ImageView img = view.findViewById(R.id.imgGrid);

        DecimalFormatSymbols dfs = new DecimalFormatSymbols(Locale.getDefault());
        dfs.setDecimalSeparator(',');
        dfs.setGroupingSeparator('.');
        DecimalFormat df = new DecimalFormat("#,### đ", dfs);

        tvName.setText(listProduct.get(position).getName());
        tvPrice.setText(df.format(listProduct.get(position).getPrice()));
        tvDis.setText("-"+String.valueOf(listProduct.get(position).getDiscount())+"%");
        tvVote.setText("("+String.valueOf(listProduct.get(position).getVote())+")");
        img.setImageResource(listProduct.get(position).getImg());
        return view;
    }
}
