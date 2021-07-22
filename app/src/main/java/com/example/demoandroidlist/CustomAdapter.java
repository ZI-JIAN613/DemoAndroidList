package com.example.demoandroidlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

class CustomAdapter extends ArrayAdapter {

    Context context;
    int resource;
    ArrayList<AndroidVersion> al;

    public CustomAdapter(Context context, int resource, ArrayList<AndroidVersion> al) {
        super(context, resource, al);

        this.context = context;
        this.resource = resource;
        this.al = al;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(resource, parent, false);

        TextView tvName = rowView.findViewById(R.id.tvName);
        TextView tvVersion = rowView.findViewById(R.id.tvVersion);

        AndroidVersion currentVersion = al.get(position);

        tvName.setText(currentVersion.getName());
        tvVersion.setText("Android Version: " + currentVersion.getVersion());

        return rowView;
    }
}
