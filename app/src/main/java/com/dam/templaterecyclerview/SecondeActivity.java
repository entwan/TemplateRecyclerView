package com.dam.templaterecyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class SecondeActivity extends AppCompatActivity {

    private TextView tvD_Stagiaire;
    private TextView tvD_Desc;
    private ImageView ivD_Avatar;

    private void initUI() {
        tvD_Stagiaire = findViewById(R.id.tvD_Stagiaire);
        tvD_Desc = findViewById(R.id.tvD_Desc);
        ivD_Avatar = findViewById(R.id.ivD_Avatar);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seconde);

        initUI();

        // Récupération des données de l'intent
        Intent intent = getIntent();

        String stagiaire = intent.getStringExtra("stagiaire");
        tvD_Stagiaire.setText(stagiaire);

        String description = intent.getStringExtra("desc");
        tvD_Desc.setText(description);

        int avatar = intent.getIntExtra("avatar",0);
        ivD_Avatar.setImageResource(avatar);



    }


}