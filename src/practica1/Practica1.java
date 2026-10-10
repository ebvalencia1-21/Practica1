/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica1;

import java.util.Scanner;

/**
 *
 * @author PILARHUILCA
 */
public class Practica1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int edad;
        System.out.println("Ingrese su edad: ");
        edad=sc.nextInt();
        if (edad <=0) {
            System.out.println("Edad invalida");
        } else if (edad >=105) {
            System.out.println("Excede la edad");
        }else if (edad >=65) {
            System.out.println("Tercera edad");
        }else if (edad >=18) {
            System.out.println("Mayor de edad");
        }else {
            System.out.println("Menor de edad");
        }
        
    }
    
}
