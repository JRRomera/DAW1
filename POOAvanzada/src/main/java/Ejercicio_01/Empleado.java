/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_01;

/**
 *
 * @author joseramon.romera
 */
public class Empleado {

    private String DNI;
    private String nombre;
    private String email;
    private double salarioBase;
    private int horasExtra;
    private double precioHoraExtra;

    public Empleado(String DNI, String nombre) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.salarioBase = 1000;
        this.precioHoraExtra = 10;

    }

    public double calcularSueldo() {
        double sueldo = salarioBase + horasExtra*precioHoraExtra;
        return sueldo;
    }

    public String obtenerDatos() {

        String datos = String.format("%s (DNI:%s)", nombre, DNI);
        return datos;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public int getHorasExtra() {
        return horasExtra;
    }

    public void setHorasExtra(int horasExtra) {
        this.horasExtra = horasExtra;
    }

    public double getPrecioHoraExtra() {
        return precioHoraExtra;
    }

    public void setPrecioHoraExtra(double precioHoraExtra) {
        this.precioHoraExtra = precioHoraExtra;
    }

    public void añadirHorasExtras(int horas){
        
        this.horasExtra = this.horasExtra + horas;
    }
    
    
}
