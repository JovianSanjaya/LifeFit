package com.sp.lifefit.CareRecipient.HomeDoctor;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.ListView;

import com.sp.lifefit.CareRecipient.HomePersonal.MealArrangement.MealAdapter;
import com.sp.lifefit.CareRecipient.HomePersonal.MealArrangement.MealHelper;
import com.sp.lifefit.CareRecipient.HomePersonal.MealArrangement.MealMenuDetails;
import com.sp.lifefit.CareRecipient.MainCareRecipient;
import com.sp.lifefit.R;

import java.util.List;

public class HomeDoctor extends AppCompatActivity {

   private List<DoctorDetails> mDoctorlist;
    private ImageButton gobackbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_of_doctors);


         gobackbtn = findViewById(R.id.gobackbtn_mydoctors);
         mDoctorlist = HomeDoctorHelper.getCatalog(getResources());
         ListView listviewCatalog = (ListView) findViewById(R.id.listview_mydoctor);
         listviewCatalog.setAdapter(new DoctorAdapter(mDoctorlist,getLayoutInflater()));

         listviewCatalog.setOnItemClickListener(new AdapterView.OnItemClickListener() {
             @Override
             public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                 Intent intent = new Intent(getBaseContext(), DoctorListDetails.class);
                 intent.putExtra(HomeDoctorHelper.PRODUCT_INDEX, position);
                 startActivity(intent);
             }
         });


        gobackbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeDoctor.this, MainCareRecipient.class);
                startActivity(intent);
                finish();
            }
        });

    }
}