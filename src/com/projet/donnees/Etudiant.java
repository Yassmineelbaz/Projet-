package com.projet.donnees;

import com.projet.services.DB;

public class Etudiant {
    private String nom;
    private String prenom;
    private String email;
    private int apogee;
    private Fillieres filier;


    // Constructeur
    public Etudiant() {
        this.nom = this.nom;
        this.prenom = this.prenom;
        this.email = this.email;
        this.apogee = this.apogee;
        this.filier = this.filier;
    }
    // Getters et setters
    public String getnom() {
        return nom;
    }

    public void setnom(String nom) {
        this.nom = nom;
    }

    public String  getprenom() {
        return prenom;
    }

    public void setprenom(String prenom) {
        this.prenom = prenom;
    }

    public int getapogee() {
        return apogee;
    }
    public void setapogee(int apogee) {
        this.apogee =apogee;
    }
    public String getemail() {
        return email;
    }
    public void setemail(String email) {
        this.email = email;
    }
    public Fillieres getfilier() {
        return filier;
    }

    public void setfilier(Fillieres filier) {
        this.filier = filier;
    }

    public void ajouterModuleAValider() {

    }
    public static void deleteEtudiant(Etudiant etudiant) {
        DB.etudiants.remove(etudiant);
    }
}


