/*11. Escribir un programa que mientras el usuario ingrese un
caracter letra minúscula, acumule la cantidad de vocales que
ingresó. Finalmente muestre por pantalla dicha cantidad. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio_11 {
    public static void main (String [] args){
        int contador = 0;
        char caracter = 'a';
        boolean corta = true;

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try{
            while(corta == true){
                System.out.println("Ingrese caracter minuscula.");
                caracter = entrada.readLine().charAt(0);
                if(caracter >= 'A' && caracter <= 'Z'){
                    corta = false;
                    System.out.println("La cantidad de vocales ingresada fueron:" + contador);
                }   
                else if(caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u'){
                    contador++;
                }
            }
        }
        catch(Exception exc){

        }
    }
}
