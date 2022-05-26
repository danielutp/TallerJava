package com.sofka.exercise14;
import java.util.Scanner;
import java.util.logging.Logger;

/**
 * Ejercicio 14 para imprimir los pares desde el numero escrito hasta el 1000.
 *
 * @version 1.0.0 2022-05-26
 * @author Daniel Steven Gil Cruz <danistcruz@gmail.com>
 * @since 1.0.0
 */

public class Exercise14 {
    public static void main(String[] args) {
        printPairs();
    }

    /**
     * @author Daniel Steven Gil Cruz <danistcruz@gmail.com>
     * @since 1.0.0
     * Metodo para imprimir los pares desde el numero escrito hasta el 1000.
     */
    public static void printPairs(){
        Logger logger = Logger.getLogger(Exercise14.class.getName());
        logger.info("Digite el numero :");
        Scanner in = new Scanner(System.in);
        int numero = in.nextInt();
        logger.info("Los numeros pares desde el numero escrito hasta el 1000 son:");
        while (numero<1001) {
            if (numero % 2 == 0) {
                String resultado = "El numero par es : " + numero;
                logger.info(resultado);
            }
            numero++;
        }
    }
}
