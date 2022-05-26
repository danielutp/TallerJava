package com.sofka.exercise8;
import java.util.Scanner;
import java.util.logging.Logger;

/**
 * Ejercicio 8 para saber saber cual dia se labora.
 *
 * @version 1.0.0 2022-05-25
 * @author Daniel Steven Gil Cruz <danistcruz@gmail.com>
 * @since 1.0.0
 */
public class Exercise8 {
    public static void main(String[] args) {
        workingDay();
    }

    /**
     * @author Daniel Steven Gil Cruz <danistcruz@gmail.com>
     * @since 1.0.0
     * Metodo para verificar que dia se labora y cual no
     */
    public static void workingDay() {
        Logger logger = Logger.getLogger(Exercise8.class.getName());
        logger.info("Escriba el dia de lunes a domingo para saber si se labora");
        Scanner read = new Scanner(System.in);
        String day = (read.nextLine());
        switch (day) {
            case "lunes" -> logger.info("El dia lunes se labora");
            case "martes" -> logger.info("El dia martes se labora");
            case "miercoles" -> logger.info("El dia miercoles se labora");
            case "jueves" -> logger.info("El dia jueves se labora");
            case "viernes" -> logger.info("El dia viernes se labora");
            case "sabado" -> logger.info("El dia sabado no labora");
            case "domingo" -> logger.info("El dia domingo no labora");
            default -> logger.info("Error");
        }
    }
}