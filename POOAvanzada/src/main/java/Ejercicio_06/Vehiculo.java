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
public abstract class Vehiculo {

    private String matricula;
    private String marca_modelo;
    protected int km;
    protected boolean alquilado;

    public Vehiculo(String matricula, String marca_modelo, int km) {
        this.matricula = matricula;
        this.marca_modelo = marca_modelo;
        this.km = km;
        this.alquilado = false;

    }

    public String getMatricula() {
        return matricula;
    }

    public void setAlquilado(boolean alquilado) {
        this.alquilado = alquilado;
    }

    
    
    public abstract void alquilar(LocalDate fecha_alquiler, int km);

    public abstract void devolver(LocalDate fecha_devolucion, int km);

    @Override
    public String toString() {
        
        String alquiladoTexto = (alquilado)? "A" : " ";
        
        return String.format("%s  %s  %-15s [%d km]",alquiladoTexto,matricula,marca_modelo,km);
    }

}
