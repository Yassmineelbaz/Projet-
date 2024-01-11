package com.projet.services;

import java.util.ArrayList;
import java.util.Iterator;
import com.projet.donnees.Departements;
import com.projet.donnees.Enseignant;

public class EnseignantServices {
    public EnseignantServices() {
    }

    public static Enseignant addEns(String nom, String prenom, String email, String grade, Departements dept) {
        return new Enseignant();
    }

    public static Enseignant updateEns(int id, String nom, String prenom, String email, String grade, Departements dept) {
        return new Enseignant();
    }

    public static ArrayList<Enseignant> deleteEnsById(int id) {
        return DB.enseignants;
    }

    public static Enseignant getEnsById(int id) {
        Iterator var1 = DB.enseignants.iterator();

        Enseignant enseignant;
        do {
            if (!var1.hasNext()) {
                return new Enseignant();
            }

            enseignant = (Enseignant)var1.next();
        } while(enseignant.getiDens() != id);

        return enseignant;
    }

    public static ArrayList<Enseignant> getAllEns() {
        return DB.enseignants;
    }
}
