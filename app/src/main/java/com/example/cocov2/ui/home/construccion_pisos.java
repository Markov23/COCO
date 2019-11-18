package com.example.cocov2.ui.home;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.cocov2.R;

public class construccion_pisos extends AppCompatActivity {

    private LinearLayout escaleras;
    private LinearLayout pisosSobrePisos;
    private LinearLayout paredes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_construccion_pisos);
    }
    public void pisos(View view){
        Intent intent = new Intent(this, construccionPisos.class);
        startActivity(intent);
    }
    public void paredes(View view){
        Intent intent = new Intent(this, construccionEscaleras.class);
        startActivity(intent);
    }
    public void escaleras(View view){
        Intent intent = new Intent(this, construccionEscaleras.class);
        startActivity(intent);
    }
}
