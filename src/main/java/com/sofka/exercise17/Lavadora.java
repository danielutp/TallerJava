package com.sofka.exercise17;

/**
 * Clase Lavadora con sus respectivos atributos que extiende de Electrodomestico.
 *
 * @version 1.0.0 2022-05-30
 * @author Daniel Steven Gil Cruz <danistcruz@gmail.com>
 * @since 1.0.0
 */
public class Lavadora extends Electrodomestico {
    private final double carga;

    /**
     * @author Daniel Steven Gil Cruz <danistcruz@gmail.com>
     * @since 1.0.0
     * Constructor de Lavadora con atributos por defecto.
     */
    public Lavadora( ) {
        this.carga = 5;
    }

    /**
     * @author Daniel Steven Gil Cruz <danistcruz@gmail.com>
     * @since 1.0.0
     * Constructor de Lavadora con atributos por defecto y otros por teclado.
     */
    public Lavadora(double precioBase, double peso ) {
        super(precioBase, peso);
        this.carga = 5;
    }

    /**
     * @author Daniel Steven Gil Cruz <danistcruz@gmail.com>
     * @since 1.0.0
     * Constructor de Lavadora con atributos por teclado.
     */
    public Lavadora(double precioBase, String color, char consumoEnergetico, double peso, double carga) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    /**
     * @author Daniel Steven Gil Cruz <danistcruz@gmail.com>
     * @since 1.0.0
     * Metodo para darle agregarle precio al precio final segun su carga.
     */
    @Override
    public double precioFinal() {
        double precioFinal = super.precioFinal();
        if (this.carga >= 30){
            precioFinal += 50;
        }
        return precioFinal;
    }

    /**
     * @author Daniel Steven Gil Cruz <danistcruz@gmail.com>
     * @since 1.0.0
     * Metodo modificador de carga.
     */
    public double getCarga() {
        return this.carga;
    }
}
