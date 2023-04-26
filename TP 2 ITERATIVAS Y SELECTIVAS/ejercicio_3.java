import java.io.BufferedReader;
import java.io.InputStreamReader;

// Escribir un programa que solicite el ingreso de un número mayor a
//50, y lo muestre por pantalla en caso de ser múltiplo de 2 o 3.

public class ejercicio_3 {
    public static void main (String [] args){
        int num = 0;

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try{

            System.out.println("Ingrese un numero mayor a 50");
            num = Integer.valueOf(entrada.readLine());

            if(num > 50){
                if(num % 2 == 0){
                    System.out.println("El numero es:" + num + "y es multiplo de 2");
                }
                else if(num % 3 == 0){
                    System.out.println("El numero es:" + num + " y es multiplo de 3");
                }
                else{
                    System.out.println("No es ni multiplo de 2 ni de 3");
                }
            }
        }
        catch(Exception exc){
            System.out.println(exc);
        }
    }
}
