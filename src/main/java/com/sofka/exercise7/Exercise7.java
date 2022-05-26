package com.sofka.exercise7;

import java.util.Scanner;
import java.util.logging.Logger;

public class Exercise7 {
    public static void main(String[] args) {
        greater();
    }

    public static void greater() {
        Logger logger = Logger.getLogger(Exercise7.class.getName());
        int number;
        do {
            Scanner leer = new Scanner(System.in);
            logger.info("Escriba el numero que desea verificar");
            number = Integer.parseInt((leer.nextLine()));
        }while (number<-0);
        logger.info("Has escrito un numero mayor o igual a 0");
    }
}