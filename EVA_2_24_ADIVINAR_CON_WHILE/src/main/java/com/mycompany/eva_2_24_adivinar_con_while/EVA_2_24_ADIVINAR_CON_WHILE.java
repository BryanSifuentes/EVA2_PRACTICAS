/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva_2_24_adivinar_con_while;

import java.util.Scanner;

/**
 *
 * @author Alexs
 */
public class EVA_2_24_ADIVINAR_CON_WHILE {

    public static void main(String[] args) {
        int nume = 5;//numero que tine que adivinira  ( entre 1 y 10)
        int valor = 0; //valor para almacenar lo que capture el usuario
       Scanner captu = new Scanner(System.in);
       while(nume != valor){
           System.out.println("introduce un numero del 1 al 10");
           valor = captu.nextInt();
       }
           System.out.println("ADIVINASTE!!");
           
       }
    }

