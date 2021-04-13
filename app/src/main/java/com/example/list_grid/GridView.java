package com.example.list_grid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class GridView extends AppCompatActivity {

    private List<Product_GridView> listProduct;
    private CustomAdapter_GridView adt;
    private android.widget.GridView gridView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);
        listProduct = new ArrayList<>();
        listProduct.add(new Product_GridView("Cáp chuyển từ Cổng USB sang PS2...", 15, 69900, 39, R.drawable.giacchuyen_1));
        listProduct.add(new Product_GridView("Cáp chuyển từ Cổng USB sang PS2...", 15, 69900, 39, R.drawable.giacchuyen_1));
        listProduct.add(new Product_GridView("Cáp chuyển từ Cổng USB sang PS2...", 15, 69900, 39, R.drawable.giacchuyen_1));
        listProduct.add(new Product_GridView("Cáp chuyển từ Cổng USB sang PS2...", 15, 69900, 39, R.drawable.giacchuyen_1));
        listProduct.add(new Product_GridView("Cáp chuyển từ Cổng USB sang PS2...", 15, 69900, 39, R.drawable.giacchuyen_1));
        listProduct.add(new Product_GridView("Cáp chuyển từ Cổng USB sang PS2...", 15, 69900, 39, R.drawable.giacchuyen_1));
        listProduct.add(new Product_GridView("Cáp chuyển từ Cổng USB sang PS2...", 15, 69900, 39, R.drawable.giacchuyen_1));

        adt = new CustomAdapter_GridView(listProduct, R.layout.item_gridview, this);
        gridView = findViewById(R.id.gridView);
        gridView.setAdapter(adt);
    }
}