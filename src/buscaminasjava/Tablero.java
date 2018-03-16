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
public class Tablero {
    
    Celda misCeldas[][];
    Cronometro miCronometro;
    Contador miContador;
    Sembrador miSembrador;
    
    
    void llenarTablero(int cantidadMinas){
        miSembrador.sembrarMinas(cantidadMinas, misCeldas);
        miSembrador.contarMinas(misCeldas);
    }

    void cambiarEstadoCeldas(int fila, int columna){
        
        miSembrador.cambiarEstado(misCeldas, fila, columna);
        
    }
    
    public Tablero(int ancho, int largo){
        
        miSembrador=new Sembrador();
        miCronometro=new Cronometro();
        miContador=new Contador();
        misCeldas=new Celda[ancho][largo];
        int fila=0;        
        while(fila<ancho){
            int columna=0;
            while(columna<largo){
                misCeldas[fila][columna]=new Celda();
                columna++;
            };
            fila++;
        }; 
    }
}
