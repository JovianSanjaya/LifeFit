package com.sp.lifefit.CareRecipient.HomeDoctor;

import android.content.res.Resources;

import com.sp.lifefit.CareRecipient.HomePersonal.MealArrangement.MealDetails;
import com.sp.lifefit.R;
import java.util.ArrayList;
import java.util.List;

public class HomeDoctorHelper {

    public static final String PRODUCT_INDEX = "PRODUCT_INDEX";
    private static List<DoctorDetails> catalog;
    private static List<DoctorDetails> cart;

    public static List<DoctorDetails> getCatalog (Resources res){
        if (catalog ==null){
            catalog = new ArrayList<DoctorDetails>();
            catalog.add(new DoctorDetails("Dr Tranquilli","Immunologist", res.getDrawable(R.drawable.doctor1)));
            catalog.add(new DoctorDetails("Dr Bonebrake","Cardiologist",res.getDrawable(R.drawable.doctor2)));
            catalog.add(new DoctorDetails("Dr Luke Whitesell","Podiatrist",res.getDrawable(R.drawable.doctor3)));
            catalog.add(new DoctorDetails("Dr Shoemaker","Psychiatrists", res.getDrawable(R.drawable.doctor4)));

        }

        return catalog;
    }

    public static List<DoctorDetails> getCart() {
        if(cart == null) {
            cart = new ArrayList<DoctorDetails>();
        }

        return cart;
    }

}
