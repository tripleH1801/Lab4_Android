package com.example.tiki_layout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.ParseException;
import java.util.Locale;

public class MainActivity extends AppCompatActivity implements SendingData{

    TextView tvTotalPrice;
    FrameLayout FragmentBelow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvTotalPrice = findViewById(R.id.tvTotalPrice);
        getSupportFragmentManager().beginTransaction().add(R.id.FragmentBelow, BelowFragment.newInstance("141800")).commit(); // hien thi fragment
    }

    @Override
    public void SendingData(String data) {
        Locale curLocale = Locale.getDefault();
        DecimalFormatSymbols dfSym = new DecimalFormatSymbols(curLocale);
        dfSym.setDecimalSeparator(',');
        dfSym.setGroupingSeparator('.');
        DecimalFormat df = new DecimalFormat("#,### đ", dfSym);

        tvTotalPrice.setText(df.format(Integer.parseInt(data)*141800));
        getSupportFragmentManager().beginTransaction().replace(R.id.FragmentBelow, BelowFragment.newInstance(String.valueOf(String.valueOf(Integer.parseInt(data)*141800)))).commit();
    }
}