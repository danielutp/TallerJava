package com.sofka.exercise6;
import java.util.logging.Logger;

/**
 * Ejercicio 6 para mostrar los pares del 1 al 100 con el ciclo for.
 *
 * @version 1.0.0 2022-05-25
 * @author Daniel Steven Gil Cruz <danistcruz@gmail.com>
 * @since 1.0.0
 */
public class Exercise6 {
    public static void main(String[] args) {
        printPairs();
        printInPairs();
    }

    /**
     * @author Daniel Steven Gil Cruz <danistcruz@gmail.com>
     * @since 1.0.0
     * Metodo para imprimir los pares del 1 al 100
     */
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

    /**
     * @author Daniel Steven Gil Cruz <danistcruz@gmail.com>
     * @since 1.0.0
     * Metodo para imprimir los impares del 1 al 100
     */
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