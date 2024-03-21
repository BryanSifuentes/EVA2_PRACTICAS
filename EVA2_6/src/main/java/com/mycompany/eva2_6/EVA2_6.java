/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_6;

import java.util.Scanner;

/**
 *
 * @author Alexs
 */
public class EVA2_6 {

    public static void main(String[] args) {
        //TODO code application logic here
        //CUAL ES EL MAYOR VALOR ENTRE DOS NUMEROS
        //PIDAN AL USUARIO DOS VALORES ENTEROS
        int num1, num2;
        Scanner ver = new Scanner(System.in);
        System.out.println("valor 1");
        num1 =ver.nextInt();
        System.out.println("valor 2");
        num2 = ver.nextInt();
        if(num1 > num2)
            System.out.println(num1+"es mayor!!!");
        else{
            if(num1== num2) //num1 es igual que num2?
                System.out.println("son iguales");
            else
            System.out.println(num2+"es mayor!!!");
        
    }
    }
}

