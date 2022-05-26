package com.sofka.exercise4;
import java.util.Scanner;
import java.util.logging.Logger;

/**
 * Ejercicio 4 para saber iva de un producto.
 *
 * @version 1.0.0 2022-05-24
 * @author Daniel Steven Gil Cruz <danistcruz@gmail.com>
 * @since 1.0.0
 */
public class Exercise4 {
    public static void main(String[] args) {
        float price;
        Logger logger = Logger.getLogger(Exercise4.class.getName());
        Scanner read = new Scanner(System.in);
        logger.info("Escriba el precio a calcular");
        price = Float.parseFloat((read.nextLine()));
        calculateIva(price);
    }

    /**
     * @author Daniel Steven Gil Cruz <danistcruz@gmail.com>
     * @since 1.0.0
     *
     * Metodo para calcular el iva
     * @param price Precio del producto al cual vamos a calcularle el precio
     */
    public static void calculateIva(float price){
        Logger logger = Logger.getLogger(Exercise4.class.getName());
        float result = (price * 1.21f);
        String resultado = "El resultado es : " + result;
        logger.info(resultado);
    }
}
