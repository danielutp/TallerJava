package com.sofka.exercise5;
import java.util.logging.Logger;

/**
 * Ejercicio 5 para mostrar los pares del 1 al 100 con el ciclo while.
 *
 * @version 1.0.0 2022-05-25
 * @author Daniel Steven Gil Cruz <danistcruz@gmail.com>
 * @since 1.0.0
 */
public class Exercise5 {
    public static void main(String[] args) {
        printPairs();
        printInPairs();
    }

    /**
     * @author Daniel Steven Gil Cruz <danistcruz@gmail.com>
     * @since 1.0.0
     * Metodo para imprimir los pares del 1 al 100
     */
    public static void printPairs(){
        int numero=1;
        Logger logger = Logger.getLogger(Exercise5.class.getName());
        logger.info("Los numeros pares son");
        while (numero<101) {
            if (numero % 2 == 0) {
                String result =("El numero par es " + numero);
                logger.info(result);
            }
            numero++;
        }
    }

    /**
     * @author Daniel Steven Gil Cruz <danistcruz@gmail.com>
     * @since 1.0.0
     * Metodo para imprimir los impares del 1 al 100
     */
    public static void printInPairs(){
        int number=0;
        Logger logger = Logger.getLogger(Exercise5.class.getName());
        logger.info("Los numeros impares son");
        while (number<101) {
            if (number % 2 != 0) {
                String result =("El numero par es " + number);
                logger.info(result);
            }
            number++;
        }
    }
}