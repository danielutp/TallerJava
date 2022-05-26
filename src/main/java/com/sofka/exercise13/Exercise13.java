package com.sofka.exercise13;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Logger;

/**
 * Ejercicio 13 para imprimir la fecha y hora del dia.
 *
 * @version 1.0.0 2022-05-24
 * @author Daniel Steven Gil Cruz <danistcruz@gmail.com>
 * @since 1.0.0
 */

public class Exercise13 {
    public static void main(String[] args) {
        printDate();
    }

    /**
     * @author Daniel Steven Gil Cruz <danistcruz@gmail.com>
     * @since 1.0.0
     * Metodo Metodo para imprimir la fecha y hora del dia.
     */
    public static void printDate() {
        Logger logger = Logger.getLogger(Exercise13.class.getName());
        Date fechaActual = Calendar.getInstance().getTime();
        DateFormat formateador = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss a");
        String fechaCadena = formateador.format(fechaActual);
        logger.info(fechaCadena);
    }
}