/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio_02;

import java.util.Scanner;

/**
 *
 * @author joseramon.romera
 */
public class App {

    static Scanner teclado = new Scanner(System.in);
    private static int contador = 2;

    public static void main(String[] args) {

        BD_Usuarios.añadirUsuario(new USU_NORMAL("zipi", "1234", "zipi@kk.com"));
        BD_Usuarios.añadirUsuario(new USU_NORMAL("zape", "1234", "zape@kk.com"));
        BD_Usuarios.añadirUsuario(new USU_ADMIN("root", "root", "root@admin.com"));

//        USU_NORMAL zape = BD_Usuarios.obtenerUsuario("zipi");
//        zape.listarUsuarios( BD_Usuarios.obtenerBD());
//        
//        USU_ADMIN root = (USU_ADMIN)BD_Usuarios.obtenerUsuario("root");
//        root.listarUsuarios(BD_Usuarios.obtenerBD());
        do {

            System.out.println("Login");
            System.out.printf("******************%d/2 \n", contador);
            System.out.print("Usuario: ");
            String usuario = teclado.nextLine();
            System.out.print("Password: ");
            String password = teclado.nextLine();

            if (BD_Usuarios.verificarLogin(usuario, password)) {
                menu(BD_Usuarios.obtenerUsuario(usuario));

            } else {
                System.out.println("");
                System.out.println("Datos incorrectos");
                System.out.println("");
                contador--;
            }

        } while (contador > 0);
        System.out.println("Saliendo...");

    }

    private static void menu(USU_NORMAL usuario) {
        int opcion = 5;
        String cabecera = (usuario instanceof USU_ADMIN) ? "Administrador: <<" : "Usuario:<<";

        do {
            System.out.println("**********************");
            System.out.println(cabecera + usuario.getNombre() + ">>");
            System.out.println("**********************");
            System.out.println("1. Salir del sistema");
            System.out.println("2. Listar Usuarios");
            System.out.println("3. Cambiar Password");
            if (usuario instanceof USU_ADMIN) {
                System.out.println("4. Cambiar Password Usu");
            }
            System.out.print("Elige una opción> ");
            opcion = Integer.parseInt(teclado.nextLine());
        
        switch (opcion) {
            case 1:
                contador = 2;
                return;
            case 2:
                usuario.listarUsuarios(BD_Usuarios.obtenerBD());
                break;
            case 3:
                usuario.cambiarPassword();
                break;
            case 4:
                if (usuario instanceof USU_ADMIN){
                    ((USU_ADMIN) usuario).cambiarPasswordUsuario();
                }else{
                    System.out.println("Solo se admiten valores entre 1 y 3.");
                }
                break;
            default:
               if (usuario instanceof USU_ADMIN){
                   System.out.println("Solo se admiten valores entre 1 y 4.");
               }
               else{
                   System.out.println("Solo se admiten valores entre 1 y 3.");
               }
        } 
    }while (opcion != 1);
        }


}//FIN APP
