/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplos_02;

/**
 *
 * @author joseramon.romera
 */
public class Persona {
    
    protected String nif;
    protected String nombre;
    
    
    public Persona(String nif, String nombre){
        this.nif = nif;
        this.nombre = nombre;
        
        
    }
    
    public void mePresento(){
        
        System.out.println("Hola, me llamo " + nombre );
    }
    
    
}
