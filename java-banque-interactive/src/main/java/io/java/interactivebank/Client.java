package io.java.interactivebank;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Client {
    String nom;
    private Compte[] comptes = new Compte [100];
    int nbComptes;


    public Client(){
        nom = nom;
    }

    public void ajouterCompte(){};
    public String recupererNom() {
        return this.nom;
    };

    public int  recupererSolde() {
    this.nbComptes = 0;
        for (int i = 0; i < comptes.length; i++) {
            this.nbComptes = this.nbComptes + i;
        }
        return this.nbComptes;
    };

    public Compte afficherSolde() {
        return null;
    };
}

