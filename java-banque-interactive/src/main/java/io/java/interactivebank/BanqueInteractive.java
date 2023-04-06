package io.java.interactivebank;

import java.util.Scanner;

public class BanqueInteractive {

    int choix;
    Scanner scanner = new Scanner(System.in);
    public int interactionAjoutClient(){
        choix = scanner.nextInt();
        return choix;
    };

    public int interactionEffectuerOperation(){
        choix = scanner.nextInt();
        return choix;
    };

    public int interactionAfficherBilanGeneral(){
        choix = scanner.nextInt();
        return choix;
    };

    public int interactionFaireRetrait(){
        choix = scanner.nextInt();
        return choix;
    };

    public int interactionFaireDepot(){
        choix = scanner.nextInt();
        return choix;
    };

    public int interactionFaireVirement(){
        choix = scanner.nextInt();
        return choix;
    };

}
