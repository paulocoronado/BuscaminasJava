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
public class Celda {
    
    private Mina miBomba;
    private Bandera miBandera;
    private boolean estado;
    private int bombasAlrededor;

    public Celda() {
        this.estado = false;
    }

    
    public Mina getMiBomba() {
        return miBomba;
    }

    public void setMiBomba(Mina miBomba) {
        this.miBomba = miBomba;
    }

    public Bandera getMiBandera() {
        return miBandera;
    }

    public void setMiBandera(Bandera miBandera) {
        this.miBandera = miBandera;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getBombasAlrededor() {
        return bombasAlrededor;
    }

    public void setBombasAlrededor(int bombasAlrededor) {
        this.bombasAlrededor = bombasAlrededor;
    }
    
}
