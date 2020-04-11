package com.example.recylerview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MyViewHolder extends RecyclerView.ViewHolder {

    TextView headText;
    TextView descText;
    ImageView imgView;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);

        headText=(TextView)itemView.findViewById(R.id.textHeadID);
        descText=(TextView)itemView.findViewById(R.id.textDescId);
        imgView=(ImageView)itemView.findViewById(R.id.imageId);
    }
}
