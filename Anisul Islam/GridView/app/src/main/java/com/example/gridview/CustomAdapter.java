package com.example.gridview;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {

    String[] countryNames;
    int[] flagas;
    Context context;
    LayoutInflater inflater;

    CustomAdapter(Context context, String[] countryNames, int[] flagas)
    {
        this.context = context;
        this.countryNames = countryNames;
        this.flagas = flagas;
    }

    @Override
    public int getCount() {
        return countryNames.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null)
        {
            inflater =(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.view_layout, parent, false);
        }

        ImageView imageView = convertView.findViewById(R.id.imageViewId);
        TextView textView = convertView.findViewById(R.id.textViewId);

        textView.setText(countryNames[position]);
        imageView.setImageResource(flagas[position]);

        return convertView;
    }
}
