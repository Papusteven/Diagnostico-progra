/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.clasesprimeraparte;
import com.mycompany.Clasesprimeraparte.;


/**
 *
 * @author Labora05
*/

import java.util.Scanner;

public class Clasesprimeraparte {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dijite el primer numero: ");
        int num1 = sc.nextInt();
        
        System.out.print("Dijite el segundo numero: ");
        int num2 = sc.nextInt();
        
        int total = num1 + num2;
        System.out.print("El resultado de la suma de los 2 numeros es: " + total);
        
        int total2 = num1 - num2;
        System.out.println("El resultado de la resta de los 2 numeros es: " + total2);
        
        int total3 = num1 * num2;
        System.out.println("El resultado de la multiplicacion de los 2 numeros es: " + total3);
        
        int total4 = num1 / num2;
        System.out.println("El resultado de la division de los 2 numeros es: " + total4);
        
        
    }
}
