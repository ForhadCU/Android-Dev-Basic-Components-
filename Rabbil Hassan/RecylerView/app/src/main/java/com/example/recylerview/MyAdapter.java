package com.example.recylerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {

    private List<MyItems> mylist;
    private Context context;

    public MyAdapter(List<MyItems> mylist, Context context) {
        this.mylist = mylist;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row,viewGroup,false);
        MyViewHolder VH = new MyViewHolder(v);
        return VH;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int position) {

        final MyItems myItemsPosition = mylist.get(position);
        myViewHolder.headText.setText(myItemsPosition.getHead());
        myViewHolder.descText.setText(myItemsPosition.getDesc());
        Picasso.get().load(myItemsPosition.getImg()).into(myViewHolder.imgView);

        myViewHolder.headText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,myItemsPosition.getHead(),Toast.LENGTH_SHORT);
            }
        });

    }

    @Override
    public int getItemCount() {
        return mylist.size();
    }
}
