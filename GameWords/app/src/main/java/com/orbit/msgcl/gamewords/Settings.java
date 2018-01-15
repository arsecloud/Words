package com.orbit.msgcl.gamewords;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import static com.orbit.msgcl.gamewords.MainActivity.APP_PREFERENCES;
import static com.orbit.msgcl.gamewords.MainActivity.APP_PREFERENCES_COUNTER;
import static com.orbit.msgcl.gamewords.MainActivity.APP_PREFERENCES_GT;
import static com.orbit.msgcl.gamewords.classic.pointss;

/**
 * Created by MSGcl on 15.01.2018.
 */

public class Settings extends Activity {
private Switch GT;


    private SharedPreferences mSettings;

    boolean FlagSave = true;
    private int GTflag;


    private TextView txtPoint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sett);

        mSettings = getSharedPreferences(APP_PREFERENCES, Context.MODE_PRIVATE);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        GTflag = mSettings.getInt(APP_PREFERENCES_GT, 0);

        GT=(Switch)findViewById(R.id.GameTime);
        if(GTflag==1)
        GT.setChecked(true);
else if(GTflag==0){
            GT.setChecked(false);
        }
        GT.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                // в зависимости от значения isChecked выводим нужное сообщение
                if (isChecked) {
GTflag=1;

                    SharedPreferences.Editor editor = mSettings.edit();
                    editor.putInt(APP_PREFERENCES_GT, GTflag);
                    editor.apply();                   // Toast.makeText(getApplicationContext(), "SET ON", Toast.LENGTH_SHORT).show();
                } else {
                    GTflag=0;
                    SharedPreferences.Editor editor = mSettings.edit();
                    editor.putInt(APP_PREFERENCES_GT, GTflag);
                    editor.apply();
                    // Toast.makeText(getApplicationContext(), "SET OFF", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    /*@Override
    protected void onResume() {
        super.onResume();

        if (mSettings.contains(APP_PREFERENCES_GT)) {
            // Получаем число из настроек
            GTflag = mSettings.getInt(APP_PREFERENCES_GT, 0);
            GTflag_=GTflag;
            // Выводим на экран данные из настроек

            if(FlagSave==false){
                FlagSave=true;
                SharedPreferences.Editor editor = mSettings.edit();
                editor.putInt(APP_PREFERENCES_GT, GTflag);
                editor.apply();
            }

        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        // Запоминаем данные
        SharedPreferences.Editor editor = mSettings.edit();
        editor.putInt(APP_PREFERENCES_GT, GTflag);
        editor.apply();
    }*/
}