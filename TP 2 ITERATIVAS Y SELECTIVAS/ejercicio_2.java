import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio_2 {
    public static void main (String [] args){
        int mes = 0;
        int anio = 0;

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        try{
            System.out.println("Ingrese un numero que representara un mes.");
            mes = Integer.valueOf(entrada.readLine());

            if(mes >= 1 && mes <= 12){
                if(mes == 2){
                    System.out.println("El mes es febrero.");
                    System.out.println("Ingrese un numero que representara un anio.");
                    anio = Integer.valueOf(entrada.readLine());
                    
                    if((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))){
                        System.out.println("Se trata de un anio bisiesto y tiene 29 dias");
                    }
                    else{
                        System.out.println("tiene 28 dias");
                    }
                }
                else if( mes == 4 || mes == 6 || mes == 9 || mes == 11){
                    System.out.println("El mes tiene 30 dias");
                }
                else{
                    System.out.println("El mes tiene 31 dias");
                }
            }
            else{
                System.out.println("El numero ingresado tiene que ser mayo igual a 1 y  menor o igual 12");
            }
        }       
        catch(Exception exc){
            System.out.println(exc);
        }
    }
}
