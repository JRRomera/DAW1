/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejemplos_02;

/**
 *
 * @author joseramon.romera
 */
public class Ejemplo_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Persona persona = new Persona("11111A", "El Fary");
        Alumno alumno = new Alumno("DAW1", "00000B", "Pericales");
        Profesor profesor = new Profesor("Informática", "22222H", "Cañizares");
// PUEDO USAR PERSONA  (CLASE PADRE) PARA CREAR TODAS LAS INSTANCIAS DANDO LUEGO VALOR AL CONSTRUCTOR DE CADA CLASE HIJA (Alumno, Profesor).
//        Persona alumno = new Alumno("DAW1","00000B", "Pericales");
//        Persona profesor = new Profesor("Informática","22222H","Cañizares");

//        alumno.mePresento();
//        profesor.mePresento();
        Persona listaPersonal[] = new Persona[4];
        listaPersonal[0] = new Profesor("Lengua", "55555A", "Juan");
        listaPersonal[1] = new Persona("222B", "Angel");
        listaPersonal[2] = new Alumno("DAW2", "53A", "María");
        listaPersonal[3] = new Alumno("GEA2", "444D", "Cristina");

        for (Persona p : listaPersonal) {

            System.out.println("Nombre: " + p.nombre);
            System.out.println("DNI: " + p.nif);

        }

//        for (int i = 0; i < listaPersonal.length; i++) {
//            
//            System.out.println("Curso: " + listaPersonal[i]);
//        }
        System.out.println("Materia: " + ((Profesor) listaPersonal[0]).getMateria());
        System.out.println("Curso: " + ((Alumno) listaPersonal[2]).getCurso());

        ((Profesor) listaPersonal[0]).corregir();

        System.out.println("");
        System.out.println("");
        for (int i = 0; i < listaPersonal.length; i++) {
            try {
                System.out.println("Curso: " + ((Alumno) listaPersonal[i]).getCurso());
            } catch (Exception e) {

            }
        }

        System.out.println("");
        System.out.println("");
        
        for (Persona p: listaPersonal){
            
            p.mePresento();
            if(p instanceof Alumno){
                ((Alumno) p).estudiar();
                System.out.println("Curso: " + ((Alumno) p).getCurso());
            }
            if (p instanceof Profesor){
            ((Profesor) p).corregir();
                System.out.println("Materia: "+ ((Profesor) p).getMateria());
        }
            
        }
        
    }//fin del main

}// fin del app
