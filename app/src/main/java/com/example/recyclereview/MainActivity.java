package com.example.recyclereview;

import static androidx.recyclerview.widget.RecyclerView.*;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recylerviewetudiant;
    LayoutManager layoutManager;
    etudiantadapter  adapter;

        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recylerviewetudiant =(RecyclerView)findViewById(R.id.rcetudiant);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recylerviewetudiant.setLayoutManager(layoutManager);
        adapter = new etudiantadapter( this,EtudiantContent.getetudiant());
recylerviewetudiant.setAdapter(adapter);
            DividerItemDecoration dividerItemDecoration=new
                    DividerItemDecoration(recylerviewetudiant.getContext(),DividerItemDecoration.VERTICAL);
            recylerviewetudiant.addItemDecoration(dividerItemDecoration);
            List<etudiant> listeEtudiant = EtudiantContent.getetudiant();
    }
}