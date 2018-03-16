/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscaminasjava;

/**
 *
 * @author paulo
 */
public class BuscaminasJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        

        Juego miJuego;

        switch (args[0].toUpperCase()) {
            case "GUI":
                miJuego = new JuegoGráfico();
                break;
            case "CONSOLE":
                miJuego = new JuegoConsola();
                break;
            default:
                miJuego = new JuegoTest();
                break;
        }

        miJuego.iniciarJuego();
    }

}
