package com.sofka.exercise12;
import java.util.Scanner;
import java.util.logging.Logger;

public class Exercise12 {
    public static void main(String[] args) {
        counter();
    }
    public static void counter() {
        Logger logger = Logger.getLogger(Exercise12.class.getName());
        Scanner read = new Scanner(System.in);
        logger.info("Ingrese la primera palabra: ");
        String wordOne = (read.nextLine());
        logger.info("Ingrese la segunda palabra: ");
        String wordTwo = (read.nextLine());
        String result = comparador(wordOne, wordTwo);
        logger.info(result);
    }

    public static String comparador(String wordone, String wordtwo) {
        StringBuilder concate = new StringBuilder();
        int counter;
        String resultado ;
        String diferent = "";
        for (int i = 0; i < wordone.length(); i++) {
            counter = 0;
            for (int j = 0; j < wordtwo.length(); j++) {
                if (wordone.charAt(i) == wordtwo.charAt(j)) {
                    counter++;
                }
            }
            if (counter == 0) {
                concate.append(wordone.charAt(i));
            }
            diferent = concate.toString();
        }
            if (wordone.equals(wordtwo)) {
                resultado = "Las palabras son iguales";
            } else if (diferent.equals("")) {
                resultado = "La palabra son iguales pero en diferente orden";
            } else {
                resultado = "La diferencia de la palabra primera palabra con la segunda es " + diferent;
            }
        return resultado;
        }
    }