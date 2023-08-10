package com.sp.lifefit.CareRecipient.HomePersonal.MealArrangement;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.sp.lifefit.CareRecipient.HomePersonal.HomePersonalCare;
import com.sp.lifefit.R;

import java.util.List;

public class MealMenuDetails extends AppCompatActivity {
    private ImageButton backbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.meal_details);

        backbtn = findViewById(R.id.go_back_button_meal_details);


        List<MealDetails> catalog = MealHelper.getCatalog(getResources());
        final List<MealDetails> cart = MealHelper.getCart();

        int productIndex = getIntent().getExtras().getInt(MealHelper.PRODUCT_INDEX);
        final MealDetails selectedProduct = catalog.get(productIndex);

        // Set the proper image and text
        ImageView productImageView = (ImageView) findViewById(R.id.meal_image);
        productImageView.setImageDrawable(selectedProduct.mealImage);
        TextView productTitleTextView = (TextView) findViewById(R.id.meal_title);
        productTitleTextView.setText(selectedProduct.title);
        TextView productPriceTextView= (TextView) findViewById(R.id.meal_price);
        String price = "$" + String.valueOf(selectedProduct.price);
        productPriceTextView.setText(price);


        AppCompatButton addToCartButton = (AppCompatButton) findViewById(R.id.add_cart_button);

        addToCartButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                cart.add(selectedProduct);
                finish();
            }
        });

        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MealMenuDetails.this, MealMenuList.class);
                startActivity(intent);
                finish();
            }
        });
    }

}



