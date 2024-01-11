package com.projet.controllers;

import java.util.Iterator;

import com.projet.donnees.Etudiant;
import com.projet.donnees.Fillieres;
import com.projet.services.DB;
import com.projet.menu.Main;


public class EtudiantController {

    public EtudiantController() {
    }

    public static void showMenu() {
        System.out.println("-------------------------[ Etudiant ]---------------------------");
        System.out.println("1: Pour ajouter un Etudiant");
        System.out.println("2: Pour afficher les Etudiant");
        System.out.println("3: Pour modifier un Etudiant");
        System.out.println("4: Pour supprimer un Etudiant");
        System.out.println("0: Pour retourner au menu principal");
        int option = Main.getIntInput(new String[]{"Veuillez sélectionner une option : "});
        switch (option) {
            case 1:

                addEtudiant();
                break;
            case 2:
                showEtudiant();
                break;
            case 3:
                editEtudiant();
                break;
            case 4:
                deleteEtudiant();
                break;
            default:
                Main.showPrincipalMenu();
        }

    }


    public static void showEtudiant() {
        Iterator var0 = DB.etudiants.iterator();

        while (var0.hasNext()) {
            Etudiant etudiant = (Etudiant) var0.next();
            System.out.print("Apogée : " + etudiant.getapogee());
            System.out.print(" | Nom : " + etudiant.getnom() + " " + etudiant.getprenom());
            System.out.print(" | Email : " + etudiant.getemail());
            System.out.print(" | Filière : " + etudiant.getfilier().getintitule());
            System.out.println("");
        }
    }

    public static void addEtudiant() {

        System.out.println("Entrez les informations de l'étudiant :");

        String nom = Main.getStringInput(new String[]{"Nom : "});
        String prenom = Main.getStringInput(new String[]{"Prénom : "});
        String email = Main.getStringInput(new String[]{"Email : "});
        int apogee = Main.getIntInput(new String[]{"Apogée : "});

        // Afficher la liste des filières pour aider à la sélection
        FillieresController.showFillieres();

        int idFiliere = Main.getIntInput(new String[]{"Sélectionnez l'ID de la filière : "});
        Fillieres filiere = FillieresController.getFiliereById(idFiliere);

        if (filiere != null) {
            EtudiantController.addEtudiant();
            System.out.println("Étudiant ajouté avec succès.");
        } else {
            System.out.println("Filière non trouvée. Veuillez réessayer.");
        }
    }

    public static void editEtudiant() {
        showEtudiant();
        int apogee = Main.getIntInput(new String[]{"Sélectionnez l'Apogée de l'étudiant à modifier : "});

        Etudiant etudiant = getEtudiantByApogee(apogee);
        if (etudiant != null) {
            System.out.println("Entrez les nouvelles informations de l'étudiant :");

            String nom = Main.getStringInput(new String[]{"Nouveau nom : "});
            String prenom = Main.getStringInput(new String[]{"Nouveau prénom : "});
            String email = Main.getStringInput(new String[]{"Nouvel email : "});

            // Afficher la liste des filières pour aider à la sélection
            FillieresController.showFilieres();

            int idFiliere = Main.getIntInput(new String[]{"Sélectionnez le nouvel ID de la filière : "});
            Fillieres filiere = FillieresController.getFiliereById(idFiliere);

            if (filiere != null) {
                etudiant.setnom(nom);
                etudiant.setprenom(prenom);
                etudiant.setemail(email);
                etudiant.setfilier(filiere);
                System.out.println("Étudiant modifié avec succès.");
            } else {
                System.out.println("Filière non trouvée. Veuillez réessayer.");
            }
        } else {
            System.out.println("Étudiant non trouvé. Veuillez réessayer.");
        }
    }

    public static void deleteEtudiant() {

        showEtudiant();
        int apogee = Main.getIntInput(new String[]{"Sélectionnez l'Apogée de l'étudiant à supprimer : "});

        Etudiant etudiant = getEtudiantByApogee(apogee);
        if (etudiant != null) {
            EtudiantController.deleteEtudiant();
            System.out.println("Étudiant supprimé avec succès.");
        } else {
            System.out.println("Étudiant non trouvé. Veuillez réessayer.");
        }
    }

    public static Etudiant getEtudiantByApogee(int apogee) {

        for (Etudiant etudiant : DB.etudiants) {
            if (etudiant.getapogee() == apogee) {
                return etudiant;
            }
        }
        return null;
    }
}