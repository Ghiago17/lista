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
public class ListaEnlazadaPersonas {
    //Atributos
    private Nodo inicio,fin;
    //Constructor
    public ListaEnlazadaPersonas(){
       this.inicio = this.fin = null; 
    }
    //Get
    public Nodo getInicio() {
        return inicio;
    }
    public Nodo getFin() {
        return fin;
    }
    //Set
    public void setInicio(Nodo inicio) {
        this.inicio = inicio;
    }
    public void setFin(Nodo fin) {
        this.fin = fin;
    }
    public void adicionarFinal(Nodo n){
        if(this.inicio == null){
            this.inicio = this.fin = n;
        }
        else{
            n.setDirSig(inicio);
            inicio = n;
        }
    }
    public void mostrar(){
        Nodo aux;
        if(this.inicio == null){
            System.out.print("lista vacia");
        }
        else{
            aux = inicio;
            while(aux != null){
        }        
    }        
}
