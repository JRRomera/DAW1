/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_05;

/**
 *
 * @author joseramon.romera
 */
public class Camion extends Vehiculo{
    
    
    private int km_tacografo;

    public Camion(String matricula, String marca_modelo) {
        super(matricula, marca_modelo);
    }

    public Camion(String matricula, String marca_modelo, int km_motor) {
        super(matricula, marca_modelo, km_motor);
    }

    @Override
    public void avanzar(int km) {
        super.avanzar(km); 
        this.km_tacografo += km;
        if (checkTacografo()){
            System.out.println( this.getMarca_modelo() + " ha cambiado el tacógrafo");
            
        }
    }

    
    @Override
    public boolean checkAceite()  {
        if (km_aceite>= 30_000){
            km_aceite = 0;
            return true;
        }
        return false;
        
    }
    
    @Override
    public boolean checkRuedas(){
        if (km_ruedas>= 50_000){
            km_ruedas = 0;
            return true;
        }
        return false;
         
    }
    
    public boolean checkTacografo(){
        if (km_tacografo>= 50_000){
            km_tacografo = 0;
            return true;
        }
        return false;
         
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
