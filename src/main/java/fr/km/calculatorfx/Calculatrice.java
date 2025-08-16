package fr.km.calculatorfx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Calculatrice {


    Operande operandeUn = new Operande("0");
    Operande operandeDeux = new Operande("");
    String operateur = "";

    //List<String> numbers = new ArrayList<String>(Arrays.asList("0", "1", "2", "3", "4","5","6","7","8","9"));
    List<String> operateurs = new ArrayList<String>(Arrays.asList("+", "-", "*", "/"));
    Boolean justComput = false;


    public void touche(String text) {
        switch (text) {
            case "=" -> calculer();
            case "C" -> miseAzero();
            default -> autreTouche(text);

        }
    }

    private void miseAzero() {
      operandeUn = new Operande("0");
      operandeDeux = new Operande("");
      operateur = "";
    }

    private void autreTouche(String text) {
        if (justComput){
            operandeUn = new Operande("0");
            justComput = false;
        }
        if (operateurs.contains(text))
            ajoutOperateur(text);
         else
             ajouterChiffre(text);

    }

    private void ajouterChiffre(String text) {
        if (operateur.isEmpty())
            operandeUn.ajoutChiffre(text);
        else
            operandeDeux.ajoutChiffre(text);
    }

    private void ajoutOperateur(String text) {
        operateur = text;
    }

    private void calculer() {
       if (operateur.isEmpty())
           return;
       switch (operateur){
           case "+" -> operandeUn.add(operandeDeux);
           case "-" -> operandeUn.substract(operandeDeux);
           case "*" -> operandeUn.multiply(operandeDeux);
           case "/" -> operandeUn.divide(operandeDeux);
       }
       operandeDeux =  new Operande("");
       operateur = "";
       justComput = true;


    }

    @Override
    public String toString() {
        return String.format("%s %s %s" , operandeUn,operateur, operandeDeux);
    }


}
