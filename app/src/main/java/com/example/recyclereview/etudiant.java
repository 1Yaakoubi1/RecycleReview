package com.example.recyclereview;

public class etudiant {
    private String matricule ;
    private String Nom ;

    public String getMatricule() {
        return matricule;
    }

    public String getNom() {
        return Nom;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    @Override
    public String toString() {
        return "etudiant{" +
                "matricule='" + matricule + '\'' +
                ", Nom='" + Nom + '\'' +
                '}';
    }

    public etudiant(String matricule, String nom) {
        this.matricule = matricule;
        this.Nom=nom;

    }
}
