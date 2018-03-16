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
abstract class Juego {

    Tablero miTablero;
    int filas;
    int columnas;
    int minas;

    abstract void iniciarJuego();

    protected void iniciarTablero() {
        miTablero = new Tablero(filas, columnas);
        miTablero.llenarTablero(minas);
    }

}
