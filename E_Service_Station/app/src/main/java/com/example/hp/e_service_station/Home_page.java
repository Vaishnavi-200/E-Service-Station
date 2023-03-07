package com.example.hp.e_service_station;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by HP on 12-09-2022.
 */
public class Home_page extends AppCompatActivity{
    SharedPrefHandler shr;
    TextView v1,v2,v3,v4;
    ImageView i1,i2,i3,i4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_page);
        shr=new SharedPrefHandler(this);
        v1=(TextView)findViewById(R.id.tv_service);
        v2=(TextView)findViewById(R.id.tv_charging);
        v3=(TextView)findViewById(R.id.tv_feedback);
        v4=(TextView)findViewById(R.id.tv_aboutapp);
        i1=(ImageView)findViewById(R.id.img1);
        i2=(ImageView)findViewById(R.id.img2);
        i3=(ImageView)findViewById(R.id.img3);
        i4=(ImageView)findViewById(R.id.img4);
        v1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplication(),VSS_page.class);
                startActivity(i);
            }
        });
        v2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplication(),VCS_page.class);
                startActivity(i);
            }
        });
       v3.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent i = new Intent(getApplication(),Feedback_page.class);
               startActivity(i);
           }
       });
        v4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplication(),Aboutapp_page.class);
                startActivity(i);
            }
        });
        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplication(),VSS_page.class);
                startActivity(i);
            }
        });
        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplication(),VCS_page.class);
                startActivity(i);
            }
        });
        i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplication(),Feedback_page.class);
                startActivity(i);
            }
        });
        i4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplication(),Aboutapp_page.class);
                startActivity(i);
            }
        });


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement

        if (id == R.id.action_logout)
        {
            shr.setSharedPreferences("login","true");
            Intent i = new Intent(getApplication(),Login_page.class);
            startActivity(i);
            return true;
        }
        if (id == R.id.action_Profile)
        {
           // shr.setSharedPreferences("login","true");
            Intent i = new Intent(getApplication(),Profile_page.class);
            startActivity(i);
            return true;
        }
        if (id == R.id.action_HelpUs)
        {
            // shr.setSharedPreferences("login","true");
            Intent i = new Intent(getApplication(),Helpus_page.class);
            startActivity(i);
            return true;
        }
        if (id == R.id.action_ContactUs)
        {
            // shr.setSharedPreferences("login","true");
            Intent i = new Intent(getApplication(),Contactus_page.class);
            startActivity(i);
            return true;
        }



        return super.onOptionsItemSelected(item);
    }
}
