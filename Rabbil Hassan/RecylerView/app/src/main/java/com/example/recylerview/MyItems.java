package com.example.recylerview;

public class MyItems {

   private String head;
   private String desc;
   private String img;

    public MyItems(String head, String desc, String img)
    {
        this.head = head;
        this.desc = desc;
        this.img = img;
    }

    public String getHead(){
        return head;
    }

    public String getDesc(){
        return desc;
    }

    public String getImg(){
        return img;
    }
}
