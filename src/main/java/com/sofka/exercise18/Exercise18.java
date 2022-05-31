package com.sofka.exercise18;
import java.util.logging.Logger;

/**
 * Ejercicio 18 para el manejo de series y video juegos.
 *
 * @version 1.0.0 2022-05-28
 * @author Daniel Steven Gil Cruz <danistcruz@gmail.com>
 * @since 1.0.0
 */
public class Exercise18 {
    static Logger log = Logger.getLogger(Exercise18.class.getName());

    /**
     * @author Daniel Steven Gil Cruz <danistcruz@gmail.com>
     * @since 1.0.0
     * Se llama a los respectivos metodos para la creacion de series e video juegos.
     */
    public static void main(String[] args) {
        int seriesEntregadas = 0;
        int videoJuegoEntregados = 0;
        Serie serieUno = new Serie("shingeki no kyojin","Hajime Isayama");
        Serie serieDos = new Serie("breaking bad","George Vincent Gilligan");
        Serie serieTres = new Serie("Dark",3,"Misterio","Baran bo Odar");
        Serie serieCuatro = new Serie("Suits",9,"Drama","Aaron Korsh");
        Serie serieCinco = new Serie("Black Mirror",5,"Suspenso","Charlie Brooker");
        Serie[] series = {serieUno,serieDos,serieTres,serieCuatro,serieCinco};
        VideoJuego videoJuegoUno = new VideoJuego("PUGB",60);
        VideoJuego videoJuegoDos = new VideoJuego("Minecraft",50);
        VideoJuego videoJuegoTres = new VideoJuego("Call of duty",90,"Guerra","Activision");
        VideoJuego videoJuegoCuatro = new VideoJuego("CS",100,"Guerra","Valve");
        VideoJuego videoJuegoCinco = new VideoJuego("LoL",15,"MOBA","Riot Games");
        VideoJuego[] videoJuegos = {videoJuegoUno,videoJuegoDos,videoJuegoTres,videoJuegoCuatro,videoJuegoCinco};

        serieDos.entregar();
        serieCuatro.devolver();
        videoJuegoCinco.entregar();
        videoJuegoCuatro.entregar();

        /**
         * @author Daniel Steven Gil Cruz <danistcruz@gmail.com>
         * @since 1.0.0
         * Se hace for para saber cuantas series se han entregado.
         */
        for (Serie elemento : series) {
            if (elemento.isEntregado()) {
                seriesEntregadas++;
            }
        }

        /**
         * @author Daniel Steven Gil Cruz <danistcruz@gmail.com>
         * @since 1.0.0
         * Se hace for para saber cuantos video juegos se han entregado.
         */
        for (VideoJuego elemento : videoJuegos) {
            if (elemento.isEntregado()) {
                videoJuegoEntregados++;
            }
        }

        /**
         * @author Daniel Steven Gil Cruz <danistcruz@gmail.com>
         * @since 1.0.0
         * Se imprime los resultados y posteriormente se devuelven todas las series.
         */
        String resultadoSeri = ("Las series entregadas son : "+ seriesEntregadas);
        log.info(resultadoSeri);
        for (Serie elemento : series) {
            if (elemento.isEntregado()) {
            } elemento.entregar();
        }
        log.info("Todas series han sido devueltas ");

        /**
         * @author Daniel Steven Gil Cruz <danistcruz@gmail.com>
         * @since 1.0.0
         * Se imprime los resultados y posteriormente se devuelven todos las videos juegos.
         */
        String resultadoVideo = ("Los video juegos entregados son : "+ videoJuegoEntregados);
        log.info(resultadoVideo);
        for (VideoJuego elemento : videoJuegos) {
            if (elemento.isEntregado()) {
            } elemento.entregar();
        }
        log.info("Todos los video juegos han sido devueltos ");

        /**
         * @author Daniel Steven Gil Cruz <danistcruz@gmail.com>
         * @since 1.0.0
         * Se hace el recorrido en un for para saber cual es la serie con mas temporadas .
         */
        Serie serieConMasVistas = new Serie();
        serieConMasVistas.setNumeroTemporadas(0);
        for (Serie serie : series) {
            if (serie.compareTo(serieConMasVistas) == 3) {
                serieConMasVistas = serie;
            }
        }
        String resultadoSerie = ("La serie con mas temporadas es : "+ serieConMasVistas);
        log.info(resultadoSerie);

        /**
         * @author Daniel Steven Gil Cruz <danistcruz@gmail.com>
         * @since 1.0.0
         * Se hace el recorrido en un for para saber cual es el videojuego que tiene mas horas de juego .
         */
        VideoJuego videoJuegoMasHoras = new VideoJuego();
        videoJuegoMasHoras.setHorasEstimadas(0);
        for (VideoJuego videoJuego : videoJuegos) {
            if (videoJuego.compareTo(videoJuegoMasHoras) == 3) {
                videoJuegoMasHoras = videoJuego;
            }
        }
        String resultadoVideoJuego = ("El juego con mas horas estimadas es  : "+ videoJuegoMasHoras);
        log.info(resultadoVideoJuego);
    }
}