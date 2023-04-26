/*Pedir por consola el ingreso de números enteros. Cuando se
ingrese un 0 se debe terminar el programa informando el
promedio de los números ingresados, cuál fue el mayor número y
cuál fue el menor número. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio_15 {
    public static void main (String [] args){
        int numero = 1;
        int mayor = 0;
        int menor = 100000;
        int contador = 0;
        int promedio = 0;
        int suma = 0;
        boolean corta = true;

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            while(corta){
                System.out.println("Ingrese un numero entero o 0 para salir.");
                numero = Integer.valueOf(entrada.readLine());
                if(numero != 0){
                    if(numero > mayor){
                        mayor = numero;
                    }
                    else if(numero < menor){
                        menor = numero;
                    }
                    contador++;
                    suma = suma + numero;
                }
                else{
                    corta = false;
                }
            }
            promedio = suma/contador;
            System.out.println("El promedio de los numeros ingresados es: "+ promedio);
        } 
        catch (Exception exc) {
            System.out.println(exc);
        }
    }
    
}
