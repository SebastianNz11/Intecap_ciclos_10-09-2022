
package Ejercicio2;

import java.util.Scanner;


public class Ejercicio2 {
    public static void main(String[] args) {
         Scanner en = new Scanner(System.in);
         
         int num;
         boolean control = true;
          
            do {            
             System.out.println("Ingrese un numero:  --- para parar ingrese 0");
             num = en.nextInt();
             
                if (num < 0) {
                    System.out.println("Numero negativo");
                }
                
                else if(num > 0){
                    System.out.println("Numero positivo");
                }
                
                else{
                    System.out.println("Ingreso 0");
                    control = false;
                }
        } while (control);
    }
}
