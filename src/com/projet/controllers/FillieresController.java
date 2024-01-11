package com.projet.controllers;

import com.projet.donnees.Fillieres;
import com.projet.donnees.Enseignant;
import com.projet.donnees.Departements;
import com.projet.menu.Main;
import com.projet.services.DB;
import com.projet.services.EnseignantServices;
import com.projet.services.DepartementsServices;

public class FillieresController {

    public FillieresController() {
    }

    public static void showMenu() {
        System.out.println("-------------------------[ Fillières ]---------------------------");
        System.out.println("1: Pour ajouter une Filière");
        System.out.println("2: Pour afficher les Filières");
        System.out.println("3: Pour modifier une Filière");
        System.out.println("4: Pour supprimer une Filière");
        System.out.println("0: Pour retourner au menu principal");

        int option = Main.getIntInput(new String[]{"Veuillez sélectionner une option : "});

        switch (option) {
            case 1:
                addFiliere();
                break;
            case 2:
                showFilieres();
                break;
            case 3:
                editFiliere();
                break;
            case 4:
                deleteFiliere();
                break;
            default:
                Main.showPrincipalMenu();
        }
    }

    public static void showFilieres() {
        for (Fillieres filiere : DB.filieres) {
            System.out.println("Id : " + filiere.getIdFiliere());
            System.out.println("Intitulé : " + filiere.getintitule());
            System.out.println("Responsable : " + filiere.getresponsable().getnom());
            System.out.println("");
        }
    }

    public static void addFiliere() {
        String intitule = Main.getStringInput(new String[]{"Entrez l'intitulé de la filière :"});
        EnseignantController.showEnseignants();
        int idEns = Main.getIntInput(new String[]{"Sélectionnez un enseignant responsable par id :"});
        Enseignant responsable = EnseignantServices.getEnsById(idEns);
        DepartementsController.showDepartements();
        int idDep = Main.getIntInput(new String[]{"Sélectionnez un département par id :"});
        Departements departement = DepartementsServices.getDeptById(idDep);

        Fillieres nouvelleFiliere = new Fillieres();
        DB.filiere.add(nouvelleFiliere);

        }

    public static void editFiliere() {
        showFillieres();
        int id = Main.getIntInput(new String[]{"Sélectionnez une filière par id :"});
        Fillieres filiere = getFiliereById(id);

        if (filiere != null) {
            String intitule = Main.getStringInput(new String[]{"Entrez le nouvel intitulé de la filière :"});
            EnseignantController.showEnseignants();
            int idEns = Main.getIntInput(new String[]{"Sélectionnez un nouvel enseignant responsable par id :"});
            Enseignant responsable = EnseignantServices.getEnsById(idEns);
            DepartementsController.showDepartements();
            int idDep = Main.getIntInput(new String[]{"Sélectionnez un nouveau département par id :"});
            Departements departement = DepartementsServices.getDeptById(idDep);

            filiere.setintitule(intitule);
            filiere.setresponsable(responsable);
            filiere.setdeparte(departement);
        }
    }

    public static void showFillieres() {
        System.out.println("-------------------------[ Filières ]---------------------------");
        for (Fillieres filiere : DB.filieres) {
            System.out.println("Id : " + filiere.getIdFiliere());
            System.out.println("Intitulé : " + filiere.getintitule());
            System.out.println("Responsable : " + filiere.getresponsable().getnom());
            System.out.println("");
        }
    }

    public static void deleteFiliere() {
        showFillieres();
        int id = Main.getIntInput(new String[]{"Sélectionnez une filiere par id :"});
        Fillieres filiere = getFiliereById(id);

        if (filiere != null) {
            System.out.println("Voulez-vous vraiment supprimer la filiere : " + filiere.getintitule() + " ? (oui/non)");
            String confirmation = Main.getStringInput(new String[]{""});

            if (confirmation.equalsIgnoreCase("oui")) {
                DB.filieres.remove(filiere);
                System.out.println("La filière a ete supprimée avec succes.");
            } else {
                System.out.println("La suppression de la filière a été annulée.");
            }
        }

    }

    public static Fillieres getFiliereById(int idFiliere) {
        for (Fillieres filiere : DB.filieres) {
            if (filiere.getIdFiliere() == idFiliere) {
                return filiere;
            }
        }
        return null;
    }
}
