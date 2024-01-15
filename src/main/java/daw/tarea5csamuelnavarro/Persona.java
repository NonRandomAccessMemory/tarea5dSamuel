/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw.tarea5csamuelnavarro;

/**
 *
 * @author snavgar
 */
public class Persona {
    String nombre= new String();
    
    public Persona(){};
    public Persona(String nombre){
    this.nombre=nombre;}
    
    public String getNombre(){
        return this.nombre;}
    public void setNombre(String nuevoNombre){
        if(!this.nombre.isEmpty() && this.nombre.isBlank()){
            this.nombre= nombre;}
        }
}
