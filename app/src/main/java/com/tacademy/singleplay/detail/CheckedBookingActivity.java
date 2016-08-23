package com.tacademy.singleplay.detail;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.tacademy.singleplay.R;

public class CheckedBookingActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checked_booking);

        Button btn = (Button)findViewById(R.id.btn_check);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CheckedBookingActivity.this, BookingListActivity.class));
            }
        });

    }
}
