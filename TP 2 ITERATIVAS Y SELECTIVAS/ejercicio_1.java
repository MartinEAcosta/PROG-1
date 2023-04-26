import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio_1{
    public static void main (String [] args){
        int num_valor = 0;
        int num_dim = 0;
        int num_entre = 0;
        int num_uno = 0;
        int num_dos = 0;
        int num_tres = 0;

        char caracter = 'a';
        
        BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
        try{
            
            System.out.println("Ingrese un numero, ya sea positivo o negativo.");
            num_valor = Integer.valueOf(entrada.readLine());
            
            if(num_valor > 0){
                System.out.println("El valor ingresado es positivo");
            }
            else{
                System.out.println("El valor ingresado es negativo");
            }
            
            System.out.println("Ingrese un numero.");
            num_dim = Integer.valueOf(entrada.readLine());
            
            if(num_dim > 100){
                System.out.println("Grande");
            }
            else{
                System.out.println("Chico");
            }
        
            System.out.println("Ingrese un numero del 1 al 7");
            num_entre = Integer.valueOf(entrada.readLine());
            
            if(num_entre == 1){
                System.out.println("Es lunes");
            }
            else if(num_entre == 2){
                System.out.println("Es martes");
            }
            else if(num_entre == 3){
                System.out.println("Es miercoles");
            }
            else if(num_entre == 4){
                System.out.println("Es jueves");
            }
            else if(num_entre == 5){
                System.out.println("Es viernes");
            }
            else if(num_entre == 6){
                System.out.println("Es sabado");
            }
            else if(num_entre == 7){
                System.out.println("Es domingo");
            }
            else{
                System.out.println("Ingrese un numero del 1 al 7");
                num_entre = Integer.valueOf(entrada.readLine());
            }
            
            System.out.println("Ingrese un caracter letra.");
            caracter = entrada.readLine().charAt(0);
            
            if(caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' ||caracter == 'u'
                || caracter == 'A' || caracter == 'E' || caracter == 'I' || caracter == 'O' || caracter == 'U'){
                    System.out.println("Es una vocal");
            }
            else{
                System.out.println("Es una consonante");
            }

            System.out.println("Ingrese numeros de forma creciente o decreciente");
            num_uno = Integer.valueOf(entrada.readLine());
            System.out.println("Ingrese numeros de forma creciente o decreciente");
            num_dos = Integer.valueOf(entrada.readLine());
            System.out.println("Ingrese numeros de forma creciente o decreciente");
            num_tres = Integer.valueOf(entrada.readLine());

            if(num_uno > num_dos && num_dos > num_tres){
                System.out.println("Decreciente");
            }
            else if(num_uno < num_dos && num_dos < num_tres){
                System.out.println("Creciente");
            }
            else{
                System.out.println("Error");
            }
        }
        catch(Exception exc){
            System.out.println(exc);
        }

    }
}