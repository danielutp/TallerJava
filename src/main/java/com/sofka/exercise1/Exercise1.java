package com.sofka.exercise1;
import java.util.logging.Logger;

/**
 * Ejercicio 1 para saber cual es el mayor.
 *
 * @version 1.0.0 2022-05-24
 * @author Daniel Steven Gil Cruz <danistcruz@gmail.com>
 * @since 1.0.0
 */
public class Exercise1 {
    public static void main(String[] args) {
        compare(30,30);
    }
    /**
     * Metodo para comparar y definir cual es el mayor o si son iguales
     * @param numberone Primer numero a comparar
     * @param numbertwo Segundo numero a comparar
     */
    public static void compare(Integer numberone, Integer numbertwo){
        Logger logger = Logger.getLogger(Exercise1.class.getName());

        if (numberone > numbertwo){
            logger.info("El primer numero es mayor que el segundo");
        } else if (numberone < numbertwo) {
            logger.info("El segundo numero es mayor que el primero");
        }else{
            logger.info("Son iguales");
        }
    }
}