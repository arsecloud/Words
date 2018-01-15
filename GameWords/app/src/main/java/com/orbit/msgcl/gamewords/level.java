package com.orbit.msgcl.gamewords;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

/**
 * Created by MSGcl on 12.12.2017.
 */
public class level extends Activity {
    protected static int key=0;
private Button ea;
    private Button mid;
    private Button hi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.levels);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        ea = (Button)findViewById(R.id.easy);
        ea.setTypeface(Typeface.createFromAsset(getAssets(), "font.otf"));

        mid = (Button)findViewById(R.id.middle);
        mid.setTypeface(Typeface.createFromAsset(getAssets(), "font.otf"));
        hi = (Button)findViewById(R.id.high);
        hi.setTypeface(Typeface.createFromAsset(getAssets(), "font.otf"));

    }
    public void onClickSet(View view) {
        key=1;
            Intent intent = new Intent(level.this, classic.class);
            startActivity(intent);

    }
    public void onClickSet1(View view) {
        key=2;
        Intent intent = new Intent(level.this, classic.class);
        startActivity(intent);

    }
    public void onClickSet2(View view) {
        key=3;
        Intent intent = new Intent(level.this, classic.class);
        startActivity(intent);

    }

    protected final int  alue(){
        return key;
    }
}
