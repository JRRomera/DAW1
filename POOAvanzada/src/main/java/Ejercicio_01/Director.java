/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_01;

/**
 *
 * @author joseramon.romera
 */
public class Director extends Empleado {

    private int numDespacho;
    private double plusSalario;

    public Director(String DNI, String nombre, int numDespacho) {
        super(DNI, nombre);
        this.numDespacho = numDespacho;
        super.setPrecioHoraExtra(20);
          this.plusSalario = 400;
    }

    
    
    @Override
    public double calcularSueldo(){
        return super.calcularSueldo()+ plusSalario;
    }
    
    
    public void analizarDatos() {

        System.out.println("Estoy analizando muchos datos...");
    }

}
