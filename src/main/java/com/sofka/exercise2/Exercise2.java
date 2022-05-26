package com.sofka.exercise2;
import java.util.Scanner;
import java.util.logging.Logger;

/**
 * Ejercicio 1 para saber cual es el mayor escrito por teclado.
 *
 * @version 1.0.0 2022-05-24
 * @author Daniel Steven Gil Cruz <danistcruz@gmail.com>
 * @since 1.0.0
 */
public class Exercise2 {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        int numberone;
        int numbertwo;
        Logger logger = Logger.getLogger(Exercise2.class.getName());
        Scanner leer = new Scanner(System.in);
        logger.info("Escriba el primer numero");
        numberone = Integer.parseInt((leer.nextLine()));
        logger.info("Escriba el segundo numero");
        numbertwo = Integer.parseInt((leer.nextLine()));
        compare(numberone,numbertwo);
    }
    public static void compare(Integer numberone, Integer numbertwo){
        Logger logger = Logger.getLogger(Exercise2.class.getName());

        if (numberone > numbertwo){
            logger.info("El primer numero es mayor que el segundo");
        } else if (numberone < numbertwo) {
            logger.info("El segundo numero es mayor que el primero");
        }else{
            logger.info("Son iguales");
        }
    }
}