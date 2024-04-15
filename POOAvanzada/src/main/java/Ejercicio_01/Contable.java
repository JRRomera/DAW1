/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_01;

/**
 *
 * @author joseramon.romera
 */
public class Contable extends Empleado {

    private double plusSalario;

    public Contable(String DNI, String nombre) {
        super(DNI, nombre);
        this.plusSalario = 200;
        super.setPrecioHoraExtra(10);
    }


    @Override
    public double calcularSueldo(){
        return super.calcularSueldo()+ plusSalario;
    }
    
    public void contabilizar(){
        System.out.println("Estoy contabilizando facturas...");
    }
}
