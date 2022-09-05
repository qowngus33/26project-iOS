package com.example.myapplication;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.ui.AppBarConfiguration;

import com.example.myapplication.databinding.ActivityMainBinding;

public class ContentActivity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;
    private Button backButton;
    private Button nextButton;
    private Button E_button;
    private Button I_button;
    private int [] list = {0,0,0,0};
    private int value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        backButton = findViewById(R.id.back);
        nextButton = findViewById(R.id.next);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),ContentActivity2.class);
                intent.putExtra("list",list);
                startActivity(intent);
            }
        });

        E_button = findViewById(R.id.E_button);
        I_button = findViewById(R.id.I_button);

        E_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                E_button.setBackgroundColor(Color.parseColor("#D3D3D3"));
                I_button.setBackgroundColor(Color.parseColor("#FFFFFF"));
                list[0] = 1;
            }
        });
        I_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                I_button.setBackgroundColor(Color.parseColor("#D3D3D3"));
                E_button.setBackgroundColor(Color.parseColor("#FFFFFF"));
                list[0] = -1;
            }
        });
    }
}