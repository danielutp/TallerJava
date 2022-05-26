package com.sofka.exercise15;
import java.util.Scanner;
import java.util.logging.Logger;

/**
 * Ejercicio Taller Pair programming contiene la clase main  que ejecuta el proyecto
 *
 * @version 1.0.0 2022-05-25
 * @author Daniel Steven Gil Cruz <danistcruz@gmail.com> - Yeferson Valencia (alejandro.yandd@gmail.com)
 * @since 1.0.0
 */
public class Exercise15{
    /**
     *        Contiene el metodo main  instanciamos logger calculator y scaner
     *        Scanner: poder capturar  lo que ingresa el usuario en los number one y numerberTwo
     *        logger: mostrar mensaje en consola
     *        Calculator: instancia el objeto para usar sus metedos
     *             case 1 -> calculator.addition();
     *             case 2 -> calculator.subtraction();
     *             case 3 -> calculator.multiplied();
     *             case 4 -> calculator.split();
     *
     * @author Daniel Steven Gil Cruz (danistcruz@gmail.com) - Yeferson Valencia (alejandro.yandd@gmail.com)
     * @since 1.0.0
     */
    public static void main(String[] args) {
        Logger log = Logger.getLogger(Exercise15.class.getName());
        Scanner in = new Scanner(System.in);
        int option;
        do {
            log.info("""
                   ****** GESTION CINEMATOGRÁFICA ********:\s
                    1-NUEVO ACTOR\s
                    2-BUSCAR ACTOR\s
                    3. Multiplicacion\s
                    4. Division\s
                    """);
            option = in.nextInt();
            switch (option) {
                case 1 -> {}
                case 2 -> {}
                case 3 -> {}
                case 4 -> {}
                case 5 -> {}
                case 6 -> {}
                case 7 -> {}
                case 8 -> {}
                default -> log.info("OPCION INCORRECTA DIGITE NUEVO \n");
            }
        } while (option != 8);
        log.info("Saliste satisfactoriamente");
    }
}