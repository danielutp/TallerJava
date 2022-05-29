package com.sofka.exercise10;
import java.util.Scanner;
import java.util.logging.Logger;

/**
 * Ejercicio 10 para cambiar las letras a por las e de una frase ingresada por teclado.
 *
 * @version 1.0.0 2022-05-25
 * @author Daniel Steven Gil Cruz <danistcruz@gmail.com>
 * @since 1.0.0
 */

public class Exercise10 {
    public static void main(String[] args) {
        remplaceSpace();
    }

    /**
     * @author Daniel Steven Gil Cruz <danistcruz@gmail.com>
     * @since 1.0.0
     * Metodo para remplazar para cambiar la letra a por la 3
     */
    public static void remplaceSpace() {
        Logger logger = Logger.getLogger(Exercise10.class.getName());
        logger.info("Ingrese la frase que desea modificar: ");
        Scanner read = new Scanner(System.in);
        String frase = (read.nextLine());
        String text = frase.replace(" ","");
        String nueva = "Frase del dia: "+ text;
        logger.info(nueva);
    }
}