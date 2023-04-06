package io.java.interactivebank;

public class Banque {
    Client nom;
    public Client[] clientsBanque = new Client [100];

    public Banque(){
        this.nom=nom;
        this.clientsBanque=clientsBanque;
    }

    public String ajouterClient(String nom) {
        for(int i = 0; i < this.clientsBanque.length; i++){
            this.clientsBanque[i]=this.nom;
        }
        return nom;
    };

    public void bilanClient() {};

    public String afficherBilan(){
        String  bilan = "Voici votre bilan";
        return bilan;
    };
}
