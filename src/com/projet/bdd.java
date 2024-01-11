package com.projet;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import com.projet.controllers.DepartementsController;
import com.projet.donnees.Departements;
import com.projet.services.DB;


public class bdd {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/systemeeducative";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    public static void main(String[] args) {
        try (Connection cx = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD)) {
            System.out.println("Connecté avec succès");

            DepartementsController.showDepartements();
            DepartementsController departementsController = new DepartementsController();

            List<Departements> departements = departementsController.getAllDepartements(cx);
            for (Departements departement : departements) {
                System.out.println(departement.toString());
            }

        } catch (SQLException ex) {
            System.out.println("Une erreur s'est produite");
            ex.printStackTrace();  // Affichez la trace complète pour déboguer
        }
    }
    public static void createDepartement(String intitule, String responsable) {
        try (Connection cx = DB.getConnection()) {
            DepartementsController.createDepartement();
            String query = "INSERT INTO departements (intitule, iDDepar) VALUES (?, ?)";
            try (PreparedStatement ps = cx.prepareStatement(query)) {

                ps.setString(1, intitule);

                ps.setString(2, responsable);


                ps.executeUpdate();

                System.out.println("Département ajouté avec succès !");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Une erreur s'est produite lors de l'ajout du département.");
        }
    }
}




