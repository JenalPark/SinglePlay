package com.tacademy.singleplay.detail;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.tacademy.singleplay.R;

public class BookingListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking_list);
        //setSupportActionBar((Toolbar)findViewById(R.id.toolbar));

        Button btn = (Button)findViewById(R.id.button4);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        btn = (Button)findViewById(R.id.btn_bookinglist);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(BookingListActivity.this, CheckedBookingActivity.class));
                finish();
            }
        });

    }
}
