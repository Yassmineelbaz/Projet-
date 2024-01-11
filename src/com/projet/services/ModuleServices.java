package com.projet.services;

import java.util.ArrayList;
import com.projet.donnees.Enseignant;
import com.projet.donnees.Fillieres;
import com.projet.donnees.Module;

public class ModuleServices {
    public ModuleServices() {
    }

    public static Module addFiliere(String intitule, Enseignant chef, Fillieres filiere) {
        return new Module();
    }

    public static Module updateFiliere(int id, String intitule, Enseignant chef, Fillieres filiere) {
        return new Module();
    }

    public static ArrayList<Module> deleteModuleById(int id) {
        return DB.modules;
    }

    public static Module getModuleById(int id) {
        return new Module();
    }

    public static ArrayList<Module> getAllModule() {
        return DB.modules;
    }
}
