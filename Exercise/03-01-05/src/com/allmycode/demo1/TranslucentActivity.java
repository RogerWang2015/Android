package com.allmycode.demo1;

import android.os.Bundle;
import android.util.Log;

public class TranslucentActivity extends MyActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_break);
    }

    @Override
    void logStuff(String message) {
        Log.w("TranslucentActivity", message);
    }
}
