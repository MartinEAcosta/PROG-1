import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio_6 {
    public static void main (String [] args){
        final int max = 100;
        final int min = 1;
        int num = 2;
        
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try{
            while(num > min && num < max){
            System.out.println("Ingrese un valor.");
            num = Integer.valueOf(entrada.readLine());
            
            if(num%2 == 0 || num%3==0){
            System.out.println("El numero es multiplo de 2:" + (num%2 == 0));
            System.out.println("El numero es multimplo de 3:" + (num%3 == 0));
            }
        }
        }
        catch(Exception exc){
            System.out.println(exc);
        }
    }
}
