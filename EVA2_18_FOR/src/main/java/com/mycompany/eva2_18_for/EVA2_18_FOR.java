/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_18_for;

/**
 *
 * @author Alexs
 */
public class EVA2_18_FOR {

    public static void main(String[] args) {
       //INICIO; CONDICION; INCREMENTO/DECREMENTO
        for (int i = 1; i <= 10; i++){
            //LLAVES SON OPERACIONES, USENLAS CUABDO
            // TENGAN MAS DE UNA INSTRUCCION A REPETIR
            System.out.print(i + " - ");
        }
            System.out.println("");
             //INICIO; CONDICION; INCREMENTO/DECREMENTO
        for (int i = 10; i >= 1; i--){
            //LLAVES SON OPERACIONES, USENLAS CUABDO
            System.out.print(i + " - ");
        }
        //IMPRIMITR LOS NUMEROS PARES ENTRE 0 Y 100
        //0, 2 4 6 8 10
        System.out.println("");
        for (int i = 0; i <= 100; i+=2){
            System.out.print(i + " - ");
    }
    }
}

