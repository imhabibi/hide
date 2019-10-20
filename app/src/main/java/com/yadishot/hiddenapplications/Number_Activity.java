package com.yadishot.hiddenapplications;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.yadishot.hiddenapplications.ActionRegLog.VerifyActivity;
import com.yadishot.hiddenapplications.SharedPreferences.SharedPreferencesConfig;

public class Number_Activity extends AppCompatActivity {

    EditText securityCode;

    SharedPreferencesConfig sharedPreferences;

    LinearLayout linearLayout;

    Button selectCode;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number_);
        sharedPreferences = new SharedPreferencesConfig(getApplicationContext());
        securityCode = findViewById(R.id.securityCode);
        linearLayout = findViewById(R.id.linearLayoutActions);
        selectCode = findViewById(R.id.selectCode);
    }

    public void onClickSetSecurityCode(View view) {
        switch (view.getId()) {
            case R.id.selectCode:
                getLayouts();

                break;
            case R.id.confirmCode:
                confirmCode();
                break;
            case R.id.reCode:
                reCode();
                break;
            default:
                break;
        }
    }

    private void reCode() {
    securityCode.setText("");
    linearLayout.setVisibility(View.GONE);
    selectCode.setVisibility(View.VISIBLE);
    }

    private void confirmCode() {
        String securityCodes = securityCode.getText().toString();
        sharedPreferences.writeSecurityCode(securityCodes);
        Toast.makeText(this, "Security code has set!", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(Number_Activity.this, VerifyActivity.class));
        finish();
    }

    private void getLayouts() {
        selectCode.setVisibility(View.GONE);
        linearLayout.setVisibility(View.VISIBLE);
    }
}
