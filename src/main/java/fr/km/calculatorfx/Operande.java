package fr.km.calculatorfx;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Operande {

    private String string;
    private BigDecimal bigDecimal;



    public Operande(String string) {
        this.string = string;
    }


    public void ajoutChiffre(String text) {
        if (string.equals("0"))
            string = text;
        else
        string += text;
        bigDecimal = new BigDecimal(string);
    }

    @Override
    public String toString() {
        return string;
    }

    public void add(Operande operandeDeux) {

     bigDecimal = bigDecimal.add(operandeDeux.bigDecimal);
        string = bigDecimal.toString();
    }

    public void substract(Operande operandeDeux) {
        bigDecimal = bigDecimal.subtract(operandeDeux.bigDecimal);
        string = bigDecimal.toString();
    }

    public void multiply(Operande operandeDeux) {
        bigDecimal = bigDecimal.multiply(operandeDeux.bigDecimal);
        string = bigDecimal.toString();
    }

    public void divide(Operande operandeDeux) {
        bigDecimal = bigDecimal.divide(operandeDeux.bigDecimal, 10,RoundingMode.HALF_UP);
        string = bigDecimal.toString();
    }
}
