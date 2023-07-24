package com.sp.lifefit.CareRecipient;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.sp.lifefit.R;

public class MealMenu extends AppCompatActivity {

    private CardView lambsalad;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.meal);

        lambsalad = findViewById(R.id.Lamb_Salad);
        lambsalad.setOnClickListener(onclicklambsalad);
    }

    private View.OnClickListener onclicklambsalad = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(MealMenu.this, LambSaladDetails.class);
            startActivity(intent);
            finish();
        }
    };
}