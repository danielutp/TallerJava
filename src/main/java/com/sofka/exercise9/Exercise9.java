package com.sofka.exercise9;

import java.util.logging.Logger;

public class Exercise9 {
    public static void main(String[] args) {
        remplace();
    }

    public static void remplace() {
        Logger logger = Logger.getLogger(Exercise9.class.getName());
        String textString = "La sonrisa sera la mejor arma contra la tristeza";
        String text = textString.replace("a","e");
        String resultado = "Frase cambiada:  "+ text;
        logger.info(resultado);
        String nueva = "Frase del dia: "+ textString;
        logger.info(nueva);
    }
}