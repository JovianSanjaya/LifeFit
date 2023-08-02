package com.sp.lifefit.CareRecipient.HomePersonal.MealArrangement;

import android.content.res.Resources;

import com.sp.lifefit.R;

import java.util.ArrayList;
import java.util.List;

public class MealHelper {

    public static final String PRODUCT_INDEX = "PRODUCT_INDEX";

    private static List<MealDetails> catalog;
    private static List<MealDetails> cart;

    public static List<MealDetails> getCatalog (Resources res){
        if (catalog ==null){
            catalog = new ArrayList<MealDetails>();
            catalog.add(new MealDetails("Lamb Salad",res.getDrawable(R.drawable.lamb_salad_pic),15.00));
            catalog.add(new MealDetails("Spicy Crab Salad",res.getDrawable(R.drawable.spicy_crab_salad_pic),20.00));
            catalog.add(new MealDetails("Salad Wrap",res.getDrawable(R.drawable.salad_wrap_pic),12.00));
            catalog.add(new MealDetails("Chicken Wrap",res.getDrawable(R.drawable.spicy_crab_salad_pic),10.00));
        }

        return catalog;
    }

    public static List<MealDetails> getCart() {
        if(cart == null) {
            cart = new ArrayList<MealDetails>();
        }

        return cart;
    }

}
