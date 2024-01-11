
package com.projet.controllers;
import java.io.PrintStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import com.projet.menu.Main;
import com.projet.donnees.Departements;
import com.projet.donnees.Enseignant;
import com.projet.services.DB;
import com.projet.services.DepartementsServices;
import com.projet.services.EnseignantServices;

                public class DepartementsController {
                    public DepartementsController() {
                    }

                    public static void showMenu() {
                        System.out.println("-------------------------[ Départements ]---------------------------");
                        System.out.println("1: Pour ajouter un département");
                        System.out.println("2: Pour afficher les départements");
                        System.out.println("3: Pour modifier un département");
                        System.out.println("4: Pour supprimer un département");
                        System.out.println("0: Pour retourner au menu principal");
                        int option = Main.getIntInput(new String[]{"Veuillez sélectionner une option : "});
                        switch (option) {
                            case 1:
                                createDepartement();
                                break;
                            case 2:
                                showDepartements();
                                break;
                            case 3:
                                editDepartement();
                                break;
                            case 4:
                                destroyDepartement();
                                break;
                            default:
                                Main.showPrincipalMenu();
                        }

                    }

                    public static void showDepartements() {
                        List<Departements> departements = getAllDepartementsFromDatabase();
                        if (departements.isEmpty()) {
                            System.out.println("Aucun département trouvé.");
                            return;
                        }

                        for (Departements departement : departements) {
                            System.out.print("Id : " + departement.getiDDepar());
                            System.out.println(" | Intitulé : " + departement.getintitule());
                        }

                    }

                    private static List<Departements> getAllDepartementsFromDatabase() {
                        return DepartementsServices.getAllDept();
                    }

                    public static void createDepartement() {
                        String intitule = Main.getStringInput(new String[]{"Entrez l'intitulé :"});
                        EnseignantController.showEnseignants();
                        int id = Main.getIntInput(new String[]{"Sélecionnez un enseignant par id :"});
                        DepartementsServices.addDept(intitule, Arrays.toString(new Enseignant[]{EnseignantServices.getEnsById(id)}));
                        /*showDepartements();*/
                        System.out.println("Departement "+ intitule +" est ajoute" );
                       showMenu();
                    }

                    public static void editDepartement() {
                        showDepartements();
                        int id = Main.getIntInput(new String[]{"Sélecionnez un departement par id :"});
                        String intitule = Main.getStringInput(new String[]{"Entrez l'intitulé :"});
                        EnseignantController.showEnseignants();
                        int idEns = Main.getIntInput(new String[]{"Sélecionnez un enseignant par id :"});
                        DepartementsServices.updateDept(id, intitule, Arrays.toString(new Enseignant[]{EnseignantServices.getEnsById(idEns)}));
                        showDepartements();
                        showMenu();
                    }

                    public static void destroyDepartement() {
                        showDepartements();
                        int id = Main.getIntInput(new String[]{"Sélecionnez un departement par id :"});
                        DepartementsServices.deleteDeptById(id);
                        showDepartements();
                    }

                    public static List<Departements> getAllDepartements(Connection cx) throws SQLException {
                        String query = "SELECT * FROM departements";
                        List<Departements> departements = new ArrayList<>();

                        try (Statement st = cx.createStatement();
                             ResultSet r = st.executeQuery(query)) {

                            while (r.next()) {
                                departements.add(new Departements(
                                        r.getString("iDDepart"),
                                        r.getString("responsable"),
                                        r.getInt("id")
                                ));
                            }
                        }

                        return departements;
                    }

                }
