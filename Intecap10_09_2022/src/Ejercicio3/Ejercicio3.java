
package Ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
         Scanner en = new Scanner(System.in);
         
        int num;
        boolean control = true;
          
            do {            
             System.out.println("Ingrese un numero:  --- para parar ingrese 0");
             num = en.nextInt();
             
                if (num < 0 || num > 0) {
                    System.out.println("Vuelva a ingresar un numero");
                }
                else{
                    System.out.println("Ingreso 0, el bucle termino");
                    control = false;
                }
        } while (control);
    }
}
