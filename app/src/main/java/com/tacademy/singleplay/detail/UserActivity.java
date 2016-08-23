package com.tacademy.singleplay.detail;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.tacademy.singleplay.PushActivity;
import com.tacademy.singleplay.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class UserActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
        ButterKnife.bind(this);

        TextView profileView = (TextView)findViewById(R.id.profileView);
        profileView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(UserActivity.this, ProfileActivity.class);
                startActivity(intent);
            }
        });


    }
    @OnClick(R.id.btn_coupon)
    public void btn_couponClick(){
        Intent intent = new Intent(UserActivity.this, CouponActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.pushView)
    public void pushClick(){
        Intent intent = new Intent(UserActivity.this, PushActivity.class);
        startActivity(intent);
    }
    @OnClick(R.id.bookingView)
    public void bookingClick(){
        Intent intent = new Intent(UserActivity.this, BookingListActivity.class);
        startActivity(intent);
    }
    @OnClick(R.id.eventView)
    public void eventClick(){
        Intent intent = new Intent(UserActivity.this, EventNoticeActivity.class);
        startActivity(intent);
    }
    @OnClick(R.id.inquiryView)
    public void inquiryClick(){
        Intent intent = new Intent(UserActivity.this, InquiryActivity.class);
        startActivity(intent);
    }



}
