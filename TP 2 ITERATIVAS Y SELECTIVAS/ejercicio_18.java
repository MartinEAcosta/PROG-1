/*Escribir un programa que mientras que el usuario ingrese un
número distinto de 0, pida ingresar otros dos números e imprima
el resultado de la división entre los dos últimos números
ingresados. ¿Existe alguna restricción para la división? */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio_18 {
    public static void main (String [] args){
        int numero = 0;
        int numero2 = 0;
        

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Ingrese un numero distinto de 0");
            numero = Integer.valueOf(entrada.readLine());
            if(numero != 0){
                System.out.println("Ingrese un numero:");
                numero = Integer.valueOf(entrada.readLine());
                System.out.println("Ingrese otro numero:");
                numero2= Integer.valueOf(entrada.readLine());
                System.out.println("El resultado de la division es:" + (numero/numero2));
            }
            else{
                System.out.println("El numero es 0, saliendo de el ciclo.");
            }
        } 
        catch (Exception exc) {
            System.out.println(exc);
        }
    }
}
