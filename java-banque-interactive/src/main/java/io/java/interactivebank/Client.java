package io.java.interactivebank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Client {
    private String nom;
    private Compte[] comptes = new Compte[100];
    private int nbComptes;
    private int numeroComptes;

    public Client(String nom) {
        this.nom = nom;
        this.numeroComptes = 25;
        this.comptes[0] = new Compte(numeroComptes, 500);
        this.nbComptes = 1; // 1 client a au moins 1 compte

    }

    public void ajouterCompte() {

        if (nbComptes < 100) {
            numeroComptes++;
            // Ajouter le nouveau compte au tableau
            comptes[nbComptes] = new Compte(numeroComptes, 500);
            nbComptes++;
        } else {
            System.out.println("Vous ne pouvez plus ajouter de compte (max 100 comptes)");
        }
    }


    public float recupererSoldeTotal() {
        float soldeTotal = 0;
        for (int i = 0; i < nbComptes; i++) {
            soldeTotal += comptes[i].getSolde();
        }
        return soldeTotal;
    }

    public void afficherSolde() {
        System.out.println("la somme des soldes de vos comptes est de" + " " + recupererSoldeTotal());
    }

    ;

    public String getNom() {
        return nom;
    }

    public Compte getComptes(int index) {
        if (index >= 0 && index < nbComptes) {
            return comptes[index];
        } else {
            return null;
        }
    }

    public int getNbComptes() {
        return nbComptes;
    }

    public void renflouer() {
        if (this.comptes[0].isSoldeNegatif()) {
            float soldeTotal = recupererSoldeTotal();
            float montantNecessaire = Math.abs(this.comptes[0].getSolde());
            for (int i = 0; i < nbComptes; i++) {
                Compte c = comptes[i];
                if (c != this.comptes[0]) {
                    float montantDisponible = c.getSolde() - soldeTotal;
                    if (montantDisponible >= montantNecessaire) {
                        c.retrait(montantNecessaire);
                        this.comptes[0].depot(montantNecessaire);
                        break;
                    } else {
                        c.retrait(montantDisponible);
                        this.comptes[0].depot(montantDisponible);
                        montantNecessaire -= montantDisponible;
                    }
                }
            }
        }
    }
}

