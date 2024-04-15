/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_05;

/**
 *
 * @author joseramon.romera
 */
public class Turismo extends Vehiculo{

    public Turismo(String matricula, String marca_modelo) {
        super(matricula, marca_modelo);
    }

    public Turismo(String matricula, String marca_modelo, int km_motor) {
        super(matricula, marca_modelo, km_motor);
    }


    
    @Override
    public boolean checkAceite() {
        if (km_aceite>= 15_000){
            km_aceite = 0;
            return true;
        }
        return false;
    }

    @Override
    public boolean checkRuedas() {
        if (km_ruedas>= 30_000){
            km_ruedas = 0;
            return true;
        }
        return false;
    }
    
    
    
    
    
    
}
