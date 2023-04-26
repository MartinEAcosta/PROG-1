/*Escribir un programa que mientras que el usuario ingrese un
caracter letra minúscula, pida ingresar un número entero. Si el
número ingresado está entre 1 y 5 inclusive deberá imprimir la

tabla de multiplicar de dicho número. */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio_13 {
    public static void main(String[]args){
        int numero = 0;
        char caracter = 'a';

        final int max = 10;
        
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.println("Ingrese un caracter");
            caracter = entrada.readLine().charAt(0);
            if(caracter >= 'a' && caracter <= 'z'){
                System.out.println("Ingrese un numero entero");
                numero = Integer.valueOf(entrada.readLine());
                if(numero >= 1 && numero <= 5){
                    System.out.println("Se imprimira la tabla de multiplicar de " + numero);
                    for(int i = 0; i <= max;i++){
                        System.out.println((i*numero));
                    }
                }
            }
            else{
                System.out.println("Siga intentando");
            }
        }
        catch(Exception exc){
            System.out.println(exc);
        }
    }
}
