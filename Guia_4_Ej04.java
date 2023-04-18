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
public class Guia_4_Ej04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Crea una aplicación que nos pida un número por teclado 
                //y con una función se lo pasamos por parámetro para que nos indique si es o no un número primo, 
                //debe devolver true si es primo, sino false.
                
                Scanner leer = new Scanner(System.in);
                System.out.println("Ingrese un numero: ");
                int num = leer.nextInt();
            if(num==1 || num==0){
                System.out.println("Deja de joder");
            }else{
                 if(conversorDePrimos(num) == true){
                     System.out.println("Tu numero es primo");
                 
            }else{
                     System.out.println("Tu numero NO es primo");
                 }
                
               
                
            } 
    }
public static boolean conversorDePrimos(int num){ 
for (int i=2 ; i<num ; i++) {
if(num%i==0)
return false;
}
return true;
}

}