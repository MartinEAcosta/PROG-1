/*Pedir por consola 15 caracteres. Imprimir la mayor cantidad de
‘a’ seguidas que se ingresaron. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio_16 {
    public static void main(String[] args){
        final int max = 15;
        int contador = 0;
        char caracter = 'a';
        char anterior = 'a';
        
        
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try{
            for(int i = 0; i < max;i++){
                System.out.println("Ingrese un caracter");
                caracter = entrada.readLine().charAt(0);
                if(caracter >= 'a' && caracter <= 'z'){
                    anterior = caracter;
                    if(caracter == 'a' && anterior == caracter){
                        contador++;
                    }
                }
                else{
                    System.out.println("El caracter no es minuscula.");
                }
            }
            System.out.println("La cantidad de 'a' seguidas que se ingresaron fueron: " + contador);
        }
        catch(Exception exc){
            System.out.println(exc);
        }
}
}