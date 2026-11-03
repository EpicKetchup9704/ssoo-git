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
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double numS;
        double intRaiz;
        double raizResult;
        
        System.out.println("\nIntroduzca el primer numero");
        double num1 = entrada.nextDouble();
        System.out.println("\nIntroduzca el segundo numero");
        double num2 = entrada.nextDouble();
        System.out.println("\nIntroduzca el tercer numero");
        double num3 = entrada.nextDouble();
        
        numS = (num1 + num2 + num3) / 2;
        intRaiz = (numS * (numS - num1) * (numS - num2) * (numS - num3));
        
        
        
    }
}
