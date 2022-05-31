package com.sofka.exercise18;

/**
 * Clase Serie con sus respectivos atributos que implementa la interfaz Entregable .
 *
 * @version 1.0.0 2022-05-30
 * @author Daniel Steven Gil Cruz <danistcruz@gmail.com>
 * @since 1.0.0
 */
public class Serie implements Entregable {
    private String titulo;
    private double numeroTemporadas;
    private boolean entregado;
    private String genero;
    private String creador;

    /**
     * @author Daniel Steven Gil Cruz <danistcruz@gmail.com>
     * @since 1.0.0
     * Constructor de Serie con atributos por defecto.
     */
    public Serie() {
        this.titulo = "";
        this.numeroTemporadas = 3;
        this.entregado = false;
        this.genero = "";
        this.creador = "";
    }

    /**
     * @author Daniel Steven Gil Cruz <danistcruz@gmail.com>
     * @since 1.0.0
     * Constructor de Serie con atributos por defecto y otros por teclado.
     */
    public Serie(String titulo, String creador) {
        this.titulo = titulo;
        this.numeroTemporadas = 3;
        this.entregado = false;
        this.genero = "";
        this.creador = creador;
    }

    /**
     * @author Daniel Steven Gil Cruz <danistcruz@gmail.com>
     * @since 1.0.0
     * Constructor de Serie con atributos por teclado.
     */
    public Serie(String titulo, double numeroTemporadas, String genero, String creador) {
        this.titulo = titulo;
        this.numeroTemporadas = numeroTemporadas;
        this.entregado = false;
        this.genero = genero;
        this.creador = creador;
    }

    /**
     * @author Daniel Steven Gil Cruz <danistcruz@gmail.com>
     * @since 1.0.0
     * Metodo accesor de edad.
     */
    public String getTitulo() {
        return this.titulo;
    }

    /**
     * @author Daniel Steven Gil Cruz <danistcruz@gmail.com>
     * @since 1.0.0
     * Metodo modificador de edad.
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @author Daniel Steven Gil Cruz <danistcruz@gmail.com>
     * @since 1.0.0
     * Metodo accesor de edad.
     */
    public double getNumeroTemporadas() {
        return this.numeroTemporadas;
    }

    /**
     * @author Daniel Steven Gil Cruz <danistcruz@gmail.com>
     * @since 1.0.0
     * Metodo modificador de edad.
     */
    public void setNumeroTemporadas(double numeroTemporadas) {
        this.numeroTemporadas = numeroTemporadas;
    }

    /**
     * @author Daniel Steven Gil Cruz <danistcruz@gmail.com>
     * @since 1.0.0
     * Metodo accesor de edad.
     */
    public String getGenero() {
        return this.genero;
    }

    /**
     * @author Daniel Steven Gil Cruz <danistcruz@gmail.com>
     * @since 1.0.0
     * Metodo modificador de edad.
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * @author Daniel Steven Gil Cruz <danistcruz@gmail.com>
     * @since 1.0.0
     * Metodo accesor de edad.
     */
    public String getCreador() {
        return this.creador;
    }

    /**
     * @author Daniel Steven Gil Cruz <danistcruz@gmail.com>
     * @since 1.0.0
     * Metodo modificador de edad.
     */
    public void setCreador(String creador) {
        this.creador = creador;
    }

    /**
     * @author Daniel Steven Gil Cruz <danistcruz@gmail.com>
     * @since 1.0.0
     * Metodo para imprimir los atributos.
     */
    public String toString(){
        return  "titulo : " + titulo + '\n'+
                "El numero Temporadas son : " + numeroTemporadas + '\n'+
                "Entregar  : " + entregado + '\n'+
                "Genero : " + genero + '\n'+
                "Creador : " + creador + '\n'
                ;
    }

    /**
     * @author Daniel Steven Gil Cruz <danistcruz@gmail.com>
     * @since 1.0.0
     * Metodo para entregar una serie.
     */
    @Override
    public void entregar() {
        this.entregado = true;

    }

    /**
     * @author Daniel Steven Gil Cruz <danistcruz@gmail.com>
     * @since 1.0.0
     * Metodo para sacar una serie.
     */
    @Override
    public void devolver() {
        this.entregado = false;

    }

    /**
     * @author Daniel Steven Gil Cruz <danistcruz@gmail.com>
     * @since 1.0.0
     * Metodo para saber si esta entregado.
     */
    @Override
    public boolean isEntregado() {
        return this.entregado;
    }

    /**
     * @author Daniel Steven Gil Cruz <danistcruz@gmail.com>
     * @since 1.0.0
     * Metodo para comparar una serie con otra y saber cual es la que tiene mayor temporadas.
     */
    @Override
    public int compareTo(Object objeto) {
        Serie serie = (Serie) objeto;
        int comparacion = 1;
        if (this.numeroTemporadas==serie.getNumeroTemporadas()){
            comparacion= 2;
        } else if (this.numeroTemporadas>serie.getNumeroTemporadas()) {
            comparacion = 3;
        }
        return comparacion;
    }
}
