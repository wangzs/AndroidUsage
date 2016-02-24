package com.wangzs.android.androidusage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button antiCrackToolBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initUI();
    }


    private void initUI() {
        antiCrackToolBtn = (Button)findViewById(R.id.anticrack_tool_btn);
        antiCrackToolBtn.setOnClickListener(new OnItemClickListener());
    }

    private class OnItemClickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.anticrack_tool_btn:
                    startActivity(new Intent(MainActivity.this, AntiCrackInfoActivity.class));
                    break;
            }
        }
    }
}
