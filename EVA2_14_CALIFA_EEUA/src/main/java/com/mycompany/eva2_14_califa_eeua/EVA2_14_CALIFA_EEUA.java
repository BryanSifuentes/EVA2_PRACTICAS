/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_14_califa_eeua;

import java.util.Scanner;

/**
 *
 * @author Alexs
 */
public class EVA2_14_CALIFA_EEUA {

    public static void main(String[] args) {
           int califa;
           Scanner captura = new Scanner(System.in);
           System.out.println("introduce la calificacion(0-100):");
           califa = captura.nextInt();
             if(califa >= 90 && califa <= 100)//A
                     System.out.println("A");
             else
                 if(califa >= 80 && califa <= 89)
                         System.out.println("B");
             else
                 if(califa >= 70 && califa <= 79)
                         System.out.println("C");
             else
                 if(califa >= 60 && califa <= 69)
                         System.out.println("D");
             else
                 if(califa >= 50 && califa <= 59)
                         System.out.println("F");
       
    }
}
