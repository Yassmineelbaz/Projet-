package com.projet.services;

import java.util.ArrayList;
import com.projet.donnees.Departements;
import com.projet.donnees.Enseignant;
import com.projet.donnees.Fillieres;
public class FiliereServices {
    public FiliereServices() {
    }

    public static Fillieres addFiliere(String intitule, Enseignant chef, Departements dept) {
        return new Fillieres();
    }

    public static Fillieres updateFiliere(int id, String intitule, Enseignant chef, Departements dept) {
        return new Fillieres();
    }

    public static ArrayList<Fillieres> deleteFiliereById(int id) {
        return DB.filieres;
    }

    public static Fillieres getFiliereById(int id) {
        return new Fillieres();
    }

    public static ArrayList<Fillieres> getAllFiliere() {
        return DB.filieres;
    }
}

