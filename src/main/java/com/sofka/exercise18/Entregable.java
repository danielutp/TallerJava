package com.sofka.exercise18;
/**
 * Interfaz Entregable con sus respectivos metodos .
 *
 * @version 1.0.0 2022-05-30
 * @author Daniel Steven Gil Cruz <danistcruz@gmail.com>
 * @since 1.0.0
 */
public interface Entregable {
    void entregar();

   void devolver();

   boolean isEntregado();

    int compareTo(Object objeto);
}
