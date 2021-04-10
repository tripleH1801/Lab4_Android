package com.example.gridlistview;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Fragment_ListItem#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragment_ListItem extends Fragment {

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    private GridView gridView;
    private CustomAdapter adt;
    private ArrayList<Product> arrayList;
    private Context ctx;

    public Fragment_ListItem() {
    }

    public static Fragment_ListItem newInstance(String param1, String param2) {
        Fragment_ListItem fragment = new Fragment_ListItem();
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
        // Inflate the layout for this fragment
        ctx = inflater.getContext();
        View view = inflater.inflate(R.layout.fragment__list_item, container, false);
        arrayList = new ArrayList<>();
        ArrayList<String> ar = new ArrayList<>();
        ar.add("XL");
        ar.add("XXL");
        ar.add("L");
        ar.add("M");
        ar.add("S");
        arrayList.add(new Product("Google", 80, ar, R.drawable.middle_term_nhom_t5_1));
        arrayList.add(new Product("computer", 80, ar, R.drawable.middle_term_nhom_t5_2));
        arrayList.add(new Product("Black Google", 80, ar, R.drawable.middle_term_nhom_t5_3));
        arrayList.add(new Product("Yellow Google", 80, ar, R.drawable.yellow_google));
        arrayList.add(new Product("Pink Google", 80, ar, R.drawable.images));
        arrayList.add(new Product("Google", 80, ar, R.drawable.code));
        arrayList.add(new Product("computer", 80, ar, R.drawable.computer));
        arrayList.add(new Product("Black Google", 80, ar, R.drawable.download));
//        arrayList.add(new Product("Yellow Google", 80, ar, R.drawable.yellow_google));
//        arrayList.add(new Product("Pink Google", 80, ar, R.drawable.computer_engineer));
        gridView = view.findViewById(R.id.gridView);
        adt = new CustomAdapter( getActivity(), R.layout.item_product, arrayList);
        gridView.setAdapter(adt);
        return view;
    }
}