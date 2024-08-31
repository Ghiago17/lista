/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectolista;

/**
 *
 * @author Oscar Perez
 */
public class Nodo {
    //Atributos
    private Persona dato;
    private Nodo dirSig;
    //Constructor
    public Nodo(){
        this.dato = null;
        this.dirSig = null;
    }
    //Get
    public Persona getDato() {
        return dato;
    }
    public Nodo getDirSig() {
        return dirSig;
    }
    //Set
    public void setDato(Persona dato) {
        this.dato = dato;
    }
    public void setDirSig(Nodo dirSig) {
        this.dirSig = dirSig;
    }
}
