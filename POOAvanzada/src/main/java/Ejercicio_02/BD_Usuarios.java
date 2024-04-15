/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_02;

import java.util.ArrayList;

/**
 *
 * @author joseramon.romera
 */
public class BD_Usuarios {

    private static ArrayList<USU_NORMAL> bd = new ArrayList();

    public static void añadirUsuario(USU_NORMAL usuario) {

        bd.add(usuario);

    }

    public static ArrayList<USU_NORMAL> obtenerBD() {
        return bd;
    }

    public static boolean verificarLogin(String usu, String pass) {
         
        for (USU_NORMAL usuario : bd){
            if(usu.equals(usuario.getNombre())){
                if(pass.equals(usuario.getPassword())){
                    return true;
                }
            }
            
        }

        return false;
    }

    public static USU_NORMAL obtenerUsuario(String nombre) {

        for (USU_NORMAL usuario : bd) {
            if (usuario.getNombre().equals(nombre)) {
                return usuario;
            }
        }
        return null;
    }
}
