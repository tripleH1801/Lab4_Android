package com.example.tiki_layout;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;

public class BelowFragment extends Fragment {

    private static final String ARG_PARAM1 = "param1";

    private String mParam1;

    public BelowFragment() {
        // Required empty public constructor
    }

    public static BelowFragment newInstance(String param1) {
        BelowFragment fragment = new BelowFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_below, container, false);
        DecimalFormat formatter = new DecimalFormat("#.### đ");

        Locale currentLocale = Locale.getDefault();
        DecimalFormatSymbols otherSymbols = new DecimalFormatSymbols(currentLocale);
        otherSymbols.setDecimalSeparator(',');
        otherSymbols.setGroupingSeparator('.');
        DecimalFormat df = new DecimalFormat("#,### đ", otherSymbols);

        TextView tvTamTinh = view.findViewById(R.id.tvTamTinhBelow);
        tvTamTinh.setText(df.format(Integer.parseInt(mParam1.toString())));
        return view;
    }
}