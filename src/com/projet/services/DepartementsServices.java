package com.projet.services;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Iterator;
import com.projet.donnees.Departements;
import com.projet.donnees.Enseignant;
public class DepartementsServices {
    public DepartementsServices() {
    }

    public static Departements addDept(String intitule, String responsableId) {
        Departements departement = new Departements(intitule, responsableId, DB.getDeptId());
        DB.departements.add(departement);
        return departement;
    }

    public static Departements updateDept(int id, String intitule, String responsableId) {
        for (Departements departement : DB.departements) {
            if (departement.getiDDepar() == id) {
                departement.setintitule(intitule);
                departement.setresponsable(responsableId);
                return departement;
            }
        }
        return null;
    }

    private static Enseignant[] responsable() {
        return responsable();
    }

    public static ArrayList<Departements> deleteDeptById(int id) {
        Departements deptToRemove = getDeptById(id);
        if (deptToRemove != null) {
            DB.departements.remove(deptToRemove);
        }
        return DB.departements;
    }

    public static Departements getDeptById(int id) {
        for (Departements departement : DB.departements) {
            if (departement.getiDDepar() == id) {
                return departement;
            }
        }
        return null;
    }

    public static ArrayList<Departements> getAllDept() {
        return DB.departements;
    }

    private int id;


}
