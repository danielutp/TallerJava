package com.sofka.exercise17;

/**
 * Clase Television con sus respectivos atributos que extiende de Electrodomestico.
 *
 * @version 1.0.0 2022-05-30
 * @author Daniel Steven Gil Cruz <danistcruz@gmail.com>
 * @since 1.0.0
 */
public class Television extends Electrodomestico {
    private final double resolucion;
    private final boolean sintonizadorTDT;

    /**
     * @author Daniel Steven Gil Cruz <danistcruz@gmail.com>
     * @since 1.0.0
     * Constructor de Television con atributos por defecto.
     */
    public Television() {
        super();
        this.resolucion = 20;
        this.sintonizadorTDT = false;
    }

    /**
     * @author Daniel Steven Gil Cruz <danistcruz@gmail.com>
     * @since 1.0.0
     * Constructor de Television con atributos por defecto y otros por teclado.
     */
    public Television(double precioBase, double peso) {
        super(precioBase, peso);
        this.resolucion = 20;
        this.sintonizadorTDT = false;
    }

    /**
     * @author Daniel Steven Gil Cruz <danistcruz@gmail.com>
     * @since 1.0.0
     * Constructor de Television con atributos por teclado.
     */
    public Television(double precioBase, String color, char consumoEnergetico, double peso, double resolucion, boolean sintonizadorTDT) {
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    /**
     * @author Daniel Steven Gil Cruz <danistcruz@gmail.com>
     * @since 1.0.0
     * Metodo para darle agregarle precio al precio final segun su sintonizadorTDT y resolucion.
     */
    @Override
    public double precioFinal() {
       double precioFinal = super.precioFinal();
       double aumento;
       if(this.resolucion >= 40){
           aumento = precioFinal*0.3;
           precioFinal += aumento;
       }
       if (this.sintonizadorTDT){
           precioFinal += 50;
       }
        return precioFinal;
    }

    /**
     * @author Daniel Steven Gil Cruz <danistcruz@gmail.com>
     * @since 1.0.0
     * Metodo modificador de resolucion.
     */
    public double getResolucion() {
        return this.resolucion;
    }

    /**
     * @author Daniel Steven Gil Cruz <danistcruz@gmail.com>
     * @since 1.0.0
     * Metodo modificador de sintonizadorTDT.
     */
    public boolean isSintonizadorTDT() {
        return this.sintonizadorTDT;
    }
}
