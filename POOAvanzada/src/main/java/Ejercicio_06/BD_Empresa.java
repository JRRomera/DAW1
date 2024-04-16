/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_06;

import java.util.ArrayList;

/**
 *
 * @author joseramon.romera
 */
public class BD_Empresa {

    private static ArrayList<Vehiculo> listaVehiculos = new ArrayList();
    private static ArrayList<Alquiler> listaAlquileres = new ArrayList();

    public static void añadirVehiculo(Vehiculo v) {
        listaVehiculos.add(v);

    }

    public static void añadirAlquiler(Alquiler alquiler) {
        listaAlquileres.add(alquiler);
    }

    public static void listarFlota() {

        System.out.println("=============================");
        System.out.println("     LISTADO DE TURISMOS     ");
        for (Vehiculo v : listaVehiculos) {
            if (v instanceof Turismo) {
                System.out.println(v.toString());
            }
        }  
        System.out.println("\n     LISTADO DE FURGONETAS     ");    
        for (Vehiculo v : listaVehiculos) {
            if (v instanceof Furgoneta) {
                System.out.println(v.toString());
            }
        }
        System.out.println("=============================");
        System.out.println("");

    }

    public static Vehiculo obtenerVehiculo(String matricula) {
        Vehiculo v = null;
        for(Vehiculo v1: listaVehiculos){
            if (v1.getMatricula().equals(matricula)){
                v = v1;
            }
        }

        return v;
    }

    public static Alquiler obtenerUltimoAlquiler(String matricula) {
        Alquiler alquiler;

        return null;
    }

    public static void imprimirHistoricoAlquileres() {

    }

}
