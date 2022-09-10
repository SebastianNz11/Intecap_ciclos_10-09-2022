
package Ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);
         
        int num, suma = 0;
        boolean bandera = true;
        while (bandera !=false) {            
            System.out.println("Ingrese un numero:  --- para parar ingrese 0");
             num = en.nextInt();
             if (num < 0 || num > 0) {
                suma = suma +=num;
                bandera = true;
            }
             else{
                 System.out.println("Ingreso 0");
                 System.out.println("La suma de los numeros igresados  es: "+suma);
                 bandera = false;
             }
        }
    }
}
