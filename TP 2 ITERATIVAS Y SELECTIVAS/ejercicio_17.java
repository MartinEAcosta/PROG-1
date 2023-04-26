/*Escribir un programa que dado un valor ingresado por el
usuario menor que 10 y mayor a 1, muestre por pantalla una
cuenta regresiva de números desde dicho valor hasta el 0
inclusive. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio_17 {
    public static void main(String[]args){
        int numero = 0;
        final int max = 10;
        final int min = 1;

        boolean corta = true;

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            while(corta){
                System.out.println("Ingrese un valor menor que 10 y mayor a 1");
                numero = Integer.valueOf(entrada.readLine());
                if(numero > min && numero < max){
                    while(numero != 0){                                                             
                        numero--;
                        System.out.println("Cuenta regresiva:" + numero);                                                                                                                          
                    }
                }
                else{
                    System.out.println("Ingresaste un numero fuera de rango");
                    corta = false;
                }
            }
        } 
        catch (Exception exc) {
            System.out.println(exc);
        }
    }
}
