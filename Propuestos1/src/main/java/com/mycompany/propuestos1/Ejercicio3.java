/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.propuestos1;

import java.util.Scanner;
/**
 *
 * @author PcEduDM
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("\nIntroduzca el primer numero");
        int num1 = entrada.nextInt();
        System.out.println("\nIntroduzca el segundo numero");
        int num2 = entrada.nextInt();
        System.out.println("\nIntroduzca el tercer numero");
        int num3 = entrada.nextInt();
        
        if (((num1 + num2) > num3) && ((num1 + num3) > num2) && ((num2 + num3) > num1)){
            System.out.println("Sirven para un triangulo");
        }
        else{
            System.out.println("No se puede hacer un triangulo con esos numeros");
        }
            
           
    }
}
