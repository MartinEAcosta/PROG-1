import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio_19 {
    public static void main(String [] args){
        int mes = 0;
        int anio = 0;
        boolean corta = true;

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        try {
            while(corta){
                System.out.println("Ingrese un numero de mes valido");
                mes = Integer.valueOf(entrada.readLine());
                if(mes > 0 && mes <= 12){
                    if(mes == 2){
                        System.out.println("Ingrese un numero de anio entre 2000 y 2019");
                        anio = Integer.valueOf(entrada.readLine());
                        if(anio >= 2000 && anio <= 2019){
                            if(((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0)))){
                                System.out.println("Se trata de un anio bisiesto.");
                            }
                            else{
                                System.out.println("Se trata de un anio normal");
                            }
                        }
                    }
                    System.out.println("Bien, ingrese un numero mayor a 12 o 0 para salir del ciclo.");
                }
                else{
                    System.out.println("Valor de mes invalido saliendo del ciclo");
                    corta = false;
                }
            }
        } 
        catch (Exception exc) {
            System.out.println(exc);
        }
    }
}
