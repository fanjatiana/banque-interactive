package io.java.interactivebank;

public class Compte {
    int numero;
    int solde;

    public Compte(){
    numero = numero;
    solde = solde;
    };

    public void depot(float valeur) {};
    public float retrait(float valeur) {
        return valeur;
    };
    public float recupererSolde(float valeur) {
        return valeur;
    };
    public void afficherSolde() {

    };
    public void virer(float somme,int compteDestinataire){
        System.out.println("Votre virement de" +somme+ "a été envoyé sur le compte"+ compteDestinataire);
    }
}
