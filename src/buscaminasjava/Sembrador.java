/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscaminasjava;

import java.util.Random;

/**
 *
 * @author paulo
 */
public class Sembrador {

    int filas;
    int columnas;

    void sembrarMinas(int minas, Celda celdas[][]) {

        Random miAleatorio = new Random();
        int minasPlantadas = 0;
        int x;
        int y;

        filas = celdas.length;
        columnas = celdas[0].length;

        while (minasPlantadas < minas) {

            x = miAleatorio.nextInt(columnas);
            y = miAleatorio.nextInt(filas);

            if (celdas[x][y].getMiBomba() == null) {
                celdas[x][y].setMiBomba(new Mina());
                minasPlantadas++;
            }
        }
    }

    void contarMinas(Celda celdas[][]) {

        int fila, columna;
        int totalBombas;

        for (fila = 0; fila < filas; fila++) {
            for (columna = 0; columna < columnas; columna++) {

                if (celdas[fila][columna].getMiBomba() == null) {

                    totalBombas = sumarBombas(celdas, fila, columna);
                    celdas[fila][columna].setBombasAlrededor(totalBombas);

                }

            }
        }

    }

    int sumarBombas(Celda matriz[][], int fila, int columna) {

        boolean casillaValida;
        int total = 0, x, y;

        for (x = -1; x < 2; x++) {
            for (y = -1; y < 2; y++) {

                casillaValida = validarCasilla(fila, columna, x, y);

                if (casillaValida && matriz[fila + x][columna + y].getMiBomba() != null) {
                    total++;
                }
            }
        }

        return total;

    }

    boolean validarCasilla(int fila, int columna, int x, int y) {

        boolean filaValida, columnaValida;

        if (x < 0) {

            filaValida = (fila + x) > -1;

        } else {

            filaValida = (fila + x) < filas;
        }

        if (y < 0) {

            columnaValida = (columna + y) > -1;

        } else {

            columnaValida = (columna + y) < columnas;
        }

        return filaValida && columnaValida;
    }

    void cambiarEstado(Celda matriz[][], int fila, int columna) {
        
        boolean casillaValida;
        int x, y;
        
        matriz[fila][columna].setEstado(true);

        for (x = -1; x < 2; x++) {
            for (y = -1; y < 2; y++) {

                casillaValida = validarCasilla(fila, columna, x, y);

                if (casillaValida && !matriz[fila + x][columna + y].isEstado()&& matriz[fila + x][columna + y].getMiBomba() == null) {
                    
                    cambiarEstado(matriz, fila+x, columna+y);
                }
                
                
            }
        }

    }

}
