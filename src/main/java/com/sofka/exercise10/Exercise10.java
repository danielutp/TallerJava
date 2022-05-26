package com.sofka.exercise10;

import java.util.Scanner;
import java.util.logging.Logger;

public class Exercise10 {
    public static void main(String[] args) {
        remplaceSpace();
    }

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