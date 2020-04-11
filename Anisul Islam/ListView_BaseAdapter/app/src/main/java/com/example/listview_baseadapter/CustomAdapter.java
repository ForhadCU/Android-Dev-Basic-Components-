package com.example.listview_baseadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import static com.example.listview_baseadapter.R.id.imageViewId;

public class CustomAdapter extends BaseAdapter {
    String[] names;
    int[] flags;
    Context context;

    CustomAdapter(Context context, String[] names, int[] flags)
    {
        this.context = context;
        this.names = names;
        this.flags = flags;
    }

    @Override
    public int getCount() {
        return names.length;
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
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.view_layout, parent, false);
        }

        ImageView imageView = convertView.findViewById(R.id.imageViewId);
        TextView textView = convertView.findViewById(R.id.textViewId);

         imageView.setImageResource(flags[position]);
         textView.setText(names[position]);


        return convertView;
    }
}
