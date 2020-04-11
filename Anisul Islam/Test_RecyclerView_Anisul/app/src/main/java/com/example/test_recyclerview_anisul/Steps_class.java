package com.example.test_recyclerview_anisul;

public class Steps_class {
    //    Build gradle:     implementation 'androidx.recyclerview:recyclerview:1.1.0'
//    Create RecyclerView layout XML
//    In "MainActivity" find recyclerView
//    ready all data (res/string) and get them into java file
//    create a Adapter Class extending RecyclerView (that connects the data to the recyclerView)
    //create an inner Class that extends ViewHolder (that holds a view for one item)
//    Send all the data to the Adapter (Creating a Constructor in Adapter class consist of Context context variable)
//    Create a single  layout (sample_layout.XML) to show those data
    //Inflate that  Layout as a view in the MyAdapter Class (into MyViewHolder onCreateViewHolder Method)
    //and return this view to the MyViewHolder Class
//    Now find all views into MyVIewHolder class
//    Now go to the onBindViewHolder class to attach all the data into the views
//    Then getItemCount() returns length of title
//    Go to the MainActivity and setAdapter into recyclerView
//    set LayoutInflaterManager into recyclerView

    //Video Part2: Add OnclickLister in RecyclerView

//    In MyAdapter Class
    //RecyclerView.ViewHolder implements interfaces "OnclickListener" and "OnLongClickLister"
    //then set Them with "itemView"
    //declare an Interface on the Top
    //Making that Interface, bottom of the MyAdapter class
        // void itemClick (int position, View v);
        //void itemLongClick (int position, View v);
    //create a method to setOnItemClickListener which is called from MainActivity
    //parameter should: ClickListener clickListener
    //receive listener variable which is passed from the MainActivity (MyAdapter.clickListener = clickListener;)

//    In MainActivity class
    //setOnClickListener to myAdapterOb object by passing (new MyAdapter.ClickListener()

//    In MyAdapter Class
    //from onClick method and onLongClick method, return portion and View v to the MainActivity's method (itemClick and itemLongClick)

//    if click any item of the recyclerView for a short time it results "itemClick" as a Toast, if click any item of the recyclerView for the long time it results "itemLongClik" as a Toast.

    ////THE END////


}
