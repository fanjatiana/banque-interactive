package io.java.interactivebank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Client {
    private String nom;
    private Compte[] comptes = new Compte[100];
    private int nbComptes;

    public Client() {}

    public Compte[] ajouterCompte() {

        for (int i = 0; i < 100; i++) {
            // Générer des valeurs aléatoires pour le solde et le numéro de compte
            int numeroCompte = (int) (Math.random() * 100);
            long solde = (long) (Math.random() * 100);

            // Créer un nouveau compte avec les valeurs aléatoires
            Compte nouveauCompte = new Compte(numeroCompte, solde);

            // Ajouter le nouveau compte au tableau
            comptes[i] = nouveauCompte;
        }
        return comptes;
    };

    public String getNom() {
        return nom;
    }

    public long recupererSolde() {
        long solde = 0;
        for (int i = 0; i < comptes.length; i++) {
            if (comptes[i] != null) {
                solde = comptes[i].solde;
                afficherSolde(solde);
            }
        }
        return solde;
    }

    public void afficherSolde(long solde) {
        System.out.println("la somme des soldes de vos comptes est de" + " " + solde);
    };

    public Compte[] getComptes() {
        return comptes;
    }
}

