package com.example.tiki_layout;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

public class AboveFragment extends Fragment {

    private int Quality;
    SendingData sendingData;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        sendingData = (SendingData) context;
    }

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    public AboveFragment() {
    }

    public static AboveFragment newInstance(String param1, String param2) {
        AboveFragment fragment = new AboveFragment();
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
        View view = inflater.inflate(R.layout.fragment_above, container, false);
        final ImageButton imgbtnAdd = view.findViewById(R.id.imgbtnAdd);
        final ImageButton imgbtnMinus = view.findViewById(R.id.imgbtnMinus);
        final TextView tvQuality = view.findViewById(R.id.tvQuality);
        Quality = Integer.parseInt(tvQuality.getText().toString());
        imgbtnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Quality++;
                tvQuality.setText(String.valueOf(Quality));
                sendingData.SendingData(String.valueOf(Quality));
            }
        });
        imgbtnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Quality--;
                tvQuality.setText(String.valueOf(Quality));
                sendingData.SendingData(String.valueOf(Quality));
            }
        });
        return view;
    }
}