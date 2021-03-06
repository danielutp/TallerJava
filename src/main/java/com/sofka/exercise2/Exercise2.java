package com.sofka.exercise2;
import java.util.Scanner;
import java.util.logging.Logger;

/**
 * Ejercicio 2 para saber cual es el mayor escrito por teclado.
 *
 * @version 1.0.0 2022-05-24
 * @author Daniel Steven Gil Cruz <danistcruz@gmail.com>
 * @since 1.0.0
 */
public class Exercise2 {
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

    /**
     * @author Daniel Steven Gil Cruz <danistcruz@gmail.com>
     * @since 1.0.0
     *
     * Metodo para compara cual de los dos numeros ingresados es el mayor
     * @param numberone Numero uno a comparar
     * @param numbertwo Numero dos a comparar
     */
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