package com.sofka.exercise5;
import java.util.logging.Logger;

public class Exercise5 {
    public static void main(String[] args) {
        printPairs();
        printInPairs();
    }

    public static void printPairs(){
        int numero=1;
        Logger logger = Logger.getLogger(Exercise5.class.getName());
        logger.info("Los numeros pares son");
        while (numero<101) {
            if (numero % 2 == 0) {
                logger.info(String.valueOf(numero));
            }
            numero++;
        }
    }

    public static void printInPairs(){
        int number=0;
        Logger logger = Logger.getLogger(Exercise5.class.getName());
        logger.info("Los numeros impares son");
        while (number<101) {
            if (number % 2 != 0) {
                logger.info(String.valueOf(number));
            }
            number++;
        }
    }
}
