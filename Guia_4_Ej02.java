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
public class Guia_4_Ej02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Diseñe una función que pida el nombre y la edad de N personas e imprima 
        //los datos de las personas ingresadas por teclado e indique si son mayores o menores de edad. 
//Después de cada persona, el programa debe preguntarle al usuario si quiere seguir mostrando personas 
// y frenar cuando el usuario ingrese la palabra “No”.
Scanner leer = new Scanner(System.in);
        
        /**MaxSangre
     * @param args the command line arguments
     * Diseñe una función que pida el nombre y la edad de N personas e imprima los 
     * datos de las personas ingresadas por teclado e indique si son mayores o menores
     * de edad. Después de cada persona, el programa debe preguntarle al usuario si quiere
     * seguir mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
     */
     int n,edad;
     String nombre,opcion;
     boolean mayor;
     do{
         System.out.println("Ingrese Nombre");
         nombre = leer.next();
         System.out.println("Ingrese la edad de " + nombre + ".");
         edad = leer.nextInt();
         
         mayor = (edad >=18);
        System.out.println(nombre + " tiene " + edad + " Años y es " +  ((mayor) ? "mayor" : "menor") +  " de edad.");
        System.out.println("Desea ingresar mas personas?(si/no)");
        opcion = leer.next();
     }while (!opcion.equalsIgnoreCase("no"));
     System.out.println("Gracias Gay");
    }
                 
                
}
    
    
    

