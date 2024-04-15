/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejemplos_01;

/**
 *
 * @author joseramon.romera
 */
public class ejemplo01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Entrenador entrenador = new Entrenador(1,1,"Ancelotti","Carlo",65); 
        System.out.println(entrenador.toString());
        entrenador.dirigirEquipo();
        
        Masajista masajista1  = new Masajista ("Masajeador Extremo",6,4,"Pericales","Fanegas",44);
        masajista1.darMasaje();
        masajista1.mostrarDatos();
        
        SeleccionFutbol selFut = new SeleccionFutbol(1, "Pepe", "Ros", 15);
        selFut.concentrarse();
        selFut.apellidos = "Martinez";
        selFut.nombre = "Juan";
        System.out.println(selFut.toString());

        Futbolista jugador = new Futbolista(9, "Delantero", 2, "Alberto", "Lopez", 22);

        System.out.println(jugador.toString());

        jugador.viajar();
        jugador.jugarPartido();
        jugador.entrenar();

    }

}
