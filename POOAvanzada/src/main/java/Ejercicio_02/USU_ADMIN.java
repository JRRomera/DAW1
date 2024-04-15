/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_02;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author joseramon.romera
 */
public class USU_ADMIN extends USU_NORMAL {

    public USU_ADMIN(String nombre, String password, String email) {
        super(nombre, password, email);
    }

    @Override
    public void listarUsuarios(ArrayList<USU_NORMAL> lista) {

        String tipo;

        System.out.println("LISTA DE USUARIOS");
        System.out.println("=========================================");

        for (USU_NORMAL usuario : lista) {

            tipo = (usuario instanceof USU_ADMIN) ? "A" : " ";
            System.out.printf("%s  %-10s  %s %-15s \n", tipo, usuario.getNombre(), usuario.getPassword(), usuario.getEmail());

//            System.out.println(usuario.toString());
        }
    }

    public void cambiarPasswordUsuario() {
        Scanner teclado = new Scanner(System.in);
        String pass_nuevo;
        System.out.println("Nombre de usuario: ");
        String nombre_usu = teclado.nextLine();
        USU_NORMAL usuario = BD_Usuarios.obtenerUsuario(nombre_usu);
        if (usuario != null) {
            System.out.println("Contraseña actual: ");
            String pass_antiguo = teclado.nextLine();
            if (usuario.getPassword().equals(pass_antiguo)) {
                System.out.println("Nueva password: ");
                pass_nuevo = teclado.nextLine();
                usuario.setPassword(pass_nuevo);
            } else {
                System.out.println("Contraseña incorrecta.");
            }

        }

    }
}
