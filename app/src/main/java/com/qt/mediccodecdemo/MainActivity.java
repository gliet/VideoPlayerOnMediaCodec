package com.qt.mediccodecdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClick(View view){
        switch(view.getId()){
            case R.id.button:
                startActivity(new Intent(MainActivity.this,VideoPlayerActivity.class));
                break;

        }

    }
}
