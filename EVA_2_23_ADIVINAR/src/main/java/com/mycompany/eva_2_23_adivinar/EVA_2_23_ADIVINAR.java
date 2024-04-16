/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva_2_23_adivinar;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Alexs
 */
public class EVA_2_23_ADIVINAR {

    public static void main(String[] args) {
        int nume = 5;//numero que tine que adivinira  ( entre 1 y 10)
        int valor = 0; //valor para almacenar lo que capture el usuario
        Scanner captu = new Scanner(System.in);
        do{
            System.out.println("¿cual es el numero? (entre 1 y 10):");
            valor = captu.nextInt();
        }while(nume != valor);
        System.out.println("adivinaste!!");
        }
    }

