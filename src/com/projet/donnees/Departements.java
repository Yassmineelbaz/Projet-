 package com.projet.donnees;

public class Departements {
    private int iDDepar;
    private String intitule ;
    private String responsable;
    private String enseignant;
    private int id;
    // Constructeur
    public Departements(String iDDepart, String responsable, int id) {
        this.id = this.id;
        this.iDDepar = iDDepar;
        this.intitule = intitule;
        this.responsable = this.responsable;
        this.enseignant = enseignant;
    }
    // Getters et setters
    public int getiDDepar() {
        return iDDepar;
    }

    public void setiDDepar(int iDDepar) {
        this.iDDepar = iDDepar;
    }
    public String getintitule() {
        return intitule;
    }

    public void setintitule(String intitule) {
        this.intitule = intitule;
    }

    public String getresponsable() {
        return responsable;
    }

    public void setresponsable(String responsable) {
        this.responsable = responsable;
    }
    public String getenseignant() {
        return enseignant;
    }

    public void setenseignant(String enseignant) {
        this.enseignant = enseignant;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }




    public void setresponsable(Enseignant enseignants) {
    }

}
