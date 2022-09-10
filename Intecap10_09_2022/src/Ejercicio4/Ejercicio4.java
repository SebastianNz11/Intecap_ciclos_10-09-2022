
package Ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);
         
        int num;
        int adivinar = 2;
        boolean control = true;
          
        do {            
             System.out.println("Adivina el numero secreto, ingresa tu propuesta");
             num = en.nextInt();
             
                if (num < adivinar) {
                    System.out.println("Casi aciertas, es un numero menor al que ingresaste");
                }
                
                else if(num > adivinar){
                    System.out.println("Casi aciertas, es un numero mayor al que ingresaste");
                }
                
                else{
                    System.out.println("Adivinaste el numero, felicidades!       :) ");
                    control = false;
                }
        } while (control);   
    }
}
