/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_7_par_impar;

import java.util.Scanner;

/**
 *
 * @author Alexs
 */
public class EVA2_7_PAR_IMPAR {

    public static void main(String[] args) {
        int num, divi, resi;
        Scanner captu = new Scanner(System.in);
        System.out.println("introduce un numero");
        num = captu.nextInt();
        divi = num / 2;
        System.out.println("Division entero de " + num +" / 2 = " + divi);
        resi = num % 2;
        System.out.println("divicion entero de" +num + "% 2 = "+ resi);
        if(resi==1)
        System.out.println("es impar");
        else
            System.out.println("el numero es par");
        
    }
}
