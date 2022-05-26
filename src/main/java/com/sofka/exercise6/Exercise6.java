package com.sofka.exercise6;
import java.util.logging.Logger;

public class Exercise6 {
    public static void main(String[] args) {
        printPairs();
        printInPairs();
    }

    public static void printPairs() {
        Logger logger = Logger.getLogger(Exercise6.class.getName());
        logger.info("Los numeros pares son");
        for (int i = 0; i < 101; i++) {
            if (i % 2 == 0) {
                String resultado = "El resultado es : " + i;
                logger.info(resultado);
            }
        }
    }

    public static void printInPairs() {
        Logger logger = Logger.getLogger(Exercise6.class.getName());
        logger.info("Los numeros impares son");
        for (int i = 0; i < 101; i++) {
            if (i % 2 != 0) {
                String resultado = "El resultado es : " + i;
                logger.info(resultado);
            }
        }
    }
}
