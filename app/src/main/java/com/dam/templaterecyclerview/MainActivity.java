package com.dam.templaterecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.transition.Slide;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    /* var globales */
    private String[] stagiaires = new String[] {
            "Nelson",
            "Charbel",
            "Hicham",
            "Walid",
            "Sam",
            "Antoine",
            "Nassir",
            "Ben",
            "Sonia",
            "Ons",
            "Anh Hoang"
    };

    private String[] descriptions;

    private int[] avatars = {
            R.drawable.stagiaire_01,
            R.drawable.stagiaire_02,
            R.drawable.stagiaire_03,
            R.drawable.stagiaire_04,
            R.drawable.stagiaire_05,
            R.drawable.stagiaire_06,
            R.drawable.stagiaire_07,
            R.drawable.stagiaire_08,
            R.drawable.stagiaire_09,
            R.drawable.stagiaire_010,
            R.drawable.stagiaire_011
    };

    /* Methode d'initialisation des widgets */

    private void initUI() {
        recyclerView = findViewById(R.id.recyclerView);

        //initialisation des données
        descriptions = getResources().getStringArray(R.array.description);
    }

    /* Methodes pour le fonctionnement de l'app */
    private void remplissageRecycler(){
        RecyclerAdapter adapter = new RecyclerAdapter(this,
                stagiaires, descriptions, avatars);
        recyclerView.setAdapter(adapter);

        // Gestion du layout pour le positionnement des items
        LinearLayoutManager layoutManager = new LinearLayoutManager(
                this,
                LinearLayoutManager.VERTICAL,
                false);
        recyclerView.setLayoutManager(layoutManager);

        //decoration
        RecyclerView.ItemDecoration itemDecoration = new DividerItemDecoration(this, DividerItemDecoration.VERTICAL);
        recyclerView.addItemDecoration(itemDecoration);


    }

    /* Methodes du cycle de vie */


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initUI();
        remplissageRecycler();
    }
}