package com.sofka.exercise3;
import java.util.Scanner;
import java.util.logging.Logger;

/**
 * Ejercicio 1 para saber cual es el mayor escrito por teclado.
 *
 * @version 1.0.0 2022-05-24
 * @author Daniel Steven Gil Cruz <danistcruz@gmail.com>
 * @since 1.0.0
 */
public class Exercise3 {

    public static void main(String[] args) {
        double radio;
        Logger logger = Logger.getLogger(Exercise3.class.getName());
        Scanner read = new Scanner(System.in);
        logger.info("Escriba el radio del area del circulo");
        radio = Double.parseDouble((read.nextLine()));
        calculateTheArea(radio);
    }

    public static void calculateTheArea(double radio){
        Logger logger = Logger.getLogger(Exercise3.class.getName());
        double result = Math.PI * (Math.pow(radio,2));
        String resultado = "El resultado es : " + result;
        logger.info(resultado);
    }
}