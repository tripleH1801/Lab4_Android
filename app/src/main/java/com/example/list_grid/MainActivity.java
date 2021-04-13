package com.example.list_grid;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_listview);
//        Intent intent = new Intent(this, ListView.class);
        Intent intent = new Intent(this, GridView.class);
        startActivity(intent);
    }
}