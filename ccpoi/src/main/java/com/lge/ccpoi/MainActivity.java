package com.lge.ccpoi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button reg_button = (Button) findViewById(R.id.button_reg);
        reg_button.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });

        Button view_button = (Button) findViewById(R.id.button_view);
        view_button.setOnClickListener(new Button.OnClickListener() {
           public void onClick(View v) {
               Intent intent = new Intent(MainActivity.this, ViewActivity.class);
               startActivity(intent);
           }
        });
    }
}
