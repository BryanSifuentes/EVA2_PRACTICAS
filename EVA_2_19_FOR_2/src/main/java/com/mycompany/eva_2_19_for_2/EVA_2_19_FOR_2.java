/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva_2_19_for_2;

import java.util.Scanner;

/**
 *
 * @author Alexs
 */
public class EVA_2_19_FOR_2 {

    public static void main(String[] args) {
       // PREGUNTA: CANTIDAD DE ESTUDIANTES EN EL GRUPO
       int numAlum;
       Scanner captu = new Scanner(System.in);
       System.out.println("¿cuantos estudiantes tiene el grupo?");
       numAlum = captu.nextInt();
       //hay que caturar todas la calificaciones:
       for (int i = 1; i <= numAlum; i++) {
          System.out.println("calificacion: ");
           int califa = captu.nextInt();
       }
    }
}
