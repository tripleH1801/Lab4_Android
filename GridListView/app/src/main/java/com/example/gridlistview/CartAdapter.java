package com.example.gridlistview;

import android.content.Context;
import android.content.Intent;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import java.util.List;

public class CartAdapter extends BaseAdapter{
    Context ctx;
    int layout;
    private List<Product> listProduct;
    private List<String> listSize;
    private List<Integer> listQuantity;
    private int quantity;
    private Intent intent;

    Fragment fragment_listItem;

    public CartAdapter(Context ctx, int layout, List<Product> listProduct, List<String> listSize, List<Integer> listQuantity) {
        this.ctx = ctx;
        this.layout = layout;
        this.listProduct = listProduct;
        this.listSize = listSize;
        this.listQuantity = listQuantity;
    }

    @Override
    public int getCount() {
        return listProduct.size();
    }

    @Override
    public Object getItem(int position) {
        return listProduct.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {

        view = LayoutInflater.from(ctx).inflate(layout, parent, false);


        TextView tvName = view.findViewById(R.id.tvNameCart);
        TextView tvPrice = view.findViewById(R.id.tvPriceCart);
        TextView tvSize = view.findViewById(R.id.tvSizeCart);
        ImageView img = view.findViewById(R.id.imageViewCart);
        TextView tvQuantity = view.findViewById(R.id.tvQuantity);
        //thieu thuế

        quantity = 0;

        tvName.setText(listProduct.get(position).getName());
        tvSize.setText(listSize.get(position));
        tvPrice.setText(String.valueOf(listProduct.get(position).getPrice()));
        tvQuantity.setText(String.valueOf(listQuantity.get(position)));
        img.setImageResource(listProduct.get(position).getImg());


        ImageButton btnAdd = view.findViewById(R.id.imgbtnAdd);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quantity = Integer.parseInt(tvQuantity.getText().toString());
                quantity ++;
                tvQuantity.setText(String.valueOf(quantity));
            }
        });
        ImageButton btnMinus = view.findViewById(R.id.imgbtnMinus);
        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quantity = Integer.parseInt(tvQuantity.getText().toString());
                quantity --;
                tvQuantity.setText(String.valueOf(quantity));
            }
        });
        return view;
    }
}
