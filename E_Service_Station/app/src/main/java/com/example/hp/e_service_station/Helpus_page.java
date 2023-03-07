package com.example.hp.e_service_station;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by HP on 14-09-2022.
 */
public class Helpus_page  extends AppCompatActivity{
    ImageView calladmin;
    ImageView calltechni;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.helpus_page);
        calladmin=(ImageView)findViewById(R.id.img);
        calltechni=(ImageView)findViewById(R.id.img1);
        calladmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel:9686057088"));
                startActivity(intent);
            }
        });
        calltechni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel:8762244115"));
                startActivity(intent);
            }
        });
            }


    }

