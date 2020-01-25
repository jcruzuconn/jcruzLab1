package com.example.jcruzlab1;

import androidx.appcompat.app.AppCompatActivity;

import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(getApplicationContext(),"onCreate is Here!",Toast.LENGTH_SHORT).show();
        Log.i(TAG,"onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();

        Toast.makeText(getApplicationContext(),"onStart is Here!",Toast.LENGTH_SHORT).show();
        Log.i(TAG,"onStart");

    }

    @Override
    protected void onResume() {
        super.onResume();

        Toast.makeText(getApplicationContext(),"onResume is Here!",Toast.LENGTH_SHORT).show();
        Log.i(TAG,"onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Toast.makeText(getApplicationContext(),"onPause is Here!",Toast.LENGTH_SHORT).show();
        Log.i(TAG,"onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Toast.makeText(getApplicationContext(),"onStop is Here!",Toast.LENGTH_SHORT).show();
        Log.i(TAG,"onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Toast.makeText(getApplicationContext(),"onDestroy is Here!",Toast.LENGTH_SHORT).show();
        Log.i(TAG,"onDestroy");
    }


}