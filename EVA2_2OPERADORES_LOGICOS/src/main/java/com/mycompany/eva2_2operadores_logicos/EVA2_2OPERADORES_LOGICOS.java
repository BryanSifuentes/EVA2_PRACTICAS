/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_2operadores_logicos;

/**
 *
 * @author Alexs
 */
public class EVA2_2OPERADORES_LOGICOS {

    public static void main(String[] args) {
        // TODO code application logic here
        boolean A, B;
        A = false;
        B = false;
        boolean resu;
        //OPERADORES AND -->
        resu = A && B;
        System.out.println("resu =" + resu);
        A = true;
        B = false;
        resu = A && B;
        System.out.println("resu=" + resu);
        A = true;
        B = true;
        resu = A && B;
        System.out.println("resu =" +resu);
        A = false;
        B = false;
        resu = A || B;
        System.out.println("resu(or)" + resu);
        A = true;
        B = false;
        resu = A || B;
        System.out.println("resu(or) =" + resu);
        A = true;
        B = true;
        resu = A || B;
        System.out.println("resu (or) = " + resu);
        //NEGACION --> !
        A = false;
        resu = !A;
        System.out.println("resu (!)" + resu);
        
    }
}
