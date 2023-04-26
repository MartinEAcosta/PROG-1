import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio_12{
    public static void main(String[] args){
        char menor = 'z';
        char mayor = 'a';
        char caracter = 'a';
        boolean corta = true;

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
    
        try{
            while(corta){
                System.out.println("Ingrese un caracter");
                caracter = entrada.readLine().charAt(0);
                if(caracter >= 'A' && caracter <= 'Z'){
                    corta = false;
                    System.out.println("El caracter mayor ingresado fue:" + mayor + "El caracter menor ingresado fue:" + menor );
                }  
                else if(caracter < menor){
                    menor = caracter;
                }
                else if(caracter > mayor){
                    mayor = caracter;
                }
      
            }
        }
        catch(Exception exc){
            System.out.println(exc);
        }
    }

}