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
public class Furgoneta extends Vehiculo{
    
    private double precioKilometro;

    public Furgoneta( String matricula, String marca_modelo, int km) {
        super(matricula, marca_modelo, km);
        this.precioKilometro = 0.5;
        
    }

    
    
    @Override
    public void alquilar(LocalDate fecha_alquiler, int km) {
       
    }

    @Override
    public void devolver(LocalDate fecha_devolucion, int km) {
    }
    
    
    
    
    
}
