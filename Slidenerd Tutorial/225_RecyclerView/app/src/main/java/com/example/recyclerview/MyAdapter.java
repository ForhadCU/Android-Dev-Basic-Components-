package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Collections;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    private LayoutInflater inflater;
    private List<Data_handler> dataList = Collections.emptyList();

    public MyAdapter(Context context, List<Data_handler> dataList) {
        inflater = LayoutInflater.from(context);
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.custom_row_layout, parent, false);

        MyViewHolder myViewHolder_obj = new MyViewHolder(view);
        return myViewHolder_obj;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Data_handler data_handler_obj1 = dataList.get(position);

        holder.mTextView.setText(data_handler_obj1.mTextData);
        holder.mImageView.setImageResource(data_handler_obj1.mImageData);
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView mImageView;
        TextView mTextView;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            mImageView = itemView.findViewById(R.id.cRowImageViewId);
            mTextView = itemView.findViewById(R.id.cRowTextViwId);
        }
    }
}
