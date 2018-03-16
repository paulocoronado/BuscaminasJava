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
class JuegoTest extends Juego {
    
    @Override
     void iniciarJuego() {
        filas=3;
        columnas=3;
        minas=2;
        
        miTablero = new Tablero(filas, columnas);
        miTablero.llenarTablero(minas);
        
        for (Celda[] miFila : miTablero.misCeldas) {
            for (Celda unaCelda : miFila) {
                if (unaCelda.getMiBomba() != null) {
                    System.out.print("|  1  |");
                } else {
                    System.out.print("|     |");
                }
            }
            System.out.println("");
        }

        System.out.println("");

        for (Celda[] miFila : miTablero.misCeldas) {
            for (Celda unaCelda : miFila) {
                System.out.print("|  " + unaCelda.getBombasAlrededor() + "  |");
            }
            System.out.println("");
        }
    }
    
    
}
