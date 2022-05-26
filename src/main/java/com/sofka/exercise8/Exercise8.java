package com.sofka.exercise8;

import java.util.Scanner;
import java.util.logging.Logger;

public class Exercise8 {
    public static void main(String[] args) {
        workingDay();
    }

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