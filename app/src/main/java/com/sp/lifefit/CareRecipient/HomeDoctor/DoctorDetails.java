package com.sp.lifefit.CareRecipient.HomeDoctor;

import android.graphics.drawable.Drawable;

public class DoctorDetails {

    public String doctorname;
    public String doctorrole;
    public Drawable doctorimage;

    public DoctorDetails(String doctorname, String doctorrole, Drawable doctorimage) {
        this.doctorname = doctorname;
        this.doctorrole = doctorrole;
        this.doctorimage = doctorimage;
    }
}
