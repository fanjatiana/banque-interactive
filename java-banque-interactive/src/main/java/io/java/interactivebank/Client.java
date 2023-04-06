package io.java.interactivebank;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Client {
    int id;
    String nom;
    private Compte[] comptes = new Compte [100];
    int nbComptes;


    public Client(){}

    public Compte[] ajouterCompte(){
        comptes[0]=new Compte();

        for (int i =  0 ; i < comptes.length ; i++) {
            comptes[i] =  new Compte() ;
        }
        return comptes;
    };


    public String recupererNom() {
        return this.nom;
    };

    public float  recupererSolde() {
       /* Compte[] tousleSoldeDesComptes = new Compte[100];
        for ( Compte solde: tousleSoldeDesComptes){
            int sum = Arrays.stream(tousleSoldeDesComptes.solde).parallel().reduce(0,(a,b)->  a + b);
            System.out.println("Array Sum = "+sum);
        }*/
        return 0;
    }

    public boolean afficherSolde() {
        return new Compte().afficherSolde();
    };
}

