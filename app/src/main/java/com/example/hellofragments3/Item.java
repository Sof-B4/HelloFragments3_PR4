package com.example.hellofragments3;

public class Item {
    private String itemName;
    private int itemImageResId;

    public Item( int itemImageResId, String itemName) {
        this.itemImageResId = itemImageResId;
        this.itemName = itemName;
    }

    public String getItemName() {
        return itemName;
    }

    public int getItemImageResId() {
        return itemImageResId;
    }
}