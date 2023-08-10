package com.sp.lifefit.CareRecipient.HomePersonal.MealArrangement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;

import com.sp.lifefit.Payment.Payment;
import com.sp.lifefit.R;

import java.util.List;

public class CartActivity extends AppCompatActivity {

    private List<MealDetails> mCartList;
    private MealCartAdapter mealCartAdapter;
    private ImageButton backbtn;
    private ImageButton placeOrderbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.confirm_meal_arrangement_order);

        mCartList = MealHelper.getCart();
        backbtn = findViewById(R.id.go_back_button_confirm_meal_order);
        placeOrderbtn = findViewById(R.id.place_order_button_confirm_meal_order);

        // Create the list
        final ListView listViewCatalog = (ListView) findViewById(R.id.meal_arrangement_orders);
        mealCartAdapter = new MealCartAdapter(mCartList, getLayoutInflater());
        listViewCatalog.setAdapter(mealCartAdapter);

        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(CartActivity.this,MealMenuList.class);
                startActivity(intent);

            }
        });

        placeOrderbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(CartActivity.this, Payment.class);
                startActivity(intent);

            }
        });


//        Button removeButton = (Button) findViewById(R.id.ButtonRemoveFromCart);
//        removeButton.setOnClickListener(new OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                // Loop through and remove all the products that are selected
//                // Loop backwards so that the remove works correctly
//                for(int i=mCartList.size()-1; i>=0; i--) {
//c
//                    if(mCartList.get(i).seleted) {
//                        mCartList.remove(i);
//                    }
//                }
//                mProductAdapter.notifyDataSetChanged();
//            }
//        });

    }
}
