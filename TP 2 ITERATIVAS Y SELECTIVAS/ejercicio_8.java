import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio_8 {
    public static void main(String [] args){
        int entero = 1;
        boolean existe = true;

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try{
            while(existe == true){
                System.out.println("Ingreses un numero entero");
                entero= Integer.valueOf(entrada.readLine());
                if(entero != 0){
                    System.out.println("El numero es " + entero);
                }
                else{
                    System.out.println("El numero es 0, saliendo del ciclo...");
                    existe = false;
                    
                }
            }
        }
        catch(Exception exc){
            System.out.println(exc);
        }
    }
}
