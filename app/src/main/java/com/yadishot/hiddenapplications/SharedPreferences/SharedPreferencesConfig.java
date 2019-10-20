package com.yadishot.hiddenapplications.SharedPreferences;

import android.content.Context;
import android.content.SharedPreferences;

import com.yadishot.hiddenapplications.R;

public class SharedPreferencesConfig {
    private SharedPreferences sharedPreferences;
    private Context context;

    public SharedPreferencesConfig(Context context){
        this.context = context;

        sharedPreferences = context.getSharedPreferences(context.getResources().getString(R.string.preference_file_key), Context.MODE_PRIVATE);
    }

    public void writeSecurityCode(String value){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(context.getResources().getString(R.string.preference_file_securityCode), value);
        editor.commit();
    }

    public String readSecurityCode(){
        return sharedPreferences.getString(context.getResources().getString(R.string.preference_file_securityCode), "5589*#");
    }
}
