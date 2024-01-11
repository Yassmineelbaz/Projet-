package com.projet.donnees;

public class Note {
    private float note;
    private Etudiant etudiant;
    private Fillieres filiere;

    public Note() {
    }

    public Note(float note, Etudiant etudiant, Fillieres filiere) {
        this.note = note;
        this.etudiant = etudiant;
        this.filiere = filiere;
    }

    public float getNote() {
        return note;
    }

    public void setNote(float note) {
        this.note = note;
    }

    public Etudiant getEtudiant() {
        return etudiant;
    }

    public void setEtudiant(Etudiant etudiant) {
        this.etudiant = etudiant;
    }

    public Fillieres getFiliere() {
        return filiere;
    }

    public void setFiliere(Fillieres filiere) {
        this.filiere = filiere;
    }
}
