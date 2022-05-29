package com.sofka.exercise16;
import java.util.Scanner;
import java.util.logging.Logger;

/**
 * Ejercicio 16 para la creacion e imprimir los datos de persona.
 *
 * @version 1.0.0 2022-05-28
 * @author Daniel Steven Gil Cruz <danistcruz@gmail.com>
 * @since 1.0.0
 */
public class Exercise16 {
    static Logger log = Logger.getLogger(Exercise16.class.getName());

    /**
     * @author Daniel Steven Gil Cruz <danistcruz@gmail.com>
     * @since 1.0.0
     * Se llama a los respectivos metodos para la creacion de persona e imprimirlos.
     */
    public static void main(String[] args) {
        crearPersona1();
        crearPersona2();
        crearPersona3();
    }

    /**
     * @author Daniel Steven Gil Cruz <danistcruz@gmail.com>
     * @since 1.0.0
     * Metodo para crear el objeto persona con atributos por defecto e imprimen.
     */
    private static void crearPersona1() {
        Persona persona = new Persona();
        persona.setNombre("Daniel");
        persona.setEdad(26);
        persona.setSexo('H');
        persona.setPeso(67);
        persona.setAltura(1.70);
        imprimiDatos(persona);
    }

    /**
     * @author Daniel Steven Gil Cruz <danistcruz@gmail.com>
     * @since 1.0.0
     * Metodo para crear el objeto persona con atributos por defecto y otros por teclado para imprimirlos.
     */
    private static void crearPersona2() {
        Scanner in = new Scanner(System.in);
        log.info("Por favor ingresas tu nombre: ");
        String nombre = in.nextLine();
        log.info("Por favor ingresas tu edad: ");
        int edad = in.nextInt();
        log.info("Por favor ingresas tu sexo: ");
        char sexo = in.next().charAt(0);
        Persona persona = new Persona(nombre,edad,sexo);
        imprimiDatos(persona);

    }

    /**
     * @author Daniel Steven Gil Cruz <danistcruz@gmail.com>
     * @since 1.0.0
     * Metodo para crear el objeto persona con atributos por teclado para imprimirlos.
     */
    private static void crearPersona3() {
        Scanner in = new Scanner(System.in);
        log.info("Por favor ingresar tu nombre: ");
        String nombre = in.nextLine();
        log.info("Por favor ingresar tu edad: ");
        int edad = in.nextInt();
        log.info("Por favor ingresar tu sexo: ");
        char sexo = in.next().charAt(0);
        log.info("Por favor ingresas tu peso: ");
        double peso = in.nextDouble();
        log.info("Por favor ingresas tu altura: ");
        double altura = in.nextDouble();
        Persona persona = new Persona(nombre,edad,sexo,peso,altura);
        imprimiDatos(persona);
    }

    /**
     * @author Daniel Steven Gil Cruz <danistcruz@gmail.com>
     * @since 1.0.0
     * Metodo para imprimir los atributos del objeto persona.
     */
    private static void imprimiDatos(Persona persona){
        log.info("Los datos de la persona se mostraran en la siguiente pantalla: ");
        String pesoI = persona.pesoIdeal();
        log.info(pesoI);
        String edad = persona.esMayorDeEdad() ? "Eres mayor de edad":"Eres menor de edad";
        log.info(edad);
        String informacion = persona.toString();
        log.info(informacion);
    }
}