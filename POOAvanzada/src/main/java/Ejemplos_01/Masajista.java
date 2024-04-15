/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplos_01;

/**
 *
 * @author joseramon.romera
 */
public class Masajista extends SeleccionFutbol {
    
    private String titulacion;
    private int aniosExperiencia;

    public Masajista(String titulacion, int aniosExperiencia, int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }
    
    public void darMasaje(){
        
        System.out.println("Estoy dando un masaje.");
    }
    
    public void mostrarDatos(){
        System.out.printf("Me llamo %s, tengo %d años de experiencia como %s. \n",nombre,aniosExperiencia,titulacion);
    }
    
}
