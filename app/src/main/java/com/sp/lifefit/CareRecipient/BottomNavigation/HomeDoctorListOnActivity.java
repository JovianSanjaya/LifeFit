package com.sp.lifefit.CareRecipient.BottomNavigation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.sp.lifefit.CareRecipient.HomeDoctor.DoctorAdapter;
import com.sp.lifefit.CareRecipient.HomeDoctor.DoctorDetails;
import com.sp.lifefit.CareRecipient.HomeDoctor.HomeDoctorHelper;
import com.sp.lifefit.R;

import java.util.List;

public class HomeDoctorListOnActivity extends AppCompatActivity {

    private List<DoctorDetails> mDoctorList;

    private DoctorAdapter doctorAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homedoctorlist_onactivity);

        mDoctorList = HomeDoctorHelper.getCart();
        // Create the list
        final ListView listViewCatalog = (ListView) findViewById(R.id.home_doctor_list);
        doctorAdapter = new DoctorAdapter(mDoctorList , getLayoutInflater());
        listViewCatalog.setAdapter(doctorAdapter);

    }
}