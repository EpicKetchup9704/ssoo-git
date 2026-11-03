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
public class Ej_Diferencia_Dias {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
    boolean bisiesto1;
    boolean bisiesto2;
    boolean dias1_31;
    boolean dias2_31;
    boolean resultado1;
    boolean resultado2;
    boolean febrero1;
    boolean febrero2;

    int diasContados1;
    int diasContados2;
    int mesesContados1;
    int mesesContados2;

    int dia1 = entrada.nextInt();
    entrada.nextLine();
    int mes1 = entrada.nextInt();
    entrada.nextLine();
    int anual1 = entrada.nextInt();
    entrada.nextLine();
    int dia2 = entrada.nextInt();
    entrada.nextLine();
    int mes2 = entrada.nextInt();
    entrada.nextLine();
    int anual2 = entrada.nextInt();

    if (anual1%4 == 0){
      bisiesto1 = true;
    }
    else{
      bisiesto1 = false;
    }
    if ((mes1%2 == 0) && (mes1 <= 6)){
      dias1_31 = false;
    }
    else if ((mes1%2 == 1) && (mes1 > 6)){
      dias1_31 = false;
    }
    else{
      dias1_31 = true;
    }
    
    if (mes1 == 2){
      dias1_31 = false;
      febrero1 = true;
    }

    if ((dia1 >= 31) && (dias1_31 == false)){
      resultado1 = false;
    }
    else if ((dia1 > 29) && (mes1 == 2)){
      resultado1 = false;
    }
    else if ((dia1 == 29) && (mes1 == 2) && (bisiesto1 == false)){
      resultado1 = false;
    }
    else if ((dia1 < 0) || (mes1 < 0) || (anual1 <0)){
      resultado1 = false;
    }
    else{
      resultado1 = true;
    }

    if (anual2%4 == 0){
      bisiesto2 = true;
    }
    else{
      bisiesto2 = false;
    }
    if ((mes2%2 == 0) && (mes2 <= 6)){
      dias2_31 = false;
    }
    else if ((mes2%2 == 1) && (mes2 > 6)){
      dias2_31 = false;
    }
    else{
      dias2_31 = true;
    }
    
    if (mes2 == 2){
      dias2_31 = false;
      febrero2 = true;
    }

    if ((dia2 >= 31) && (dias2_31 == false)){
      resultado2 = false;
    }
    else if ((dia2 > 29) && (mes2 == 2)){
      resultado2 = false;
    }
    else if ((dia2 == 29) && (mes2 == 2) && (bisiesto2 == false)){
      resultado2 = false;
    }
    else if ((dia2 < 0) || (mes2 < 0) || (anual2 <0)){
      resultado2 = false;
    }
    else{
      resultado2 = true;
    }


    if ((resultado1 == true) && (resultado2 == false)){
      if (anual1 < anual2){
        mesesContados2 += 12;
      }
    }
    }
    
}
