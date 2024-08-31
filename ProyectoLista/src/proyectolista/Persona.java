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
public class Persona {
    //Atributos
    private String nombre;
    private int edad;
    private int sexo;
    //Constructor
    public Persona(){
        this.nombre = null;
        this.edad = 0;
        this.sexo = -1;
    }
    //Get
    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }
    public int getSexo() {
        return sexo;
    }
    //Set
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setSexo(int sexo) {
        this.sexo = sexo;
    }
    //Operaciones
    public boolean mujerMayoredad(){
        return this.sexo == 0 && this.edad >= 18;
    }
    public boolean esMujer(){
        return this.sexo == 0;
    }    
}
