/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.propuestos1;

import java.io.IOException;
import java.util.Scanner;


/**
 *
 * @author PcEduDM
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce un numero mayor a 0: ");
        int numero = entrada.nextInt();
        
        int factorial = 1;
        
        for (int i = 1 ; (i <= numero) ; i++ ) {
            factorial = factorial * i;
            
        }
        System.out.println("El resultado factorial es..." + factorial);
    }
    
}
