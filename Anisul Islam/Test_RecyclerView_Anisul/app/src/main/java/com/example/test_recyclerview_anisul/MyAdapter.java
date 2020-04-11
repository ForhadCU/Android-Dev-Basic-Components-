package com.example.test_recyclerview_anisul;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    private String[] titleName, descList;
    private Context context;
    private static OnclickInterface onclickInterface;

    public MyAdapter(Context context, String[] titleName, String[] descList) {
        this.context = context;
        this.titleName = titleName;
        this.descList = descList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.sample_layout, parent, false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.titleTextView.setText(titleName[position]);
        holder.descTextView.setText(descList[position]);
    }

    @Override
    public int getItemCount() {
        return titleName.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView titleTextView;
        TextView descTextView;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            titleTextView = itemView.findViewById(R.id.titleCardTextViewId);
            descTextView = itemView.findViewById(R.id.descCardTextViewId);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            onclickInterface.itemClick(getAdapterPosition(), v);
        }
    }

    public interface OnclickInterface{
        void itemClick(int position, View v);
    }

    public void onItemClickListener(OnclickInterface onclickInterface){

        MyAdapter.onclickInterface = onclickInterface;

    }
}
