/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva_2_25_break_cont;

/**
 *
 * @author Alexs
 */
public class EVA_2_25_BREAK_CONT {

    public static void main(String[] args) {
     for (int i = 0; i < 100; i++) {
         int mod = i % 2;
         if(mod == 1)
             continue;
         
         System.out.println(i);
     }
     System.out.println("BREAK:>>>>>>>>>>>>>");
     
     for (int i = 0; i < 100; i++) {
         System.out.println(i);
         if(i == 50)
             break;
     }
       
    }
}
