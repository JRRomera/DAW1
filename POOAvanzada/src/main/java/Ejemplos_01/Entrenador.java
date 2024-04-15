/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplos_01;

/**
 *
 * @author joseramon.romera
 */
public class Entrenador extends SeleccionFutbol{

    private int idFederacion;
    
    public Entrenador(int idFederacion, int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
        this.idFederacion = idFederacion;
        
    }
    
    
    public void dirigirPartido(){
        System.out.println("Estoy dirigiendo un partido.");
    }
    
    public void dirigirEquipo(){
        
        System.out.println("Estoy entrenando un equipo.");
    }

    @Override
    public String toString() {
        return "Soy  "+ nombre + "el entrenador con ID: " + idFederacion + " y tengo "+edad +"años.";
    }
    
    
    
    
    
    
    
    
}
