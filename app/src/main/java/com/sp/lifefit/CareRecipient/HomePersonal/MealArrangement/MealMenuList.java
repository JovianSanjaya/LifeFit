package com.sp.lifefit.CareRecipient.HomePersonal.MealArrangement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

import com.sp.lifefit.R;

import java.util.List;

public class MealMenuList extends AppCompatActivity {
    private List<MealDetails> mMealList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.meall);

        mMealList = MealHelper.getCatalog(getResources());
        ListView listViewCatalog = (ListView) findViewById(R.id.listviewcatalog);
        listViewCatalog.setAdapter(new MealAdapter(mMealList,getLayoutInflater()));

        listViewCatalog.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(getBaseContext(),MealMenuDetails.class);
                intent.putExtra(MealHelper.PRODUCT_INDEX, position);
                startActivity(intent);
            }
        });

        ImageView carticon = (ImageView) findViewById(R.id.cart_icon);
        carticon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getBaseContext(),CartActivity.class);
                startActivity(intent);

            }
        });


    }
}