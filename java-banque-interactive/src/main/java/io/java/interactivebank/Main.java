package io.java.interactivebank;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      Compte compteClient1 = new Compte();
        compteClient1.numero=51566665;
        compteClient1.solde = 850;
        System.out.println( "Client1 a pour numéro" + compteClient1.numero + " " + "et a sur son compte" + " " + compteClient1.solde);

      Compte compteClient2= new Compte();
          compteClient2.numero=457856;
          compteClient2.solde=300;
          System.out.println( "Client2 a pour numéro" + compteClient2.numero + " " + "et a sur son compte" + " " + compteClient2.solde);

      System.out.println("Quel montant souhaitez vous virer ? ");
      int sommeAVirer = scanner.nextInt();
      float virementVersCompteClient2 = new Compte().virer(sommeAVirer, compteClient2.numero);
      System.out.println( virementVersCompteClient2);

      // vérifie si le virement a bien été effectué
      boolean isTrue = true;

      if(isTrue){
          compteClient1.solde -= sommeAVirer;
          System.out.println( "Reste au client1" + " " + compteClient1.recupererSolde());
          compteClient2.solde += sommeAVirer;
          System.out.println( " Client2 a maintenant" + " " +compteClient2.recupererSolde());
      } else{
          isTrue = false;
      }
    }
}