package com.tacademy.singleplay.detail;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.tacademy.singleplay.R;

public class UserActivity extends AppCompatActivity {

    TextView userView, bookingView, eventView, pushView, inquiryView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
        userView = (TextView)findViewById(R.id.profileView);
        bookingView = (TextView)findViewById(R.id.bookingView);
        eventView = (TextView)findViewById(R.id.eventView);
        pushView = (TextView)findViewById(R.id.pushView);
        inquiryView = (TextView)findViewById(R.id.inquiryView);

        Button btn = (Button)findViewById(R.id.btn_coupon);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(UserActivity.this, ProfileActivity.class);
                startActivity(intent);
            }
        });
        btn = (Button)findViewById(R.id.btn_money);


    }
}
