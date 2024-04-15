
package Ejemplos_01;





public class Futbolista extends SeleccionFutbol{

    
    private int dorsal;
    private String demarcación;

    public Futbolista(int dorsal, String demarcación, int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
        this.dorsal = dorsal;
        this.demarcación = demarcación;
    }
    
    
    public void jugarPartido(){
        System.out.println("Estoy jugando un partido.");
    }
    
    public void entrenar(){
        
        System.out.println("Estoy entrenando. ");
    }
    
    
    
    
    
    
    @Override
    public String toString() {
        return "Hola me llamo " + nombre + ", soy un futbolista.";
    }
    
    
    
    
    
    
}
