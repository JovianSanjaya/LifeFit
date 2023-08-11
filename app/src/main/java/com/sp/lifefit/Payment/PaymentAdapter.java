package com.sp.lifefit.Payment;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.bumptech.glide.Glide;
import com.sp.lifefit.R;

import java.util.ArrayList;

public class PaymentAdapter extends PagerAdapter {

    Context context;

    ArrayList<Integer> images;

    public PaymentAdapter(Context context, ArrayList<Integer> images) {
        this.context = context;
        this.images = images;
    }

    @Override
    public int getCount() {
        return images.size();
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

        View view = LayoutInflater.from(context).inflate(R.layout.adapter_viewpager,null);
        ImageView imageView = view.findViewById(R.id.imageview_viewadapter);

        Glide.with(context)
                .asBitmap()
                .load(images.get(position))
                .into(imageView);

        container.addView(view,0);

        return view;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }
}
