package com.sofka.exercise10;

import java.util.logging.Logger;

public class Exercise10 {
    public static void main(String[] args) {
        remplace();
    }

    public static void remplace() {
        Logger logger = Logger.getLogger(Exercise10.class.getName());
        String textString = "La sonrisa sera la mejor arma contra la tristeza";
        String text = textString.replace(" ","");
        String nueva = "Frase del dia: "+ textString;
        logger.info(nueva);
    }
}