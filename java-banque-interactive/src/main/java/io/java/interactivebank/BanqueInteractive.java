package io.java.interactivebank;

import java.util.ArrayList;
import java.util.Scanner;

public class BanqueInteractive {
    public Scanner scanner = new Scanner(System.in);
    private ArrayList<Client> listeDeclients;

    public BanqueInteractive() {
        listeDeclients = new ArrayList<Client>();
    }

    public void interactionAjoutClient(Banque banque) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez le nom du client (faudra rentrer un 2eme après pour pouvoir effectuer le virement en interne) :");
        String nom = scanner.next();
        banque.ajouterClient(nom);
        System.out.println("Le client " + nom + " a été créé.");
    }

    public void interactionOperationClient(Banque banque) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quel client ?");
        String entrerNomClient = scanner.next();
        Client client = banque.trouverClient(entrerNomClient);
        System.out.println("Quelle opération voulez-vous effectuer sur le client " + client.getNom() + " ?");
        System.out.println("1) Ajouter un autre compte");
        System.out.println("2) Afficher un bilan");
        System.out.println("3) Faire un retrait");
        System.out.println("4) Faire un dépôt");
        System.out.println("5) Faire un virement");
        int choixOperation = scanner.nextInt();
        scanner.nextLine();
        switch (choixOperation) {
            case 1:
                client.ajouterCompte();
                break;
            case 2:
                banque.bilanClient(client);
                break;
            case 3:
                System.out.println("Quel est le montant du retrait ?");
                float montantRetrait = scanner.nextFloat();
                client.getComptes(0).retrait(montantRetrait);
                System.out.println("Retrait effectué avec succès !");
                break;
            case 4:
                System.out.println("Quel est le montant du dépôt ?");
                float montantDepot = scanner.nextFloat();
                client.getComptes(0).depot(montantDepot);
                System.out.println("Dépôt effectué avec succès !");
                break;
            case 5:
                System.out.println("Quel est le montant du virement ?");
                float montantVirement = scanner.nextFloat();
                System.out.println("De quel compte (compte commun = 1, compte épargne = 2) ?");
                int choixCompteDebit = scanner.nextInt();
                Compte compteDebit = client.getComptes(choixCompteDebit - 1);
                System.out.println("Vers quel compte (compte commun = 1, compte épargne = 2) ?");
                int choixCompteCredit = scanner.nextInt();
                Compte compteCredit = client.getComptes(choixCompteCredit - 1);
                compteDebit.virer(montantVirement, compteCredit);
                System.out.println("Virement effectué avec succès !");
                break;
            default:
                System.out.println("Choix invalide !");
                break;
        }
    }
}




