package com.yadishot.hiddenapplications;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.widget.Toast;

import com.yadishot.hiddenapplications.SharedPreferences.SharedPreferencesConfig;

public class BroadCastOpenApplication extends BroadcastReceiver {
    SharedPreferencesConfig sharedPreferences;

    @Override
    public void onReceive(Context context, Intent intent) {
        String CallingCode = intent.getStringExtra(Intent.EXTRA_PHONE_NUMBER);
        sharedPreferences = new SharedPreferencesConfig(context.getApplicationContext());



        // Go to application using Code
        String Code = sharedPreferences.readSecurityCode();
        Toast.makeText(context, ""+Code, Toast.LENGTH_SHORT).show();
        if (CallingCode.equals(Code)){
            PackageManager UnHiddenApplication = context.getPackageManager();
            ComponentName componentName = new ComponentName(context, MainActivity.class);
            UnHiddenApplication.setComponentEnabledSetting(componentName, PackageManager.COMPONENT_ENABLED_STATE_ENABLED, PackageManager.DONT_KILL_APP);
            Intent i = new Intent(context, MainActivity.class);
            i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(i);
        }
    }
}
