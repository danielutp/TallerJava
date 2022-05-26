package com.sofka.exercise11;

import java.util.Scanner;
import java.util.logging.Logger;

public class Exercise11 {
    public static void main(String[] args) {
        counter();
    }

    public static void counter() {
        Logger logger = Logger.getLogger(Exercise11.class.getName());
        logger.info("Ingrese la frase que desea saber la cantidad de vocales: ");
        Scanner read = new Scanner(System.in);
        String frase = (read.nextLine());
        String nueva = "El tamaño de la frase es "+frase.length();
        String vocales = "La cantidad de vocal A es:  "+counterA(frase)+"\n"+
                "La cantidad de vocal E es:  "+counterE(frase)+"\n"+
                "La cantidad de vocal I es:  "+counterI(frase)+"\n"+
                "La cantidad de vocal O es:  "+counterO(frase)+"\n"+
                "La cantidad de vocal U es:  "+counterU(frase)+"\n";
        logger.info(vocales);
        logger.info(nueva);
    }
    public static int counterA(String frase){
            int counterA = 0;
            for (int i = 0; i < frase.length(); i++){
                if(frase.toLowerCase().charAt(i) == 'a'){
                    counterA++;
                }
            }
            return counterA;
        }

    public static int counterE(String frase){
        int counterE = 0;
        for (int i = 0; i < frase.length(); i++){
            if(frase.toLowerCase().charAt(i) == 'e'){
                counterE++;
            }
        }
        return counterE;
    }
    public static int counterI(String frase){
        int counterI = 0;
        for (int i = 0; i < frase.length(); i++){
            if(frase.toLowerCase().charAt(i) == 'i'){
                counterI++;
            }
        }
        return counterI;
    }
    public static int counterO(String frase){
        int counterO = 0;
        for (int i = 0; i < frase.length(); i++){
            if(frase.toLowerCase().charAt(i) == 'o'){
                counterO++;
            }
        }
        return counterO;
    }
    public static int counterU(String frase){
        int counterU = 0;
        for (int i = 0; i < frase.length(); i++){
            if(frase.toLowerCase().charAt(i) == 'u'){
                counterU++;
            }
        }
        return counterU;
    }
}

