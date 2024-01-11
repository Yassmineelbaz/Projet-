package com.projet.donnees;

public class Fillieres {


    private static int count = 0;
    private int idFiliere;
    private String intitule;
    private Enseignant responsable;
    private Departements departe;

    // Constructeur
    public Fillieres() {

        this.idFiliere = idFiliere;
        this.intitule = intitule;
        this.responsable = responsable;
        this.departe = departe;
    }



    // Getters et setters
    public String getintitule() {
        return intitule;
    }

    public void setintitule(String intitule) {
        this.intitule = intitule;
    }

    public Enseignant  getresponsable() {
        return responsable;
    }

    public void setresponsable(Enseignant responsable) {
        this.responsable = responsable;
    }

    public Departements getdeparte() {
        return departe;
    }
    public void setdeparte(Departements departe) {
        this.departe = departe;
    }

public int getIdFiliere() {
    return idFiliere;
}
public void setidFiliere(int idFiliere) {
    this.idFiliere = idFiliere;
}

  }


