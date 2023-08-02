package com.sp.lifefit.CareRecipient.HomePersonal.MealArrangement;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.sp.lifefit.R;

import java.util.List;

public class MealCartAdapter extends BaseAdapter {

    private List<MealDetails> mMealList;
    private LayoutInflater mInflater;

    public MealCartAdapter(List<MealDetails> mMealList, LayoutInflater mInflater) {
        this.mMealList = mMealList;
        this.mInflater = mInflater;
    }

    @Override
    public int getCount() {
        return  mMealList.size();
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
            convertView = mInflater.inflate(R.layout.meal_order_row,null);
            item = new ViewItem();
            item.MealImage = (ImageView) convertView.findViewById(R.id.row_food_pic);
            item.MealTitle = (TextView) convertView.findViewById(R.id.row_food_name);
            item.MealPrice = (TextView) convertView.findViewById(R.id.row_food_cost);
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
