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

        int ancho = 3;
        int largo = 3;
        int minas = 1;

        Tablero miTablero = new Tablero(ancho, largo);
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
                System.out.print("|  "+unaCelda.getBombasAlrededor()+"  |");
            }
             System.out.println("");
        }

    }

}
