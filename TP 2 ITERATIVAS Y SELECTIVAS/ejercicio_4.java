import java.io.BufferedReader;
import java.io.InputStreamReader;

// 4. Escribir un programa donde el usuario ingrese un número entre 0
// y 999, y muestre un mensaje de cuántos dígitos tiene. Además, si
// tiene 3 dígitos debe informar qué número es.


public class ejercicio_4 {
    public static void main (String [] args){
        int num = 0;

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        try{

            System.out.println("Ingrese un numero entre el 0 y 999");
            num = Integer.valueOf(entrada.readLine());

            if(num > 0 && num < 999){
                if(num >= 100){
                    System.out.println("El numero tiene 3 cifras y es:" + num);
                }
                else if(num < 100){
                    System.out.println("El numero tiene 2 cifras");
                }
                else if(num < 10){
                    System.out.println("El numero tine 1 cifra");
                }
            }
            else{
                System.out.println("El numero ingresado no es correcto");
            }
        }
        catch(Exception exc){
            System.out.println(exc);
        }
    }
}
