package com.example.quakeapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class QuakeAdapter extends ArrayAdapter {
    public QuakeAdapter(Context context, ArrayList<Quake> Quake) {
        super(context, 0, Quake);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View list_item = convertView;

        if (list_item == null) {
            list_item = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Quake data = (Quake) getItem(position);
        TextView magnitudeTextView = (TextView) list_item.findViewById(R.id.magnitude);
        magnitudeTextView.setText(String.valueOf(data.getMag()));
        TextView placeTextView = (TextView) list_item.findViewById(R.id.place);
        placeTextView.setText(data.getplace());

        TextView dateTextView = (TextView) list_item.findViewById(R.id.date);
        dateTextView.setText(data.getdate());
        return list_item;
    }
}
