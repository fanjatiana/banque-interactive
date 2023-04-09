package io.java.interactivebank;

import java.util.ArrayList;

public class Banque {
    private String nom;
    private ArrayList<Client> clientsBanque;

    public Banque(String nom) {
        this.nom = nom;
        this.clientsBanque = new ArrayList<Client>();
    }

    public void ajouterClient(String nomClient) {
        Client nouveauClient = new Client(nomClient);
        clientsBanque.add(nouveauClient);
    }

    public void bilanClient(Client client) {
        System.out.println("Bilan du client " + client.getNom() + " :");
        for (int i = 0; i < client.getNbComptes(); i++) {
            Compte compte = client.getComptes(i);
            System.out.println("numéro de compte :" + compte.numero + " - " + "solde :" + compte.getSolde());
        }
    }

    public void afficherBilan() {
        System.out.println("Bilan général de  " + nom + " :");
        for (Client client : clientsBanque) {
            bilanClient(client);
        }
    }

    public Client trouverClient(String nomClient) {
        for (Client c : clientsBanque) {
            if (c.getNom().equals(nomClient)) {
                return c;
            }
        }
        return null;
    }

    public ArrayList<Client> getClientsBanque() {
        return clientsBanque;
    }

    public void renflouer() {
        for (int i = 0; i < clientsBanque.size(); i++) {
            clientsBanque.get(i).renflouer();
        }
    }
}
