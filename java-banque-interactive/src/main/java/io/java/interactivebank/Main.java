package io.java.interactivebank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Compte compteClient1 = new Compte(51566665, 850);
        System.out.println("Client1 a pour numéro" + compteClient1.numero + " " + "et a sur son compte" + " " + compteClient1.solde);

        Compte compteClient2 = new Compte(457856, 300);
        System.out.println("Client2 a pour numéro" + compteClient2.numero + " " + "et a sur son compte" + " " + compteClient2.solde);

        System.out.println("Quel montant souhaitez vous virer ? ");
        int sommeAVirer = scanner.nextInt();
        float virementVersCompteClient2 = new Compte(51566665, 850).virer(sommeAVirer, compteClient2.numero);
        System.out.println(virementVersCompteClient2);


        compteClient1.solde -= sommeAVirer;
        System.out.println(compteClient1.afficherSolde());
        compteClient2.solde += sommeAVirer;
        System.out.println(compteClient2.afficherSolde());


        // exercice 3.3

        Compte[] ceCompte = new Client().ajouterCompte();
        for (int i = 0; i < ceCompte.length; i++) {
            if (ceCompte[i] != null) {
                System.out.println("Compte n°" + ceCompte[i].numero + " - Solde : " + ceCompte[i].solde);
            }
        }

        double somme = 0;
        for (int i = 0; i < ceCompte.length; i++) {
            if (ceCompte[i] != null) {
                long solde = new Client().recupererSolde();
                somme += ceCompte[i].solde + solde;
            }
        }
        System.out.println("la somme des soldes de vos comptes est de" + " " + somme);


        // exercice 4 :

        //ajouter un client
       // String client1= String.valueOf(new Client());
        //client1="DUPONT";
        //Banque banque = new Banque();
        //banque.ajouterClient(client1);

        // ajouter des clients dans un tableau
        ArrayList<Long> clients = new ArrayList<Long>();

        //création des clients
        
        String nomClient1;
        nomClient1 = "Dasilva";
        Compte compteClientDasilva = new Compte(84564, 10850);
       
        String nomClient2;
        nomClient2= "Dupuis";
        Compte compteClientDupuis = new Compte(44564, 24050);
        

        Banque compte2 = new Banque();
        compte2.ajouterClient(nomClient1,compteClientDasilva);
        Banque compte1 = new Banque();
        compte1.ajouterClient(nomClient2,compteClientDupuis);

        for (long i : clients) {
            System.out.println(i);
        }

        // bilan compte client
        Banque client2 = new Banque();
        client2.bilanClient(nomClient1,compteClientDasilva);

        // bilan général des comptes et clients

        Banque afficherBilanGeneral = new Banque();
        afficherBilanGeneral.afficherBilan(ceCompte);

    }
}