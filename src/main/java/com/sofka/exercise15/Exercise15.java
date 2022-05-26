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
public class Exercise15 {
    public static void main(String[] args) {
        Logger log = Logger.getLogger(Exercise15.class.getName());
        Scanner in = new Scanner(System.in);
        int option;
        do {
            log.info("""
                    ****** GESTION CINEMATOGRÁFICA ********:\s
                     1-NUEVO ACTOR\s
                     2-BUSCAR ACTOR\s
                     3-ELIMINAR ACTOR\s
                     4-MODIFICAR ACTOR\s
                     5-VER TODOS LOS ACTORES\s
                     6-VER PELICULAS DE LOS ACTORES\s
                     7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES\s
                     8-SALIR                    
                     """);
            option = in.nextInt();
            switch (option) {
                case 1 -> log.info("Has ingresado la opcion de NUEVO ACTOR");
                case 2 -> log.info("Has ingresado la opcion de BUSCAR ACTOR");
                case 3 -> log.info("Has ingresado la opcion de ELIMINAR ACTOR");
                case 4 -> log.info("Has ingresado la opcion de MODIFICAR ACTOR");
                case 5 -> log.info("Has ingresado la opcion de VER TODOS LOS ACTORES");
                case 6 -> log.info("Has ingresado la opcion de VER PELICULAS DE LOS ACTORES");
                case 7 -> log.info("Has ingresado la opcion de VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES");
                case 8 -> log.info("SALIR");
                default ->log.info("OPCION INCORRECTA DIGITE DE NUEVO");
            }
        } while (option != 8);
        log.info("Saliste satisfactoriamente");
    }
}