package com.sp.lifefit.CareRecipient.BottomNavigation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.sp.lifefit.CareRecipient.HomePersonal.MealArrangement.MealCartAdapter;
import com.sp.lifefit.CareRecipient.HomePersonal.MealArrangement.MealDetails;
import com.sp.lifefit.CareRecipient.HomePersonal.MealArrangement.MealHelper;
import com.sp.lifefit.R;

import java.util.List;

public class MealArrangementListOnActivity extends AppCompatActivity {

    private List<MealDetails> mCartList;
    private MealCartAdapter mealCartAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.meal_arrangement_list);

        mCartList = MealHelper.getCart();
        // Create the list
        final ListView listViewCatalog = (ListView) findViewById(R.id.meal_arrangement_list);
        mealCartAdapter = new MealCartAdapter(mCartList, getLayoutInflater());
        listViewCatalog.setAdapter(mealCartAdapter);
    }
}