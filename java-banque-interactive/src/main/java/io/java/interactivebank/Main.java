package io.java.interactivebank;

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
    }
}