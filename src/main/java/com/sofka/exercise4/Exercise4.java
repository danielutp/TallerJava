package com.sofka.exercise4;
import java.util.Scanner;
import java.util.logging.Logger;

public class Exercise4 {
    public static void main(String[] args) {
        float price;
        Logger logger = Logger.getLogger(Exercise4.class.getName());
        Scanner read = new Scanner(System.in);
        logger.info("Escriba el precio a calcular");
        price = Float.parseFloat((read.nextLine()));
        calculateIva(price);
    }

    public static void calculateIva(float price){
        Logger logger = Logger.getLogger(Exercise4.class.getName());
        float result = (price * 1.21f);
        String resultado = "El resultado es : " + result;
        logger.info(resultado);
    }
}
