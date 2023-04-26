import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio_9 {
    public static void main (String [] args){
        char caracter = 'a';
        boolean existe = true;

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try{
            while(existe == true){
                System.out.println("Ingrese un caracter");
                caracter = entrada.readLine().charAt(0);
                if(caracter == '0'||caracter == '1' || caracter == '2' || caracter == '3' || caracter == '4' || caracter == '5' || caracter == '6'
                || caracter == '7' || caracter == '8' || caracter == '9'){
                    System.out.println("Se trata de un caracter numero");
                }
                else if(caracter >= 'a' && caracter <= 'z'){      
                    if(caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u'){

                        System.out.println("Se trata de una vocal minuscula");
                    }
                    else{
                        System.out.println("Se trata de una consonante minuscula");
                    }
                }
                else if(caracter >= 'A' && caracter <= 'Z'){
                    System.out.println("Se trata de una mayusucula");
                    existe = false;
                }
            }
        }
        catch(Exception exc){
            System.out.println(exc);
        
        }
    }
}