package com.projet.donnees;

public class Enseignant {
    private int iDens;
    private String prenom;
    private String nom;
    private String email;
    private String grade;
    private Departements depart;

    // Constructeur
    public Enseignant() {
        this.iDens = iDens;
        this.prenom = prenom;
        this.nom = nom;
        this.email = email;
        this.grade = grade;
        this.depart = depart;

    }



    // Getters et setters
    public int getiDens() {
        return iDens;
    }

    public void setIdens(int Idens) {
        this.iDens = Idens;
    }
    public String getprenom() {
        return prenom;
    }

    public void setprenom(String prenom) {
        this.prenom = prenom;
    }

    public String getnom() {
        return nom;
    }

    public void setnom(String nom) {
        this.nom = nom;
    }

    public String getemail() {
        return email;
    }
    public void setemail(String email) {
        this.email = email;
    }
    public String getgrade() {
        return grade;
    }
    public void setgrade(String grade) {
        this.grade = grade;
    }
    public Departements getdepart() {
        return depart;
    }
    public void setdepart(Departements depart) {
        this.depart = depart;
    }



}
