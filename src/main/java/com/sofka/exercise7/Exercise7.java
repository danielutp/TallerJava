package com.sofka.exercise7;
import java.util.Scanner;
import java.util.logging.Logger;

/**
 * Ejercicio 7 se ingresa numero por teclado y seguira funcionando hasta que este sea mayor que 0.
 *
 * @version 1.0.0 2022-05-25
 * @author Daniel Steven Gil Cruz <danistcruz@gmail.com>
 * @since 1.0.0
 */
public class Exercise7 {
    public static void main(String[] args) {
        greater();
    }

    /**
     * @author Daniel Steven Gil Cruz <danistcruz@gmail.com>
     * @since 1.0.0
     * Metodo para saber si el numero escrito es mayor a 0 o igual a este
     */
    public static void greater() {
        Logger logger = Logger.getLogger(Exercise7.class.getName());
        int number;
        do {
            Scanner leer = new Scanner(System.in);
            logger.info("Escriba el numero que desea verificar");
            number = Integer.parseInt((leer.nextLine()));
        }while (number<-0);
        String result =("Has escrito un numero mayor o igual a 0 y este es: " + number);
        logger.info(result);
    }
}