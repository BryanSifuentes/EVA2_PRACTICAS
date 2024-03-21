/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_12_servicio_social;

import java.util.Scanner;

/**
 *
 * @author Alexs
 */
public class EVA2_12_SERVICIO_SOCIAL {

    public static void main(String[] args) {
       int creditos, semestre;
       Scanner captu = new Scanner(System.in);
      semestre = captu.nextInt();
      System.out.println("¿cuantos creditos llevas?");
      creditos = captu.nextInt();
      //INDICAR SE PUEDE O NO REALIZAR EL SERVICION SOCIAL 
      // IR EN 6TO SEMESTRE O SUPERRIOR (semestre >- 6)
      //TENER AL MENOS 150 CREDITOS ( creditos >- 150)
      
      if ((semestre >= 6)&& (creditos >= 150))
           System.out.println("puedes realizar el sevicio social");
      else
          System.out.println("puedes realizar el servicio social");
      
    }
}
