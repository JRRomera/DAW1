/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio_01;

import java.util.ArrayList;

/**
 *
 * @author joseramon.romera
 */
public class Ejercicio_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//
//        Empleado empleado = new Empleado("11111A", "Pericales");
//        Contable contable = new Contable("222222B", "Cañizares");
//        Director director = new Director("333333A", "Fanegas", 5);
//
//        System.out.println("Salarios");
//        System.out.printf("%s -> %.2f \n",empleado.getNombre(), empleado.calcularSueldo());
//        System.out.printf("%s -> %.2f \n",contable.getNombre(), contable.calcularSueldo());
//        System.out.printf("%s -> %.2f \n",director.getNombre(), director.calcularSueldo());
//        
//        empleado.añadirHorasExtras(5);
//        contable.añadirHorasExtras(5);
//        director.añadirHorasExtras(5);
//
//        System.out.println("");
//        System.out.println(empleado.obtenerDatos());
//        System.out.println("Sueldo: " + empleado.calcularSueldo());
//        System.out.println(contable.obtenerDatos());
//        System.out.println("Sueldo: " + contable.calcularSueldo());
//        System.out.println(director.obtenerDatos());
//        System.out.println("Sueldo: " + director.calcularSueldo());
//
//        contable.contabilizar();
//        director.analizarDatos();

        ArrayList<Empleado> listado = new ArrayList();

        listado.add(new Empleado("11111A", "Pericales"));
        listado.add(new Contable("222222B", "Cañizares"));
        listado.add(new Director("333333A", "Fanegas", 5));


        for (Empleado empleado: listado){
            
            if (empleado instanceof Contable){
                System.out.println("_______Contable_________");
            }
            else if(empleado instanceof Director){
                System.out.println("________Director_________");
            }
            else{
                System.out.println("__________Empleado________");
            }
            
            empleado.añadirHorasExtras(5);
            System.out.println(empleado.obtenerDatos());
            System.out.println("Sueldo --> " + empleado.calcularSueldo());
            
            if(empleado instanceof Contable){
                ((Contable) empleado).contabilizar();
            }
            else if (empleado instanceof Director){
                ((Director) empleado).analizarDatos();
            }
            System.out.println("");
        }
        
        
        
        
        
    }

}
