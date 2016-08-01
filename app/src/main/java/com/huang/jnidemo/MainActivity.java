package com.huang.jnidemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(getApplicationContext(),""+getStringFromJNI(1,1),Toast.LENGTH_SHORT).show();
    }
    static{
        System.loadLibrary("jni_lib");
    }
    public native int getStringFromJNI(int a,int b);
}
