package com.sp.lifefit.CareRecipient.HomePersonal.MealArrangement;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.sp.lifefit.R;

import java.util.List;

public class MealAdapter extends BaseAdapter {

    private List<MealDetails> mMealList;
    private LayoutInflater mInflater;

    public MealAdapter(List<MealDetails> mMealList, LayoutInflater layoutInflater) {
        this.mMealList = mMealList;
        this.mInflater = layoutInflater;
    }

    @Override
    public int getCount() {
        return mMealList.size();
    }

    @Override
    public Object getItem(int position) {
        return mMealList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        final ViewItem item;

        if(convertView ==null){
            convertView = mInflater.inflate(R.layout.meal_row,null);
            item = new ViewItem();
            item.MealImage = (ImageView) convertView.findViewById(R.id.meal_image);
            item.MealTitle = (TextView) convertView.findViewById(R.id.meal_title);
            item.MealPrice = (TextView) convertView.findViewById(R.id.meal_price);
            convertView.setTag(item);
        }
        else {
            item = (ViewItem) convertView.getTag();
        }

        MealDetails mealDetails = mMealList.get(position);
        item.MealTitle.setText(mealDetails.title);
        item.MealImage.setImageDrawable(mealDetails.mealImage);

        String price = "$" +  String.valueOf(mealDetails.price) ;
        item.MealPrice.setText(price);

        return convertView;
    }

    private class ViewItem{

        ImageView MealImage;
        TextView MealTitle;
        TextView MealPrice;
    }

}


