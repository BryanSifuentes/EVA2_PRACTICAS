/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_11_operadores_logicos;

/**
 *
 * @author Alexs
 */
public class EVA2_11_OPERADORES_LOGICOS {

    public static void main(String[] args) {
        boolean hayDinero, hayBuenClima;
        //PARA HACER LA CARNE ASADA SE NECESITA:
        // HAYA DINERO Y HAYA BUEN CLIMA
        hayDinero = false;
        hayBuenClima = false;
        
       System.out.println("NO HAY DINERO Y NO HAY BUEN CLIMA");
       if((hayDinero == true) && (hayBuenClima == true))
           System.out.println("SE ARMO LA CARNITA!!");
       else 
           System.out.println("BUEVITO!!");
       
       hayDinero = false;
        hayBuenClima = true;
        
       System.out.println("NO HAY DINERO Y NO HAY BUEN CLIMA");
       if((hayDinero == true) && (hayBuenClima == true))
           System.out.println("SE ARMO LA CARNITA!!");
       else 
           System.out.println("BUEVITO!!");
       
       hayDinero = true;
        hayBuenClima = false;
        
       System.out.println("NO HAY DINERO Y NO HAY BUEN CLIMA");
       if((hayDinero == true) && (hayBuenClima == true))
           System.out.println("SE ARMO LA CARNITA!!");
       else 
           System.out.println("BUEVITO!!");
       
       hayDinero = true;
        hayBuenClima = true;
        
       System.out.println("HAY DINERO Y  HAY BUEN CLIMA");
       if((hayDinero == true) && (hayBuenClima == true))
           System.out.println("SE ARMO LA CARNITA!!");
       else 
           System.out.println("BUEVITO!!");
       
    }
}
