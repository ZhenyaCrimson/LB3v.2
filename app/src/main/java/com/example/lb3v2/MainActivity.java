package com.example.lb3v2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {


    public static final String EXTRA_MESSAGE ="com.example.lb3v2.MESSAGE";
    final String TAG = "Sates";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

    public void onSendMessage (View view){
        Intent intent = new Intent(this, SecondAct.class);
        EditText messageView = (EditText) findViewById(R.id.editText);
        String message = messageView.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}