/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.propuestos1;

import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author PcEduDM
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce un numero mayor a 0: ");
        int numero = entrada.nextInt();
        entrada.nextLine();
        String cadena = entrada.nextLine();
        
        for (int i = 0; i < (numero + 1); i++) {
            System.out.println(cadena);
        }
        
    }
}
