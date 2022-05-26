package com.sofka.exercise9;
import java.util.logging.Logger;

/**
 * Ejercicio 9 para cambiar las letras a por las e.
 *
 * @version 1.0.0 2022-05-25
 * @author Daniel Steven Gil Cruz <danistcruz@gmail.com>
 * @since 1.0.0
 */
public class Exercise9 {
    public static void main(String[] args) {
        remplace();
    }

    /**
     * @author Daniel Steven Gil Cruz <danistcruz@gmail.com>
     * @since 1.0.0
     * Metodo para remplazar para cambiar la letra a por la e
     */
    public static void remplace() {
        Logger logger = Logger.getLogger(Exercise9.class.getName());
        String textString = "La sonrisa sera la mejor arma contra la tristeza";
        String text = textString.replace("a","e");
        String resultado = "Frase cambiada:  "+ text;
        logger.info(resultado);
        String nueva = "Frase del dia: "+ textString;
        logger.info(nueva);
    }
}