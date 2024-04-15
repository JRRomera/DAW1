/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_06;

import java.time.LocalDate;

/**
 *
 * @author joseramon.romera
 */
public class Turismo extends Vehiculo {

    private double precioDia;

    
    public Turismo(String matricula, String marca_modelo, int km) {
        super(matricula, marca_modelo, km);
        this.precioDia = 30;
        
    }

    
    

    
    
    
    @Override
    public void alquilar(LocalDate fecha_alquiler, int km) {
    }

    @Override
    public void devolver(LocalDate fecha_devolucion, int km) {
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
