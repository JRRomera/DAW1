/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio_05;

import java.util.ArrayList;

/**
 *
 * @author joseramon.romera
 */
public class Ejercicio_05APP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList<Vehiculo> cosas = new ArrayList<>();

        Vehiculo peugeot = new Turismo("1111FFF", "PEUGEOT 308");
        Vehiculo seat = new Turismo("2222JJJ", "SEAT IBIZA", 10_000);
        Vehiculo volvo = new Camion("3333GGG", "VOLVO 500");
        Vehiculo scania = new Camion("4444BBB", "SCANIA 550", 100_000);

        cosas.add(peugeot);
        cosas.add(seat);
        cosas.add(volvo);
        cosas.add(scania);

        mostrarVehiculos(cosas);

        System.out.println("");
        peugeot.avanzar(15_000);
        seat.avanzar(30_000);
        volvo.avanzar(30_000);
        scania.avanzar(50_000);
        System.out.println("");

        mostrarVehiculos(cosas);

    }// FIN MAIN

    private static void mostrarVehiculos(ArrayList<Vehiculo> lista) {

        System.out.println("----------TURISMOS------------");
        System.out.println("");
        for (Vehiculo cosas2 : lista) {
            if (cosas2 instanceof Turismo) {
                System.out.println(cosas2);
            }

        }
        System.out.println("");
        System.out.println("----------CAMIONES-----------");
        System.out.println("");
        for (Vehiculo cosas2 : lista) {
            if (cosas2 instanceof Camion) {
                System.out.println(cosas2);
            }
            
        }

    }

}// FIN APP
