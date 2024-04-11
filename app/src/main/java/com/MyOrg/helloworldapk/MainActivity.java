package com.MyOrg.helloworldapk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.MyOrg.helloworld.R;

public class MainActivity extends AppCompatActivity {
	
	int a =10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void b_exitClick(View view) {
        System.exit(0);
    }
}