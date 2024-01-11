package com.projet.services;

import java.util.ArrayList;
import com.projet.donnees.Etudiant;
import com.projet.donnees.Fillieres;

public class EtudiantServices {
    public EtudiantServices() {
    }

    public static Etudiant addEtd(String nom, String prenom, String email, int apogee, Fillieres filier) {
        return new Etudiant();
    }

    public static Etudiant updateEtd(int id, String nom, String prenom, String email, int apogee, Fillieres filier) {
        return new Etudiant();
    }

    public static ArrayList<Etudiant> deleteEtdById(int id) {
        return DB.etudiants;
    }

    public static Etudiant getEtdById(int id) {
        String nom;
        return new Etudiant();
    }

    public static ArrayList<Etudiant> getAllEtd() {
        return DB.etudiants;
    }

}
