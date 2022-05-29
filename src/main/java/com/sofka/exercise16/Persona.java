package com.sofka.exercise16;
import java.util.Random;

/**
 * Clase persona con sus respectivos atributos.
 *
 * @version 1.0.0 2022-05-28
 * @author Daniel Steven Gil Cruz <danistcruz@gmail.com>
 * @since 1.0.0
 */
public class Persona {
    private final Random random = new Random();
    private String nombre;
    private int edad;
    private final int dni;
    private char sexo;
    private double peso;
    private double altura;

    /**
     * @author Daniel Steven Gil Cruz <danistcruz@gmail.com>
     * @since 1.0.0
     * Constructor de persona con atributos por defecto.
     */
    public Persona() {
        this.nombre = "";
        this.edad = 0;
        this.dni = generaDNI();
        this.sexo = 'H';
        this.peso = 0;
        this.altura = 0;
    }

    /**
     * @author Daniel Steven Gil Cruz <danistcruz@gmail.com>
     * @since 1.0.0
     * Constructor de persona con atributos por defecto y otros por teclado.
     */
    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = generaDNI();
        this.sexo = sexo;
        comprobarSexo();
        this.peso = 0;
        this.altura = 0;
    }

    /**
     * @author Daniel Steven Gil Cruz <danistcruz@gmail.com>
     * @since 1.0.0
     * Constructor de persona con atributos por teclado.
     */
    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = generaDNI();
        this.sexo = sexo;
        comprobarSexo();
        this.peso = peso;
        this.altura = altura;
    }

    /**
     * @author Daniel Steven Gil Cruz <danistcruz@gmail.com>
     * @since 1.0.0
     * Metodo para calcula si una persona esta en su peso ideal devuelve 1/0/-1.
     */
    public int calcularIMC(){
        if (this.peso ==0 && this.altura==0){
            return 6;
        }
        double pesoI = this.peso/ Math.pow(this.altura, 2);
        if (pesoI<20){
            return -1;
        } else if (pesoI>=20 && pesoI<=25) {
            return 0;
        }
        return 1;
    }

    /**
     * @author Daniel Steven Gil Cruz <danistcruz@gmail.com>
     * @since 1.0.0
     * Metodo donde segun el valor de IMC devuelve un mensaje para saber si anda en su peso ideal.
     */
    public String pesoIdeal(){
        if (calcularIMC()==1){
            return "Tienes sobre peso";
        } else if (calcularIMC()==0) {
            return "Tienes el peso ideal";
        } else if (calcularIMC()==-1) {
            return "Estas debajo de peso ideal";
        }else{
            return "faltan datos para saber el peso ideal";
        }
    }

    /**
     * @author Daniel Steven Gil Cruz <danistcruz@gmail.com>
     * @since 1.0.0
     * Metodo para saber si es mayor o no de edad
     */
    public boolean esMayorDeEdad(){
        return this.edad >17;
    }

    /**
     * @author Daniel Steven Gil Cruz <danistcruz@gmail.com>
     * @since 1.0.0
     * Metodo para comprobar el sexo o darle uno por defecto.
     */
    public void comprobarSexo() {
        if (this.sexo != 'H' && this.sexo != 'M') {
            this.sexo = 'H';
        }
    }

    /**
     * @author Daniel Steven Gil Cruz <danistcruz@gmail.com>
     * @since 1.0.0
     * Metodo para imprimir los atributos.
     */
    public String toString(){
        return  "Nombre: " + nombre + '\n'+
                "Edad: " + edad + '\n'+
                "DNI: " + dni + '\n'+
                "Sexo: " + sexo + '\n'+
                "Peso: " + peso + '\n'+
                "Altura: " + altura + '\n'
                ;
    }

    /**
     * @author Daniel Steven Gil Cruz <danistcruz@gmail.com>
     * @since 1.0.0
     * Metodo para generar un DNI random.
     */
    public int generaDNI(){
        return this.random.nextInt( 99999999- 10000000) + 10000000;
    }

    /**
     * @author Daniel Steven Gil Cruz <danistcruz@gmail.com>
     * @since 1.0.0
     * Metodo modificador de nombre.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @author Daniel Steven Gil Cruz <danistcruz@gmail.com>
     * @since 1.0.0
     * Metodo modificador de edad.
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @author Daniel Steven Gil Cruz <danistcruz@gmail.com>
     * @since 1.0.0
     * Metodo modificador de sexo.
     */
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    /**
     * @author Daniel Steven Gil Cruz <danistcruz@gmail.com>
     * @since 1.0.0
     * Metodo modificador de peso.
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**
     * @author Daniel Steven Gil Cruz <danistcruz@gmail.com>
     * @since 1.0.0
     * Metodo modificador de altura.
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }
}