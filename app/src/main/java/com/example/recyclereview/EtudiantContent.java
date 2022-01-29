package com.example.recyclereview;

import java.util.ArrayList;
import java.util.List;

public class EtudiantContent {
    public static List<etudiant> getetudiant()
    {
        ArrayList<etudiant>etudiants=new ArrayList<etudiant>();
                etudiants.add(new etudiant("915", "Sfaxi"));
        etudiants.add(new etudiant("912", "msallem"));
        etudiants.add(new etudiant("911", "ettounsi"));
        etudiants.add(new etudiant("910", "mejbri"));
        etudiants.add(new etudiant("907", "rebhi"));
        return etudiants;
    }
}
