package com.yadishot.hiddenapplications.ActionRegLog;

import androidx.appcompat.app.AppCompatActivity;

import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.text.format.Formatter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.yadishot.hiddenapplications.R;

public class VerifyActivity extends AppCompatActivity {

    private WifiManager wifiManager;
    private Button verifyNumberBtn;
    private EditText verifyNumberEdt;
    private TextView callbackRequestVerify;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify);

        callbackRequestVerify = findViewById(R.id.callbackRequestVerify);
        verifyNumberBtn = findViewById(R.id.verifyNumberBtn);
        verifyNumberEdt = findViewById(R.id.verifyNumberEdt);
    }


    private void verifyNumberSec1(){
        wifiManager = (WifiManager) getApplicationContext().getSystemService (WIFI_SERVICE);

        String Number = verifyNumberEdt.getText().toString().trim();
        String DeviceIp = Formatter.formatIpAddress(wifiManager.getConnectionInfo().getIpAddress());

        if (!Number.isEmpty()){

        }else{
            callbackRequestVerify.setText("برای ورود یک شماره همراه وارد کنید.");
        }
    }
}
