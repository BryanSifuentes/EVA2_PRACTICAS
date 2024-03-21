/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_12_else_if;

import java.util.Scanner;

/**
 *
 * @author Alexs
 */
public class EVA2_12_ELSE_IF {

    public static void main(String[] args) {
        int dia;
        Scanner captura = new Scanner(System.in);
             System.out.println("introduce el dia de la semana(1-7):");
             dia = captura.nextInt();
             if(dia == 1)
                     System.out.println("Domingo");
             else
                 if(dia == 2)
                         System.out.println("Lunes");
             else
                 if(dia == 3)
                         System.out.println("Martes");
             else
                 if(dia == 4)
                         System.out.println("Miercoles");
             else
                 if(dia == 5)
                         System.out.println("Jueves");
             else
                 if(dia == 6)
                         System.out.println("viernes");
             else
                 if(dia == 7)
                         System.out.println("Sabado");
             
    }
}
