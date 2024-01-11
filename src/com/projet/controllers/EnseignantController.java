package com.projet.controllers;

import java.io.PrintStream;
import java.util.Iterator;

import com.projet.donnees.Enseignant;
import com.projet.services.DB;

public class EnseignantController {
    public EnseignantController() {
    }

    public static void showMenu() {
    }

    public static void showEnseignants() {
        Iterator var0 = DB.enseignants.iterator();

        while(var0.hasNext()) {
            Enseignant enseignant = (Enseignant)var0.next();
            System.out.print("Id : " + enseignant.getiDens());
            PrintStream var10000 = System.out;
            String var10001 = enseignant.getnom();
            var10000.print(" | Nom : " + var10001 + " " + enseignant.getprenom());
            System.out.print(" | Email : " + enseignant.getemail());
            System.out.println("");
        }

    }

    public static void createEnseignant() {
    }

    public static void editEnseignant() {
    }

    public static void destroyEnseignant() {
    }
}
