package com.sp.lifefit.CareRecipient.HomeDoctor;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.sp.lifefit.CareRecipient.HomePersonal.MealArrangement.MealAdapter;
import com.sp.lifefit.CareRecipient.HomePersonal.MealArrangement.MealDetails;
import com.sp.lifefit.R;

import org.w3c.dom.Text;

import java.util.List;

public class DoctorAdapter extends BaseAdapter {

    private List<DoctorDetails> mDoctorlist;
    private LayoutInflater mInflater;

    public DoctorAdapter(List<DoctorDetails> mDoctorlist, LayoutInflater mInflater) {
        this.mDoctorlist = mDoctorlist;
        this.mInflater = mInflater;
    }

    @Override
    public int getCount() {
        return mDoctorlist.size();
    }

    @Override
    public Object getItem(int position) {
        return mDoctorlist.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
       final ViewItem item;

        if(convertView ==null){
            convertView = mInflater.inflate(R.layout.mydoctor_row,null);
            item = new ViewItem();
            item.DoctorName = (TextView) convertView.findViewById(R.id.doctorname);
            item.DoctorRole = (TextView) convertView.findViewById(R.id.doctorrole);
            item.DoctorImage = (ImageView) convertView.findViewById(R.id.doctorimage);
            convertView.setTag(item);
        }
        else {
            item = (ViewItem) convertView.getTag();
        }

        DoctorDetails doctorDetails = mDoctorlist.get(position);
        item.DoctorName.setText(doctorDetails.doctorname);
        item.DoctorRole.setText((doctorDetails.doctorrole));
        item.DoctorImage.setImageDrawable((doctorDetails.doctorimage));

        return convertView;
    }

    private class ViewItem{
        TextView DoctorName;
        TextView DoctorRole;
        ImageView DoctorImage;

    }
}
