package com.example.lb3v2;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class SecondAct extends AppCompatActivity {

    final String TAG = "Sates";
    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent =getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        TextView textView =new TextView(this);
        textView.setText(message);
        setContentView(textView);
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "Create Message Activity: onRestart()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TAG, "Create Message Activity: onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "Create Message Activity: onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v(TAG, "Create Message Activity: onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.w(TAG, "Create Message Activity: onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "Create Message Activity: onDestroy()");
    }
}