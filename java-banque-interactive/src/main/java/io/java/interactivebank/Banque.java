package io.java.interactivebank;

import java.util.ArrayList;

public class Banque {
    private String nom;
    //private Client[] listeClientsBanque = new Client[100];
    //private ArrayList clientsBanque = new ArrayList();
    private ArrayList<Long> clientsBanque = new ArrayList<Long>();

    public Banque() {
        this.nom = nom;
        this.clientsBanque = clientsBanque;
    }

    public void ajouterClient(String nomClient, Compte client) {
        clientsBanque.add(client.numero);
        clientsBanque.add(client.solde);
        System.out.println("Votre client au nom de " + nomClient + " ayant pour numéro " + client.numero + " ,a bien été ajouté ! Son solde est de: " + client.solde);
        ;
    }

    ;

    public void bilanClient(String nomClient, Compte compteClient) {
        System.out.println("Client" + nomClient + " - " + "numéro de compte: " + compteClient.numero + " - " + "solde de compte: " + compteClient.solde);
    }

    ;

    public void afficherBilan( Compte[] compteClient) {
        double total = 0;

        for (int i = 0; i < compteClient.length; i++) {
            System.out.println("Clients: " + i);

        // boucle à travers tous les comptes du client
        for (int j = 0; j < compteClient.length; j++) {
            System.out.println("  Compte " + compteClient[j].numero + " : " + compteClient[j].solde);
            if (compteClient[j] != null) {
                long solde = new Client().recupererSolde();
                total += compteClient[j].solde + solde;
            }
        }
        }
        System.out.println("Bilan général des soldes : " + total);
    }


}
