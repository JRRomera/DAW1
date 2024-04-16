/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio_06;

import java.util.Scanner;

/**
 *
 * @author joseramon.romera
 */
public class Ejercicio_06APP {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        //Datos
        BD_Empresa.añadirVehiculo(new Turismo("1111TTT", "Volvo XC60", 0));
        BD_Empresa.añadirVehiculo(new Turismo("2222TTT", "Audi A4", 0));
        BD_Empresa.añadirVehiculo(new Furgoneta("2222FFF", "Citroen C16", 0));
        BD_Empresa.añadirVehiculo(new Furgoneta("1111FFF", "Mercedes VITO", 10000));

        // MENU
        int opcion = 0;
        do {
            BD_Empresa.listarFlota();
            System.out.println("");
            mostrarMenu();
            try {
                opcion = Integer.parseInt(teclado.nextLine());
            } catch (Exception e) {
                System.out.println(e.getMessage() + " \\ Introduce un código válido.");
                opcion = 0;
            }
            switch (opcion) {
                case 1 -> {
                    añadirVehiculo();
                }
                case 2 -> {
                }
                case 3 -> {alquilarVehiculo();
                }
                case 4 -> {
                }
                case 5 -> {
                }
                default -> {
                    System.out.println("Introduce un número del 1 al 5");
                }
            }

        } while (opcion != 5);
        System.out.println("Saliendo del app...");

    }

    private static void mostrarMenu() {

        System.out.println("ALQUILER");
        System.out.println("*".repeat(20));
        System.out.println("1. Añadir vehículo");
        System.out.println("2. Historico alquileres");
        System.out.println("3. Alquilar vehiculo");
        System.out.println("4. Devolver vehiculo");
        System.out.println("5. Salir del sistema");
        System.out.println("");
        System.out.print("Opcion> ");

    }

    private static void añadirVehiculo() {
        String tipo;
        String matricula;
        String marca_modelo;
        int kilometros;
        Vehiculo v;
        System.out.println("AÑADIENDO VEHICULO A LA BASE DE DATOS...");
        System.out.print("Tipo de vehículo [T/F]: ");
        tipo = teclado.nextLine();
        if (tipo.equalsIgnoreCase("T") || tipo.equalsIgnoreCase("F")) {
            System.out.print("Matrícula: ");
            matricula = teclado.nextLine();
            System.out.print("Marca/Modelo: ");
            marca_modelo = teclado.nextLine();
            System.out.print("Kilómetros actuales: ");
            try {
                kilometros = Integer.parseInt(teclado.nextLine());
                if (tipo.equalsIgnoreCase("T")) {
                    v = new Turismo(matricula, marca_modelo, kilometros);
                } else {
                    v = new Furgoneta(matricula, marca_modelo, kilometros);
                }
                BD_Empresa.añadirVehiculo(v);
            } catch (Exception e) {
                System.out.println(e.getMessage() + " hay un problema.");
            }

        } else {
            System.out.println("ERROR. Escoge T para Turismo o F para Furgoneta.");
            System.out.println("");
        }

    }

    private static void historicoAlquileres() {

    }

    private static void alquilarVehiculo() {
        String matricula;
        Vehiculo v;
        System.out.println("MENÚ DE ALQUILAR....");
        System.out.print("Dime la matrícula del coche: ");
        matricula = teclado.nextLine();
        v = BD_Empresa.obtenerVehiculo(matricula);
        if (v == null) {
            System.out.println("Vehículo no encontrado.");
        } else {
            System.out.println("Vehículo seleccionado: ");
            System.out.println(v.toString());
            System.out.println("");
           
            if (v.alquilado!= true){
                v.setAlquilado(true);
                System.out.println("Vehículo alquilado con éxito.");
                System.out.println("");
            }else{
                System.out.println("El vehículo no está disponible.");
                System.out.println("");
            }
            
        }

    }

    private static void devolverVehiculo() {

    }

}
