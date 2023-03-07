package com.example.hp.e_service_station;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by HP on 14-09-2022.
 */
public class Feedback_page extends AppCompatActivity {
    EditText editTextSubject,editTextMno,editTextMessage;
    String str_sub, str_mno, str_msg;
    Button send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.feedback_page);
        editTextSubject = (EditText) findViewById(R.id.et_subject);
        editTextMno = (EditText) findViewById(R.id.et1_mno);
        editTextMessage = (EditText) findViewById(R.id.et2_msg);
        send = (Button) findViewById(R.id.btn_send);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str_sub = editTextSubject.getText().toString();
                str_mno = editTextMno.getText().toString();
                str_msg = editTextMessage.getText().toString();
                if (str_sub.isEmpty() || str_mno.isEmpty() || str_msg.isEmpty()) {
                    Toast.makeText(Feedback_page.this, "Enter Feedback", Toast.LENGTH_SHORT).show();
                } else {
                    Intent email = new Intent(Intent.ACTION_SEND);
                    email.putExtra(Intent.EXTRA_EMAIL, new String[]{ "sumayyakadampur2382@gmail.com"});
                    email.putExtra(Intent.EXTRA_SUBJECT, str_sub);
                    email.putExtra(Intent.EXTRA_TEXT, str_msg+str_mno);

                    email.setType("message/rfc822");

                    startActivity(Intent.createChooser(email, "Choose an Email client :"));
                    Toast.makeText(Feedback_page.this, "Sent Successfully", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
