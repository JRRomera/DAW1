/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_05;

/**
 *
 * @author joseramon.romera
 */
public abstract class Vehiculo {

    private String matricula;
    private String marca_modelo;
    protected int km_motor;
    protected int km_aceite;
    protected int km_ruedas;

    public Vehiculo(String matricula, String marca_modelo) {
        this.matricula = matricula;
        this.marca_modelo = marca_modelo;
    }

    public Vehiculo(String matricula, String marca_modelo, int km_motor) {
        this.matricula = matricula;
        this.marca_modelo = marca_modelo;
        this.km_motor = km_motor;
    }

    @Override
    public String toString() {
        String km = (km_motor==0)? "Nuevo" : Integer.toString(km_motor); 
        return String.format("%s - %s - %skm", marca_modelo,matricula,km);
    }

    
    public void avanzar(int km){
        
        this.km_motor+=km;
        this.km_ruedas+=km;
        this.km_aceite+=km;
        if (checkAceite()){
            System.out.println(marca_modelo + " ha cambio de aceite.");
        }
        if(checkRuedas()){
            System.out.println(marca_modelo + " ha cambio de ruedas.");
        }
//        if (this instanceof Camion){
//            if(checkTacografo)
//        }
    }
    
    public abstract boolean checkAceite();
    
    public abstract boolean checkRuedas();

    public String getMarca_modelo() {
        return marca_modelo;
    }
    
    
    
    
    
}
