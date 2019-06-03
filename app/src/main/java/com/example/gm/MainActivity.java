package com.example.gm;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    private Button ubicarme;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ubicarme=(Button)findViewById(R.id.ubicarme);


        ubicarme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inten =new Intent(MainActivity.this, MapActivity.class);
                startActivity(inten);
            }
        });


    }

}
