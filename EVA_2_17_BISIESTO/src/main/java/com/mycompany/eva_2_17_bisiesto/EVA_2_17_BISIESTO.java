/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva_2_17_bisiesto;

import java.util.Scanner;

/**
 *
 * @author Alexs
 */
public class EVA_2_17_BISIESTO {

    public static void main(String[] args) {
        int año;
        double resu;
        Scanner ver = new Scanner(System.in);
        System.out.println("introdusca el año que desae evaluar: " );
        año = ver.nextInt();
        resu = año;
        
        if(resu % 400 == 0)
            System.out.println("Son bisiesto");
        else if(resu % 4 == 0 && resu %100 != 0)
            System.out.println("son bisiesto");
        else
            System.out.println("no es bisiesto");
    }
}
