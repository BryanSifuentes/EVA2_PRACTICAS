/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_5_if;

import java.util.Scanner;

/**
 *
 * @author Alexs
 */
public class EVA2_5_IF {

    public static void main(String[] args) {
        // TODO code application logic here
        // CAPTURA TEMEPERATURA 
        int temp;
        Scanner captu = new Scanner(System.in);
        //CAPTURAR TEMPERATURA
        System.out.println("Temperatura (°C): ");
        temp = captu.nextInt();
        //VAMOS A EVALUAR 
        // SI LA TEMPERATURA ES MAYOR A 22°, SE ENCIENDE 
        //CLIMA 
        if(temp > 22)
            System.out.println("ENCENDER EL AIRE");
        
    }
}
