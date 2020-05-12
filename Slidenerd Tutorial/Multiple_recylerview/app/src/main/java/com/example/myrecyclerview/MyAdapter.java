package com.example.myrecyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Collections;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyviewHolder> {
    private LayoutInflater inflater;
    private List<Data_handler> dataList = Collections.emptyList();

    public MyAdapter(Context context , List<Data_handler> dataList) {
        inflater = LayoutInflater.from(context);
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public MyviewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.row_recy_1, parent, false);

        MyviewHolder myviewHolder = new MyviewHolder(view);

        return myviewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyviewHolder holder, int position) {
        Data_handler data_handler = dataList.get(position);

        holder.imageView_holder.setImageResource(data_handler.image_data_1);
        holder.textView_holder.setText(data_handler.text_data_1);
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    public class MyviewHolder extends RecyclerView.ViewHolder {
        ImageView imageView_holder;
        TextView textView_holder;

        public MyviewHolder(@NonNull View itemView) {
            super(itemView);
            imageView_holder = itemView.findViewById(R.id.row1_imgV_id);
            textView_holder = itemView.findViewById(R.id.row1_txtV_id);

        }
    }
}
