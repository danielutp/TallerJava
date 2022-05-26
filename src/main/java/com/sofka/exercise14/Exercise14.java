package com.sofka.exercise14;
import java.util.Scanner;
import java.util.logging.Logger;

public class Exercise14 {
    public static void main(String[] args) {
        printPairs();
    }

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
