package io.java.interactivebank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Banque miniBanque = new Banque("Minibanque");

        // virement entre 2 clients
        miniBanque.ajouterClient("Dupuis");
        Client clientDupuis = miniBanque.trouverClient("Dupuis");
        float depotClientDupuis = clientDupuis.getComptes(0).depot(8000);
        clientDupuis.ajouterCompte();
        System.out.println(clientDupuis.getNom());
        System.out.println(clientDupuis.getComptes(0).solde);
        System.out.println("Dupuis a maintenant sur son compte : " + clientDupuis.recupererSoldeTotal());

        miniBanque.ajouterClient("Dupont");
        Client clientDupond = miniBanque.trouverClient("Dupont");
        clientDupond.getComptes(0).depot(14000);
        clientDupond.ajouterCompte();
        System.out.println(clientDupond.getNom());
        System.out.println(clientDupond.getComptes(0).solde);
        System.out.println("Dupont a maintenant sur son compte : " + clientDupond.recupererSoldeTotal());

        clientDupuis.getComptes(0).virer(2000, clientDupond.getComptes(0));
        System.out.println("Dupuis a maintenant sur son compte : " + clientDupuis.recupererSoldeTotal());
        System.out.println("Dupont a maintenant sur son compte : " + clientDupond.recupererSoldeTotal());

        // ajout des clients dans la banque : Mini banque
        System.out.println(miniBanque.getClientsBanque().get(0).getNom());

        // interaction avec la banque interactive
        Banque miniBanque2 = new Banque("Mini banque 2");
        Scanner scanner = new Scanner(System.in);
        BanqueInteractive banqueInteractive = new BanqueInteractive();

        while (true) {
            System.out.println("Quelle opération voulez-vous effectuer ?");
            System.out.println("1) Ajouter un client");
            System.out.println("2) Effectuer une opération sur un client");
            System.out.println("3) Afficher un bilan général");
            System.out.println("4) Renflouer tous les comptes clients");
            System.out.println("5) Quitter");

            String choix = scanner.nextLine();
            switch (choix) {
                case "1":
                    banqueInteractive.interactionAjoutClient(miniBanque2);
                    break;
                case "2":
                    banqueInteractive.interactionOperationClient(miniBanque2);
                    break;
                case "3":
                    miniBanque2.afficherBilan();
                    break;
                case "4":
                    miniBanque2.renflouer();
                    System.out.println("Tous les comptes courants ont été renfloués.");
                    break;
                case "5":
                    System.out.println("Au revoir !");
                    // reste à mettre un system.out pour vider et quitter la console
                    break;
                default:
                    System.out.println("Choix invalide.");
            }
        }

    }
}