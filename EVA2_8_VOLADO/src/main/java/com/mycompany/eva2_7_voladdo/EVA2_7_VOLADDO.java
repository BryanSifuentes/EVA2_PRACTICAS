/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_7_voladdo;

/**
 *
 * @author Alexs
 */
public class EVA2_7_VOLADDO {

    public static void main(String[] args) {
        //numero aleatorio de java :
        //valores entre 0 y 1.
        //0.313534354354354
        //0.635345454
        double moneda;
        moneda = Math.random();
        System.out.println("el valor de la moneda = " + moneda);
        //0.5 es la mitad del rango
        if(moneda > 0.5)
            System.out.println("CARA");
        else
            System.out.println("CRUZ");
        
    }
}
