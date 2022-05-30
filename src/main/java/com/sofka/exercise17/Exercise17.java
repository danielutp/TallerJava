package com.sofka.exercise17;
import java.util.logging.Logger;

/**
 * Ejercicio 17 para la creacion de televisores y lavadoras, e imprimir sus precios y precios final.
 *
 * @version 1.0.0 2022-05-28
 * @author Daniel Steven Gil Cruz <danistcruz@gmail.com>
 * @since 1.0.0
 */
public class Exercise17 {
    static Logger log = Logger.getLogger(Exercise17.class.getName());

    /**
     * @author Daniel Steven Gil Cruz <danistcruz@gmail.com>
     * @since 1.0.0
     * Se llama a los respectivos metodos para la creacion de lavadores y televisores e imprimir el precio.
     */
    public static void main(String[] args) {
        double precioFinalElectrodomesticos = 0;
        double precioFinalTelevisores = 0;
        double precioFinalLavadoras = 0;
        Television televisorUno = new Television();
        Television televisorDos = new Television(25,45);
        Television televisorTres = new Television(35,"Amarillo",'H',15,25,false);
        Television televisorCuatro = new Television(45,"Negro",'D',50,45,true);
        Television televisorCinco = new Television(55,"BLanco",'F',30,55,true);
        Lavadora lavadoraUno = new Lavadora();
        Lavadora lavadoraDos = new Lavadora(25,45);
        Lavadora lavadoraTres = new Lavadora(35,"Amarillo",'C',45,30);
        Lavadora lavadoraCuatro = new Lavadora(45,"Verde",'P',45,30);
        Lavadora lavadoraCinco = new Lavadora(55,"Rojo",'A',50,40);

        Electrodomestico[] electrodomesticos = {televisorUno,televisorDos,televisorTres,televisorCuatro,televisorCinco,lavadoraUno,lavadoraDos,lavadoraTres,lavadoraCuatro,lavadoraCinco};

        for (Electrodomestico electrodomestico : electrodomesticos) {
            String result = ("El precio final es : " + electrodomestico.precioFinal());
            log.info(result);
        }

        for (Electrodomestico elemento : electrodomesticos){
            if(elemento != null){
                precioFinalElectrodomesticos += elemento.precioFinal();
            }
            if(elemento instanceof Lavadora){
                precioFinalLavadoras += elemento.precioFinal();
            }
            if(elemento instanceof Television){
                precioFinalTelevisores += elemento.precioFinal();
            }
        }
        String resultado = ("El suma de los electromesticos es: "+ precioFinalElectrodomesticos);
        log.info(resultado);
        String resultadoL =("El suma de las lavadoras es de : "+ precioFinalLavadoras);
        log.info(resultadoL);
        String resultadoT =("El suma de los televisores es de: "+ precioFinalTelevisores);
        log.info(resultadoT);
    }
}
