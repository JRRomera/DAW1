/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplos_02;

/**
 *
 * @author joseramon.romera
 */
public class Profesor extends Persona{
    
    private String materia;

    public Profesor(String materia, String nif, String nombre) {
        super(nif, nombre);
        this.materia = materia;
    }
    
    public void corregir(){
        System.out.println("Estoy corrigiendo...");
    }

    public String getMateria() {
        return materia;
    }
    
    
}
