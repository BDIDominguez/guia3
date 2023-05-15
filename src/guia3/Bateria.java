/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3;

/**
 *
 * @author Dario
 */
public class Bateria {
    private int carga;

    @Override
    public String toString() {
        return "Bateria{" + "carga=" + carga + '}';
    }

    public Bateria(int carga) {
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
    
    
}
