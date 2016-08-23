package com.tacademy.singleplay;

import android.support.v4.app.FragmentTabHost;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.tacademy.singleplay.main.ConcertFragment;
import com.tacademy.singleplay.main.MDRecFragment;
import com.tacademy.singleplay.main.MusicalFragment;
import com.tacademy.singleplay.main.OperaFragment;
import com.tacademy.singleplay.main.WishListFragment;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.tabHost)
    FragmentTabHost tabHost;

    private static final String TAB_MUSICAL = "tab musical";
    private static final String TAB_OPERA = "tab opera";
    private static final String TAB_CONCERT= "tab concert";
    private static final String TAB_WISHLIST= "tab wishlist";
    private static final String TAB_MD= "tab md";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        tabHost.setup(this, getSupportFragmentManager(), android.R.id.tabcontent);
        setTabSpec();

    }

    private void setTabSpec() {
        TextView tabSpec = (TextView)getLayoutInflater().inflate(R.layout.tab_spec, tabHost.getTabWidget(), false);
        tabSpec.setText("뮤 지 컬");
        tabHost.addTab(tabHost.newTabSpec(TAB_MUSICAL).setIndicator(tabSpec), MusicalFragment.class, null);

        tabSpec = (TextView)getLayoutInflater().inflate(R.layout.tab_spec, tabHost.getTabWidget(), false);
        tabSpec.setText("오 페 라");
        tabHost.addTab(tabHost.newTabSpec(TAB_OPERA).setIndicator(tabSpec), OperaFragment.class, null);

        tabSpec = (TextView)getLayoutInflater().inflate(R.layout.tab_spec, tabHost.getTabWidget(), false);
        tabSpec.setText("콘 서 트");
        tabHost.addTab(tabHost.newTabSpec(TAB_CONCERT).setIndicator(tabSpec), ConcertFragment.class, null);

        tabSpec = (TextView)getLayoutInflater().inflate(R.layout.tab_spec, tabHost.getTabWidget(), false);
        tabSpec.setText("위 시 리 스 트");
        tabHost.addTab(tabHost.newTabSpec(TAB_WISHLIST).setIndicator(tabSpec), WishListFragment.class, null);

        tabSpec = (TextView)getLayoutInflater().inflate(R.layout.tab_spec, tabHost.getTabWidget(), false);
        tabSpec.setText("M D 추 천");
        tabHost.addTab(tabHost.newTabSpec(TAB_MD).setIndicator(tabSpec), MDRecFragment.class, null);
    }
}
