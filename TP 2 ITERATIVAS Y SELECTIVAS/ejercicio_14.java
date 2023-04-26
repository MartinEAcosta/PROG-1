/*Pedir por consola el ingreso de 10 números enteros positivos.
Contar cuántas veces se ingresaron números pares y mostrarlo
por pantalla. */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio_14 {
    public static void main(String [] args){
        final int max = 10;
        int numero = 0;
        int contador = 0;

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try{
            for(int i = 0; i < max;i++){
                System.out.println("Ingrese un numero entero");
                numero = Integer.valueOf(entrada.readLine());
                if(numero % 2 == 0){
                    contador++;
                    System.out.println("Numero par");
                }
            }
            System.out.println("Cantidad de numero pares ingresados: " + contador);
        }
        catch(Exception exc){
            System.out.println(exc);
        }
    }
}
