package com.sp.lifefit.CareRecipient.HomeDoctor;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.sp.lifefit.CareRecipient.HomePersonal.MealArrangement.MealDetails;
import com.sp.lifefit.CareRecipient.HomePersonal.MealArrangement.MealHelper;
import com.sp.lifefit.Payment.Payment;
import com.sp.lifefit.R;

import java.util.List;

public class DoctorListDetails extends AppCompatActivity {

    private AppCompatButton nxtbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.appointment_details);

        nxtbtn = findViewById(R.id.nextbtn_appointmentdetails);
        final List<DoctorDetails> cart = HomeDoctorHelper.getCart();


        List<DoctorDetails> catalog = HomeDoctorHelper.getCatalog(getResources());


        int productIndex = getIntent().getExtras().getInt(MealHelper.PRODUCT_INDEX);
        final DoctorDetails selectedProduct = catalog.get(productIndex);

        // Set the proper image and text
        ImageView productImageView = (ImageView) findViewById(R.id.doctorimagedetails);
        productImageView.setImageDrawable(selectedProduct.doctorimage);

        TextView productTitleTextView = (TextView) findViewById(R.id.doctornamedetails);
        productTitleTextView.setText(selectedProduct.doctorname);

        TextView productPriceTextView= (TextView) findViewById(R.id.doctorroledetails);
        productPriceTextView.setText(selectedProduct.doctorrole);

        nxtbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DoctorListDetails.this, Payment.class);
                cart.add(selectedProduct);
                startActivity(intent);
                finish();
            }
        });

    }
}