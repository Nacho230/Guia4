/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Guia4;

import java.util.Scanner;

/**
 *
 * @author nacho
 */
public class Guia_4_Ej03 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        //Crea una aplicación que a través de una función nos convierta una cantidad de euros introducida por teclado a otra moneda, 
//estas pueden ser a dólares, yenes o libras. La función tendrá como parámetros, 
//la cantidad de euros y la moneda a convertir que será una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio (void).
//El cambio de divisas es:
//* 0.86 libras es un 1 €
//* 1.28611 $ es un 1 €
//* 129.852 yenes es un 1 €

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de euros: ");
        double euros = leer.nextInt();
        System.out.println("Ingrese la moneda a cambiar \n"
                + "L.Libras\n"
                + "D.Dolares\n"
                + "Y.Yenes\n");

        String moneda = leer.next();
        conversor(euros,moneda);
        
    }

    public static void conversor(double euros, String moneda) {
        moneda = moneda.toUpperCase();
        switch (moneda) {
            case "L":
                  System.out.println(0.86 * euros);
                break;
            case "D":
                System.out.println(1.28611 * euros);
                break;
            case "Y":
                System.out.println(129.852 * euros);
                break;
            default:
                throw new AssertionError();
        }
    }

}