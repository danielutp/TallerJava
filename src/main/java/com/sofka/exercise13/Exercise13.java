package com.sofka.exercise13;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Logger;

public class Exercise13 {
    public static void main(String[] args) {
        printDate();
    }
    public static void printDate() {
        Logger logger = Logger.getLogger(Exercise13.class.getName());
        Date fechaActual = Calendar.getInstance().getTime();
        DateFormat formateador = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss a");
        String fechaCadena = formateador.format(fechaActual);
        logger.info(fechaCadena);
    }
}