/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva_2_20_for_3;

import java.util.Scanner;

/**
 *
 * @author Alexs
 */
public class EVA_2_20_FOR_3 {

    public static void main(String[] args) {
        // PRIMER PROBLEMA
        Scanner ver = new Scanner(System.in);
        String mens,vece = "";
        int cant,num,num1;
        System.out.println("pon el mensaje que desea imprimir");
        mens = ver.nextLine();
        System.out.println("cuantas veces desea imprimir el mensaje");
        cant = ver.nextInt();
        for (int i = 1; i <= cant; i++) {
            System.out.println(mens);
        }
        //SEGUNDO PROBLEMA
        System.out.println("introduce un numero entero");
        num = ver.nextInt();
        for (int i = 1; i <= num; i++) {
            System.out.print(i+" ");
        }
        System.out.println("");
        //TERCER PROBLEMA
        System.out.println("introduce el numero que desees que cuente");
        num1 = ver.nextInt();
        for (int i = 0; i < num1; i++) {
            vece += "*";
            System.out.println(vece);
        }

            // CUARTO
            int Num1;
            System.out.println("introduce el numero entero");
            Num1= ver.nextInt();
            for (int i = 0; i <= Num1; i++) {
                for(int f = 1; f <= i; f++) {
                   System.out.print("*");
                }
                System.out.println("");
            }
            for (int i = Num1; i >= 1; i--) {
                for (int f = 1; f <= i; f++) {
                    System.out.print("*");
                }
                System.out.println("");
                }
            }
       
    }

