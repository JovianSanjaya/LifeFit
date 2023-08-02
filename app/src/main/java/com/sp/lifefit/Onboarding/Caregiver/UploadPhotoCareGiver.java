package com.sp.lifefit.Onboarding.Caregiver;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import com.sp.lifefit.Onboarding.CareRecipient.SetLocationCareRecipient;
import com.sp.lifefit.R;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;

public class UploadPhotoCareGiver extends AppCompatActivity {

    private ImageView photoshown;

    private byte[] imageData;

    int SELECT_IMAGE_CODE = 1;
    private AppCompatButton uplaodphotobtn;

    private AppCompatButton nextuploadphotobtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup_upload_photo);

        uplaodphotobtn = findViewById(R.id.uploadphoto_fromgallery);
        nextuploadphotobtn = findViewById(R.id.nextbtn_uploadphoto);
        photoshown = findViewById(R.id.imageshowonuploadphoto);
        nextuploadphotobtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UploadPhotoCareGiver.this, ReadyToUseCareGiver.class);
                startActivity(intent);
            }
        });

        uplaodphotobtn.setOnClickListener(onclickuploadphoto);
    }

    View.OnClickListener onclickuploadphoto = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent();
            intent.setType("image/*");
            intent.setAction(Intent.ACTION_GET_CONTENT);
            startActivityForResult(Intent.createChooser(intent,"Title"),SELECT_IMAGE_CODE);
        }
    };


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == 1){
            Uri uri = data.getData();
            photoshown.setImageURI(uri);

            Bitmap bitmap;
            try {
                bitmap = BitmapFactory.decodeStream(getContentResolver().openInputStream(uri));
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, stream);
                imageData = stream.toByteArray();
                bitmap.recycle();

            } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }


        }
    }
}