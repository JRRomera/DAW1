/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_02;

import java.util.ArrayList;
import java.util.Scanner;

public class USU_NORMAL {

    private String nombre;
    private String password;
    private String email;

    public USU_NORMAL(String nombre, String password, String email) {
        this.nombre = nombre;
        this.password = password;
        this.email = email;
    }

    public void cambiarPassword() {
        Scanner teclado = new Scanner(System.in);
        String pass_nuevo;
        System.out.println("Contraseña actual: ");
        String pass_antiguo = teclado.nextLine();

        if (password.equals(pass_antiguo)) {
            System.out.println("Nueva password: ");
            pass_nuevo = teclado.nextLine();
            this.password = pass_nuevo;
        } else {
            System.out.println("Contraseña incorrecta.");
        }

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Usuario\\\\ " + "Nombre: " + nombre + ", Password: " + password + ", Email: " + email + '}';
    }

    public void listarUsuarios(ArrayList<USU_NORMAL> lista) {
        
        String tipo;

        System.out.println("LISTA DE USUARIOS");
        System.out.println("========================================="); 
        
        for (USU_NORMAL usuario : lista) {

            tipo = (usuario instanceof USU_ADMIN)? "A" : " ";
            System.out.printf("%s  %-10s  ******** %-15s \n",tipo,usuario.getNombre(),usuario.getEmail());
            
            
//            System.out.println(usuario.toString());
        }
    }

}
