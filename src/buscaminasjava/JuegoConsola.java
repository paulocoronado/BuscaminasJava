/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscaminasjava;

import java.util.Scanner;

/**
 *
 * @author paulo
 */
class JuegoConsola extends Juego {

    Scanner miEscanner = new Scanner(System.in);

    @Override
    void iniciarJuego() {
        configurarJuego();
        iniciarTablero();
        if(jugar()){
            System.out.println("Explosión!!!");
        }else{
            System.out.println("Has ganado!!!");
        };
    }

    private void configurarJuego() {

        filas = ingresarDato("Ingrese la cantidad de filas", 50);
        columnas = ingresarDato("Ingrese la cantidad de columnas", 50);
        minas = ingresarDato("Ingrese la cantidad de minas", filas * columnas);

    }

    private int ingresarDato(String mensaje, int límite) {
        int dato;
        do {
            System.out.println(mensaje + ":");
            dato = miEscanner.nextInt();
        } while (dato < 0 || dato > límite);
        return dato;
    }

    private boolean jugar() {
        
        boolean crédito = true;
        boolean explosión=false;

        do {
            int x = ingresarDato("¿Fila?", filas)-1;
            int y = ingresarDato("¿Columna?", columnas)-1;

            if (miTablero.misCeldas[x][y].getMiBomba() != null) {
                explosión=true;
            } else {

                miTablero.cambiarEstadoCeldas(x, y);
            }
            this.imprimirTablero();

        } while (crédito == true && explosión==false);
        
        return explosión;
        
    }

    private void imprimirTablero() {
        for (Celda[] miFila : miTablero.misCeldas) {
            for (Celda unaCelda : miFila) {
                if (!unaCelda.isEstado()) {
                    System.out.print((char) 0x2592);
                } else {
                    System.out.print(unaCelda.getBombasAlrededor());
                }
            }
            System.out.println("");
        }

    }
}
