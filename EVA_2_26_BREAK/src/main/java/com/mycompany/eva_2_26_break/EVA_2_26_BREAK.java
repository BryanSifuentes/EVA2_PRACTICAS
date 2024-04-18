/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva_2_26_break;

import java.util.Scanner;

/**
 *
 * @author Alexs
 */
public class EVA_2_26_BREAK {

    public static void main(String[] args) {
        String usuario, pwd;
        String USUARIO = "Admin";
        String PASSWORD = "Admin";
        Scanner ver = new Scanner(System.in);
        
        while(true){
            System.out.println("Usuario:");
            usuario = ver.nextLine();
            System.out.println("Contraseña:");
            pwd = ver.nextLine();
            if (usuario.equals(USUARIO) && pwd.equals(PASSWORD)) {
                break;
            }else
                System.out.println("Error intentelo de nuevo");
            }
        System.out.println("Bienvenido al SISTEMA!!");
        }
    }

