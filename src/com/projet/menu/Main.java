package com.projet.menu;


import java.util.Scanner;
import com.projet.controllers.DepartementsController;
import com.projet.donnees.Enseignant;
import com.projet.services.DB;



public class Main {

        public Main() {
        }

        public static boolean isNull(Object ob) {
            return ob == null;
        }

        public static int getIntInput(String... msg) {
            Scanner scan = new Scanner(System.in);
            String message = "Entrez un nombre entier : ";
            if (msg.length > 0) {
                message = msg[0];
            }

            System.out.print(message);
            int num = scan.nextInt();
            return num;
        }

        public static String getStringInput(String... msg) {
            Scanner scan = new Scanner(System.in);
            String message = "Entrez un texte : ";
            if (msg.length > 0) {
                message = msg[0];
            }

            System.out.print(message);
            String str = scan.nextLine();
            return str;
        }

        public static void showPrincipalMenu() {
            System.out.println("-------------------------[ Bienvenu ]---------------------------");
            System.out.println("1: Pour gérer les départements");
            System.out.println("2: Pour gérer les filières");
            System.out.println("3: Pour gérer les enseignants");
            System.out.println("4: Pour gérer les modules");
            System.out.println("5: Pour gérer les étudiants");
            System.out.println("0: Pour sortir");
            int option = getIntInput("Veuillez sélectionner une option : ");
            switch (option) {
                case 1:
                    DepartementsController.showMenu();
                case 2:
                case 3:
                case 4:
                case 5:
                default:
                    switch (option) {
                        case 1:
                            DepartementsController.showMenu();
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        default:
                    }
            }
        }

        public static void main(String[] args) {
            Enseignant enseignant = new Enseignant();
            enseignant.setnom("yassmin");
            enseignant.setprenom("elbaz");
            enseignant.setemail("yasminelbaz@gmail.com");
            enseignant.setgrade("VAL");
            enseignant.setIdens(DB.getEnsId());
            DB.enseignants.add(enseignant);
            showPrincipalMenu();
        }
    }


