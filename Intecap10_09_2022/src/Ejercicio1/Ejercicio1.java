package Ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);

        int num;
        boolean bandera = true;
        while ( bandera !=false) {            
            System.out.println("Ingrese un numero:  --- para parar ingrese un negativo");
            num = en.nextInt();
            if (num >= 0) {
                double cuadrado = Math.pow(num, 2);
                System.out.println("El cuadrado es: "+cuadrado);
                bandera = true;
            }
            
            else{
                System.out.println("Ingreso un negativo");
                bandera = false;
            }
        }
    }
}
