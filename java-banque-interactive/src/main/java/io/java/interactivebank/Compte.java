package io.java.interactivebank;

public class Compte {
    long numero;
    long solde;

    public Compte(){
        long numeroCompte = this.numero;
        long soldeCompte = this.solde;
    };

    public float depot(float valeur) {
       return this.solde+=valeur;
    };
    public float retrait(float valeur) {
        return this.solde-=valeur;
    };
    public float recupererSolde() {
        return this.solde;
    };

    // type boolean : suggestion de java
    public boolean afficherSolde() {
      System.out.println("votre solde est de" + " "+ this.solde);
        return true;
    };
    public float virer(float somme, long compteDestinataire){
       this.solde -= somme;
        System.out.println("la somme de" + " " + somme + " "+ "a bien été virée au destinataire numéro " + compteDestinataire);
        return this.solde;
    }
}
