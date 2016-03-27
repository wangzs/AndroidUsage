package com.wangzs.android.androidusage;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.andexert.library.RippleView;
import com.wangzs.android.androidusage.ui.AntiCrackInfoActivity;
import com.wangzs.android.androidusage.ui.DribbleActivity;
import com.wangzs.android.jnibase.JNIManager;

public class MainActivity extends AppCompatActivity {

    RippleView antiCrackToolBtn;
    RippleView dribbbleBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initUI();
        setListener();

        JNIManager.getInstance().testJni(this);
    }


    private void initUI() {
        antiCrackToolBtn = (RippleView) findViewById(R.id.anticrack_tool_btn);
        //antiCrackToolBtn.setOnClickListener(new OnItemClickListener());
        dribbbleBtn = (RippleView) findViewById(R.id.dribbble_btn);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.main_draw_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.navigate_content_view);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.first_item:
                        toastMessage("1");
                        break;
                    case R.id.second_item:
                        toastMessage("2");
                        break;
                    case R.id.contact_item:
                        toastMessage("3");
                        break;
                    case R.id.feedback_item:
                        toastMessage("4");
                        break;
                }
                return false;
            }
        });

        View navigationHeader = navigationView.getHeaderView(0);
        TextView userNameView = (TextView) navigationHeader.findViewById(R.id.user_name_tv);
        TextView userMailView = (TextView) navigationHeader.findViewById(R.id.user_mail_tv);
        userNameView.setText("Android Material Design");
        userMailView.setText("new_user_mail@gmail.com");
    }


    private void setListener() {
        antiCrackToolBtn.setOnRippleCompleteListener(new RippleView.OnRippleCompleteListener() {
            @Override
            public void onComplete(RippleView rippleView) {
                startActivity(new Intent(MainActivity.this, AntiCrackInfoActivity.class));
            }
        });

        dribbbleBtn.setOnRippleCompleteListener(new RippleView.OnRippleCompleteListener() {
            @Override
            public void onComplete(RippleView rippleView) {
                startActivity(new Intent(MainActivity.this, DribbleActivity.class));
            }
        });
    }


    private class OnItemClickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.anticrack_tool_btn:
                    startActivity(new Intent(MainActivity.this, AntiCrackInfoActivity.class));
                    break;
                case R.id.dribbble_btn:
                    startActivity(new Intent(MainActivity.this, DribbleActivity.class));
                    break;
            }
        }
    }


    private void toastMessage(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }

}
