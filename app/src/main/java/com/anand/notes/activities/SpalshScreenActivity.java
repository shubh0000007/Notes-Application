package com.anand.notes.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.anand.notes.R;

public class SpalshScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spalsh_screen);

        new Handler().postDelayed(this::gotoMainActivity, 3000);


    }

    private void gotoMainActivity(){
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }
}