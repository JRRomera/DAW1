/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplos_02;

/**
 *
 * @author joseramon.romera
 */
public class Alumno extends Persona{
    
    private String curso;

    public Alumno(String curso, String nif, String nombre) {
        super(nif, nombre);
        this.curso = curso;
    }
    

    public void estudiar(){
        
        System.out.println("Estoy estudiando...");
    }

    public String getCurso() {
        return curso;
    }
    
    
    
}
