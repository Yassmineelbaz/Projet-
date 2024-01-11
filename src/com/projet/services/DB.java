package com.projet.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.projet.donnees.Departements;
import com.projet.donnees.Enseignant;
import com.projet.donnees.Etudiant;
import com.projet.donnees.Fillieres;
import com.projet.donnees.Module;
import com.projet.donnees.Note;
import com.projet.services.FiliereServices;
import com.projet.controllers.FillieresController;

public class DB {
    public static int DEPT_ID = 0;
    public static int ENS_ID = 0;
    public static int ETD_ID = 0;
    public static int FIL_ID = 0;
    public static int MOD_ID = 0;
    public static ArrayList<Departements> departements = new ArrayList();
    public static ArrayList<Enseignant> enseignants = new ArrayList();
    public static ArrayList<Fillieres> filieres = new ArrayList();
    public static ArrayList<Module> modules = new ArrayList();
    public static ArrayList<Etudiant> etudiants = new ArrayList();
    public static ArrayList<Note> notes = new ArrayList();

    public DB() {
    }

    public static int getDeptId() {
        ++DEPT_ID;
        return DEPT_ID;
    }

    public static int getEnsId() {
        ++ENS_ID;
        return ENS_ID;
    }
    public static List<Fillieres> filiere = new ArrayList<>();

    private static final String DB_URL = "jdbc:mysql://localhost:3306/SystEducative";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
    }
}
