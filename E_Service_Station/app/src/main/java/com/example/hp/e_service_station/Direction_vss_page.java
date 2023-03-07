package com.example.hp.e_service_station;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

/**
 * Created by HP on 16-09-2022.
 */
public class Direction_vss_page extends AppCompatActivity {
    WebView charge;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.direction_vss);
        charge=(WebView)findViewById(R.id.wv_vcs);
        charge.loadUrl("https://maps.google.com/");

    }
}
