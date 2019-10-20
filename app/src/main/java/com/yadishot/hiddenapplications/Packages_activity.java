package com.yadishot.hiddenapplications;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Packages_activity extends AppCompatActivity {

    TextView optionsTxtViewFree, optionsTxtViewSeven, optionsTxtViewOneMoth, optionsTxtViewTreeMoth, optionsTxtViewSixMoth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_packages_activity);
        findByViewIdElements();
        setOptionTexts();

    }




    // findByViewId & Set Option texts
    private void setOptionTexts() {
        optionsTxtViewFree.setText("- Hide other Application \n - Hide Picture \n - Hide Contact");
        optionsTxtViewSeven.setText("- Hide other Application \n - Hide Video & Picture \n - Hide Contact & SMS \n - Set Custom Security Code");
        optionsTxtViewOneMoth.setText("- Hide other Application \n - Hide Video & Picture \n - Hide Contact & SMS \n - Set Custom Security Code");
        optionsTxtViewTreeMoth.setText("- Hide other Application \n - Hide Video & Picture \n - Hide Contact & SMS \n - Set Custom Security Code");
        optionsTxtViewSixMoth.setText("- Hide other Application \n - Hide Video & Picture \n - Hide Contact & SMS \n - Set Custom Security Code");
    }

    private void findByViewIdElements() {
        optionsTxtViewFree = findViewById(R.id.optionsTxtViewFree);
        optionsTxtViewSeven = findViewById(R.id.optionsTxtViewSeven);
        optionsTxtViewOneMoth = findViewById(R.id.optionsTxtViewOneMoth);
        optionsTxtViewTreeMoth = findViewById(R.id.optionsTxtViewTreeMoth);
        optionsTxtViewSixMoth = findViewById(R.id.optionsTxtViewSixMoth);
    }
}
