package com.sofka.exercise18;

/**
 * Clase VideoJuego con sus respectivos atributos que implementa la interfaz Entregable .
 *
 * @version 1.0.0 2022-05-30
 * @author Daniel Steven Gil Cruz <danistcruz@gmail.com>
 * @since 1.0.0
 */
public class VideoJuego implements Entregable{
    private String titulo;
    private double horasEstimadas;
    private boolean entregado;
    private String genero;
    private String compania;

    /**
     * @author Daniel Steven Gil Cruz <danistcruz@gmail.com>
     * @since 1.0.0
     * Constructor de VideoJuego con atributos por defecto.
     */
    public VideoJuego() {
        this.titulo = "assassin's creed valhalla";
        this.horasEstimadas = 120;
        this.entregado = false;
        this.genero = "Accion";
        this.compania = "Ubisoft";
    }

    /**
     * @author Daniel Steven Gil Cruz <danistcruz@gmail.com>
     * @since 1.0.0
     * Constructor de VideoJuego con atributos por defecto y otros por teclado.
     */
    public VideoJuego(String titulo, double horasEstimadas) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.entregado = false;
        this.genero = "Suspenso";
        this.compania = "Ubisoft";
    }

    /**
     * @author Daniel Steven Gil Cruz <danistcruz@gmail.com>
     * @since 1.0.0
     * Constructor de VideoJuego con atributos por teclado.
     */
    public VideoJuego(String titulo, double horasEstimadas, String genero, String compania) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.entregado = false;
        this.genero = genero;
        this.compania = compania;
    }

    /**
     * @author Daniel Steven Gil Cruz <danistcruz@gmail.com>
     * @since 1.0.0
     * Metodo accesor de titulo.
     */
    public String getTitulo() {
        return this.titulo;
    }

    /**
     * @author Daniel Steven Gil Cruz <danistcruz@gmail.com>
     * @since 1.0.0
     * Metodo modificador de titulo.
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @author Daniel Steven Gil Cruz <danistcruz@gmail.com>
     * @since 1.0.0
     * Metodo accesor de horasEstimadas.
     */
    public double getHorasEstimadas() {
        return this.horasEstimadas;
    }

    /**
     * @author Daniel Steven Gil Cruz <danistcruz@gmail.com>
     * @since 1.0.0
     * Metodo modificador de horasEstimadas.
     */
    public void setHorasEstimadas(double horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    /**
     * @author Daniel Steven Gil Cruz <danistcruz@gmail.com>
     * @since 1.0.0
     * Metodo accesor de genero.
     */
    public String getGenero() {
        return this.genero;
    }

    /**
     * @author Daniel Steven Gil Cruz <danistcruz@gmail.com>
     * @since 1.0.0
     * Metodo modificador de genero.
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * @author Daniel Steven Gil Cruz <danistcruz@gmail.com>
     * @since 1.0.0
     * Metodo accesor de compania.
     */
    public String getCompania() {
        return this.compania;
    }

    /**
     * @author Daniel Steven Gil Cruz <danistcruz@gmail.com>
     * @since 1.0.0
     * Metodo modificador de compania.
     */
    public void setCompania(String compania) {
        this.compania = compania;
    }

    /**
     * @author Daniel Steven Gil Cruz <danistcruz@gmail.com>
     * @since 1.0.0
     * Metodo para imprimir los atributos.
     */
    public String toString(){
        return  "Titulo : " + titulo + '\n'+
                "Las Horas estimadas : " + horasEstimadas + '\n'+
                "Entregado : " + entregado + '\n'+
                "Genero : " + genero + '\n'+
                "Compañia : " + compania + '\n'
                ;
    }

    /**
     * @author Daniel Steven Gil Cruz <danistcruz@gmail.com>
     * @since 1.0.0
     * Metodo para entregar un video juego.
     */
    @Override
    public void entregar() {
        this.entregado = true;
    }

    /**
     * @author Daniel Steven Gil Cruz <danistcruz@gmail.com>
     * @since 1.0.0
     * Metodo para sacar un video juego.
     */
    @Override
    public void devolver() {
        this.entregado = false;
    }

    /**
     * @author Daniel Steven Gil Cruz <danistcruz@gmail.com>
     * @since 1.0.0
     * Metodo para saber si esta entregado .
     */
    @Override
    public boolean isEntregado() {
        return this.entregado;
    }

    /**
     * @author Daniel Steven Gil Cruz <danistcruz@gmail.com>
     * @since 1.0.0
     * Metodo para comparar un con otra y saber cual es la que tiene el mayor de horas estimadas.
     */
    @Override
    public int compareTo(Object objeto) {
        VideoJuego videoJuego = (VideoJuego) objeto;
        int comparacion = 1;
        if (this.horasEstimadas == videoJuego.getHorasEstimadas()){
            comparacion = 2;
        } else if (this.horasEstimadas > videoJuego.getHorasEstimadas()) {
            comparacion = 3;
        }
        return comparacion;
    }
}