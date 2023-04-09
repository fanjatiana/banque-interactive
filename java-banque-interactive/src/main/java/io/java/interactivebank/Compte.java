package io.java.interactivebank;

public class Compte {
    int numero;
    float solde;

    public Compte(int numeroCompte, float soldeCompte) {
        this.numero = numeroCompte;
        ;
        this.solde = soldeCompte;
    }

    public float depot(float valeur) {
        return this.solde += valeur;
    }

    public float retrait(float valeur) {
        return this.solde -= valeur;
    }

    public void afficherSolde() {
        System.out.println("votre solde est de" + " " + this.solde);
    }

    public float getSolde() {
        return solde;
    }

    public float virer(float valeur, Compte compteDestinataire) {
        this.solde -= valeur;
        compteDestinataire.depot(valeur);
        System.out.println("la valeur de" + " " + valeur + " " + "a bien été virée au destinataire numéro " + compteDestinataire.numero);
        return valeur;
    }

    public boolean isSoldeNegatif() {
        return solde < 0;
    }
}
