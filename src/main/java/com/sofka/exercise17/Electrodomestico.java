package com.sofka.exercise17;

/**
 * Clase Electrodomestico con sus respectivos atributos.
 *
 * @version 1.0.0 2022-05-28
 * @author Daniel Steven Gil Cruz <danistcruz@gmail.com>
 * @since 1.0.0
 */
public class Electrodomestico {
    private final double precioBase;
    private String color;
    private char consumoEnergetico;
    private final double peso;
    private final String[] colores = {"blanco","negro","rojo","azul","gris"};

    /**
     * @author Daniel Steven Gil Cruz <danistcruz@gmail.com>
     * @since 1.0.0
     * Constructor de Electrodomestico con atributos por defecto.
     */
    public Electrodomestico() {
        this.precioBase = 100;
        this.color = colores[0];
        this.consumoEnergetico = 'F';
        this.peso = 5;
    }

    /**
     * @author Daniel Steven Gil Cruz <danistcruz@gmail.com>
     * @since 1.0.0
     * Constructor de Electrodomestico con atributos por defecto y otros por teclado.
     */
    public Electrodomestico(double precioBase, double peso) {
        this.precioBase = precioBase;
        this.color = colores[0];
        this.consumoEnergetico = 'F';
        this.peso = peso;
    }

    /**
     * @author Daniel Steven Gil Cruz <danistcruz@gmail.com>
     * @since 1.0.0
     * Constructor de Electrodomestico con atributos por teclado.
     */
    public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
        this.precioBase = precioBase;
        this.color = color;
        comprobarColor(color);
        this.consumoEnergetico = consumoEnergetico;
        comprobarConsumoEnergetico(consumoEnergetico);
        this.peso = peso;
    }

    /**
     * @author Daniel Steven Gil Cruz <danistcruz@gmail.com>
     * @since 1.0.0
     * Metodo para comprobar el consumo energetico y esta mal escrito de pone por defecto F.
     */
    public void comprobarConsumoEnergetico(char consumoEnergetico){
        if (consumoEnergetico == 'A'|| this.consumoEnergetico == 'B'|| this.consumoEnergetico == 'C'||this.consumoEnergetico == 'D'||this.consumoEnergetico == 'E'||this.consumoEnergetico == 'F' ) {
            this.consumoEnergetico = consumoEnergetico;
        } else this.consumoEnergetico = 'F';
    }

    /**
     * @author Daniel Steven Gil Cruz <danistcruz@gmail.com>
     * @since 1.0.0
     * Metodo para comprobar el color y esta mal escrito de pone por defecto blanco.
     */
    public void comprobarColor(String color){
        color = color.toLowerCase();
        if (color.equals("blanco") || color.equals("rojo") || color.equals("azul") || color.equals("gris") || color.equals("negro")){
            this.color=color;
        }else this.color=colores[0];
    }

    /**
     * @author Daniel Steven Gil Cruz <danistcruz@gmail.com>
     * @since 1.0.0
     * Metodo para darle agregarle precio al precio final segun su consumo energetico y peso.
     */
    public double precioFinal(){
        double precioFinal = this.precioBase;

        if (consumoEnergetico=='A'){
            precioFinal += 100;
        } else if (consumoEnergetico=='B') {
            precioFinal += 80;
        }else if (consumoEnergetico=='C') {
            precioFinal +=  60;
        }else if (consumoEnergetico=='D') {
            precioFinal +=  50;
        }else if (consumoEnergetico=='E') {
            precioFinal +=  30;
        }else if (consumoEnergetico=='F') {
            precioFinal +=  10;
        }
        if (this.peso >= 0 && this.peso<=19){
            precioFinal += 10;
        } else if (this.peso >= 20 && this.peso<=49) {
            precioFinal += 50;
        }
        else if (this.peso >= 50 && this.peso<=79) {
            precioFinal +=80;
        }else {
            precioFinal += 100;
        }
        return precioFinal;
    }

    /**
     * @author Daniel Steven Gil Cruz <danistcruz@gmail.com>
     * @since 1.0.0
     * Metodo modificador de precioBase.
     */
    public double getPrecioBase() {
        return this.precioBase;
    }

    /**
     * @author Daniel Steven Gil Cruz <danistcruz@gmail.com>
     * @since 1.0.0
     * Metodo modificador de color.
     */
    public String getColor() {
        return this.color;
    }

    /**
     * @author Daniel Steven Gil Cruz <danistcruz@gmail.com>
     * @since 1.0.0
     * Metodo modificador de consumoEnergetico.
     */
    public char getConsumoEnergetico() {
        return this.consumoEnergetico;
    }

    /**
     * @author Daniel Steven Gil Cruz <danistcruz@gmail.com>
     * @since 1.0.0
     * Metodo modificador de peso.
     */
    public double getPeso() {
        return this.peso;
    }
}