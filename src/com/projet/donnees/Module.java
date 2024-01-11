package com.projet.donnees;

public class Module {
    private String intitule;
    private Fillieres fil;
    private Enseignant professeur;


    // Constructeur
    public Module() {
        this.intitule = intitule;
        this.fil = fil;
        this.professeur = professeur;
    }
    // Getters et setters
    public String getintitule() {
        return intitule;
    }

    public void setintitule(String intitule) {
        this.intitule = intitule;
    }

    public Fillieres  getfil() {
        return fil;
    }

    public void setfil(Fillieres fil) {
        this.fil = fil;
    }

    public Enseignant getprofesseur() {
        return professeur;
    }
    public void setprofesseur(Enseignant professeur) {
        this.professeur = professeur;
    }

}
