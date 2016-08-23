package com.tacademy.singleplay;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTabHost;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.tacademy.singleplay.detail.UserActivity;
import com.tacademy.singleplay.main.ConcertFragment;
import com.tacademy.singleplay.main.MDRecFragment;
import com.tacademy.singleplay.main.MusicalFragment;
import com.tacademy.singleplay.main.OperaFragment;
import com.tacademy.singleplay.main.WishListFragment;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.tabHost)
    FragmentTabHost tabHost;
    @BindView(R.id.text_toolbarTitle)
    TextView toolbarTitleView;
    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.tab_linear)
    LinearLayout tabLayout;

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
        toolbarTitleView.setText("서울");

        tabHost.setup(this, getSupportFragmentManager(), android.R.id.tabcontent);
        setTabSpec();

        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().setDisplayShowCustomEnabled(true);
    }

    @OnClick(R.id.text_toolbarTitle)
    public void onToolbarTitle() {
        tabLayout.setVisibility(View.GONE);
        //tabLayout.setElevation();
        FragmentManager ft = getSupportFragmentManager();
        ft.beginTransaction()
                .replace(R.id.tab_linear, new LocationFragment())
                .commit();
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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.activity_main, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        super.onOptionsItemSelected(item);
        switch (item.getItemId()) {
            case R.id.menu_detail : {
                startActivity(new Intent(MainActivity.this, UserActivity.class));
                break;
            }
            case R.id.menu_search : {
                startActivity(new Intent(MainActivity.this, SearchActivity.class));
                break;
            }
        }

        return true;
    }
}
