package com.example.recyclereview;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class etudiantadapter extends
        RecyclerView.Adapter<etudiantadapter.EtudiantViewHolder>{
    private Context context;
    private List<etudiant> listeEtudiant;

    public etudiantadapter(Context context, List<etudiant> listeEtudiant) {
        this.context = context;
        this.listeEtudiant = listeEtudiant;
    }




    @Override
    public EtudiantViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclereviewitem,
                parent,false);
        EtudiantViewHolder etudiantViewHolder = new EtudiantViewHolder(view);
        return etudiantViewHolder;
    }


    @Override
    public void onBindViewHolder(@NonNull EtudiantViewHolder holder, int position) {
        etudiant etudiant=listeEtudiant.get(position);
        holder.Matricule.setText(((com.example.recyclereview.etudiant) etudiant).getMatricule());
        holder.nom.setText(etudiant.getNom());

    }

    @Override
    public int getItemCount() {
        return listeEtudiant.size();
    }


    public static class EtudiantViewHolder extends RecyclerView.ViewHolder{
        TextView Matricule;
        TextView nom;

        public EtudiantViewHolder(View itemView){
            super(itemView);
            Matricule= itemView.findViewById(R.id.Matricule);
            nom= itemView.findViewById(R.id.Nom);
        }

    }

}