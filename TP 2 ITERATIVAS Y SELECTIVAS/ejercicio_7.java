/*Escribir un programa que mientras el usuario ingresa un caracter
distinto del carácter ‘*’, muestre por pantalla si es carácter dígito, o
si es carácter vocal minúscula.*/

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class ejercicio_7 {
    public static void main (String[] args){
        char caracter = 'a';

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.println("Ingrese un caracter:");
            caracter = entrada.readLine().charAt(0);
            while(caracter != '*'){
                if(caracter == '0'||caracter == '1' || caracter == '2' || caracter == '3' || caracter == '4' || caracter == '5' || caracter == '6'
                || caracter == '7' || caracter == '8' || caracter == '9'){
                    System.out.println("Se trata de un caracter numero");
                }
                else if(caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u'){
                    System.out.println("Se trata de una vocal minuscula");
                }
                else{
                    System.out.println("No se trata ni de un caraceter vocal minuscula ni de un numero.");
                }
                System.out.println("Ingrese un caracter:");
                caracter = entrada.readLine().charAt(0);
            }
        }
        catch(Exception exc){
            System.out.println(exc);
        }
    }
}
