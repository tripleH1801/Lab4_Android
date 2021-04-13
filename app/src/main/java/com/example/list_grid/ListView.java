package com.example.list_grid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class ListView extends AppCompatActivity {

    private android.widget.ListView listView;
    private CustomAdapter_ListView adt;
    private List<Product_ListView> listProduct;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        listProduct = new ArrayList<>();
        listProduct.add(new Product_ListView("Cá nấu lẩu, mì li mini, ola,...", "Shop Devang", R.drawable.ca_nau_lau));
        listProduct.add(new Product_ListView("Hiểu lòng con trẻ", "Shop Devang", R.drawable.hieu_long_con_tre));
        listProduct.add(new Product_ListView("Đồ chơi dạng mô hình", "Shop Devang", R.drawable.do_choi_dang_mo_hinh));
        listProduct.add(new Product_ListView("1 KG khô gà bơ tỏi....", "Shop Devang", R.drawable.ga_bo_toi));
        listProduct.add(new Product_ListView("Cá nấu lẩu, mì li mini, ola,...", "Shop Devang", R.drawable.ca_nau_lau));
        listProduct.add(new Product_ListView("Hiểu lòng con trẻ", "Shop Devang", R.drawable.hieu_long_con_tre));
        listProduct.add(new Product_ListView("Đồ chơi dạng mô hình", "Shop Devang", R.drawable.do_choi_dang_mo_hinh));
        listProduct.add(new Product_ListView("1 KG khô gà bơ tỏi....", "Shop Devang", R.drawable.ga_bo_toi));

        listView = findViewById(R.id.List_View);
        adt = new CustomAdapter_ListView(listProduct, R.layout.item_listview, this);
        listView.setAdapter(adt);
    }
}