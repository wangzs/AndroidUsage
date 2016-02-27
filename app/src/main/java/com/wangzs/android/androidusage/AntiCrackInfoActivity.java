package com.wangzs.android.androidusage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.wangzs.android.anticrack.AntiCrackTools;

import java.io.IOException;

public class AntiCrackInfoActivity extends AppCompatActivity {
    private TextView anti_crack_info_tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anti_crack_info);

        initUI();
    }

    private void initUI() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("AntiCrack");    // need use this change toolbar title
        //toolbar.setTitle("AntiCrack");

        anti_crack_info_tv = (TextView)findViewById(R.id.anti_crack_info_tv);
        anti_crack_info_tv.setText(getAntiCrackInfo());
    }

    private String getAntiCrackInfo() {
        StringBuilder infoBuild = new StringBuilder();
        infoBuild.append("debuggable:")
                .append(AntiCrackTools.checkDebugger(this))
                .append("\nemulator:")
                .append(AntiCrackTools.checkEmulator())
                .append("\nsignature:")
                .append(AntiCrackTools.getApkSignature(this))
                .append("\ndex crc:");

        try {
            infoBuild.append(AntiCrackTools.getDexCrc(this));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return infoBuild.toString();
    }
}
