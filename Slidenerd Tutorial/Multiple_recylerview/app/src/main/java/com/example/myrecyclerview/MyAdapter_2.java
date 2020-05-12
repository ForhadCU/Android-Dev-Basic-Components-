package com.example.myrecyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.net.CookieHandler;
import java.util.Collections;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter_2 extends RecyclerView.Adapter<MyAdapter_2.MyViewHolder_2> {
    private LayoutInflater inflater;
    private List<Data_handler_2> dataList2 = Collections.emptyList();

    public MyAdapter_2(Context context, List<Data_handler_2> dataList2) {
        inflater = LayoutInflater.from(context);
        this.dataList2 = dataList2;
    }

    @NonNull
    @Override
    public MyViewHolder_2 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.row_recy_1, parent, false);
        MyViewHolder_2 myViewHolder_2 = new MyViewHolder_2(view);

        return myViewHolder_2;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder_2 holder, int position) {
        Data_handler_2 data_handler_2 = dataList2.get(position);
        holder.imageView_viewholder2.setImageResource(data_handler_2.image_data_2);
        holder.textView_viewholder2.setText(data_handler_2.text_data_2);
    }

    @Override
    public int getItemCount() {
        return dataList2.size();
    }

    public class MyViewHolder_2 extends RecyclerView.ViewHolder {
        TextView textView_viewholder2;
        ImageView imageView_viewholder2;

        public MyViewHolder_2(@NonNull View itemView) {
            super(itemView);
            textView_viewholder2 = itemView.findViewById(R.id.row1_txtV_id);
            imageView_viewholder2 = itemView.findViewById(R.id.row1_imgV_id);
        }
    }
}
