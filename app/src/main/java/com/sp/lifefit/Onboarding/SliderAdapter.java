package com.sp.lifefit.Onboarding;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.sp.lifefit.R;

public class SliderAdapter extends PagerAdapter {

    Context context;

    LayoutInflater layoutInflater;

    public SliderAdapter(Context context){this.context = context;}

    public int[] slide_images = {

            R.drawable.slide1pic,
            R.drawable.slide2pic,
            R.drawable.slide3pic,
            R.drawable.slide4pic

    };

    public  int[] progress_image = {

            R.drawable.progress1,
            R.drawable.progress2,
            R.drawable.progress3,
            R.drawable.progress4
    };

    public String[] slide_heading = {

            "Best of the best",
            "Personalized care",
            "Always engaged",
            "Welcome,"

    };

    public String[] slide_subheading = {

            "Our team of caregivers consists of carefully chosen \nindividuals who have undergone rigorous training \n in nursing and home care. They possess the \nexpertise and skills necessary to deliver top-quality \ncare that your family truly deserves.",
            "Each person's care requirements are distinct,and \n we are committed to comprehending the speicific \nneeds of both you and your loved ones.",
            "Easily access and control your care through our \napp. Stay informed at all times about the progress \nof your visit with comprehensive notes and visual \nupdates.",
            "Get started to find out more about our app that integrates care services and technology to help your loved ones"

    };

    @Override
    public int getCount() {
        return slide_heading.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

        layoutInflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.slide_layout, container, false);

        ImageView imgView_logo = view.findViewById(R.id.imageView_logo);
        ImageView imgView_progressBar = view.findViewById(R.id.imageView_progress);

        TextView txtView_heading = view.findViewById(R.id.textView_heading);
        TextView txtView_subheading = view.findViewById(R.id.textView_subheading);


        imgView_logo.setImageResource(slide_images[position]);
        imgView_progressBar.setImageResource(progress_image[position]);

        txtView_heading.setText(slide_heading[position]);
        txtView_subheading.setText(slide_subheading[position]);

        container.addView(view);

        return view;

    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((LinearLayout)object);
    }
}
