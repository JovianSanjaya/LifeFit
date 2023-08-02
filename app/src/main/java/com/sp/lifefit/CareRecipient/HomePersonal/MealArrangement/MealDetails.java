package com.sp.lifefit.CareRecipient.HomePersonal.MealArrangement;

import android.graphics.drawable.Drawable;

public class MealDetails {

    public String title;
    public Drawable mealImage;
    public double price;

    public MealDetails(String title, Drawable mealImage, double price) {
        this.title = title;
        this.mealImage = mealImage;
        this.price = price;

    }

}
