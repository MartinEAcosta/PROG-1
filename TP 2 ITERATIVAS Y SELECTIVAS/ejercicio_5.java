import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio_5 {
    public static void main (String [] args){
        final int almacenada = 364;

        int hora = 0;
        int temperatura = 0;
        int promedio = 0;
        int clave = 0;
        int clave2 = 0;
        char caracter = 'a';

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.println("Ingrese una hora en numero entero.");
            hora = Integer.valueOf(entrada.readLine());
            if(hora <= 24){
                if(hora >= 0 && hora <= 5){
                    System.out.println("Ingrese la temperatura.");
                    temperatura = Integer.valueOf(entrada.readLine());
                    if(temperatura < 20){
                        System.out.println("Prender la calefaccion");
                    }
                    else if(temperatura > 25){
                        System.out.println("Apagar la calefacccion");
                    }
                    else if(temperatura > 20 && temperatura < 25){
                        System.out.println("Calefaccion encendida no abrir las ventanas.");
                    }
                }
            }
            else if(hora >= 6 && hora <= 11){
                System.out.println("Ingrese un caracter letra minuscula");
                caracter = entrada.readLine().charAt(0);
                if(caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' ||caracter == 'u'){
                    if(hora == 6){
                        System.out.println("Seis contiene 2 vocales");
                    }
                    else if(hora == 7){
                        System.out.println("Siete contiene 3 vocales");
                    }
                    else if(hora == 8){
                        System.out.println("Ocho contene 2 vocales");
                    }
                    else if(hora == 9){
                        System.out.println("Nueve contiene 3 vocales");
                    }
                    else if(hora == 10){
                        System.out.println("Diez contiene 2 vocales");
                    }
                    else if(hora == 11){
                        System.out.println("Once contiene 2 vocales");
                    }
                }
                else if(caracter == 'b' || caracter == 'c' || caracter == 'd' || caracter == 'f' || caracter == 'g' || caracter == 'h' 
                || caracter == 'j' || caracter == 'k' || caracter == 'l' || caracter == 'm' || caracter == 'n' ||
                 caracter == 'p' || caracter == 'q' || caracter == 'r' || caracter == 's' || caracter == 't' ||
                  caracter == 'v' || caracter == 'w' || caracter == 'x' || caracter == 'y' || caracter == 'z'){
                    if(hora == 6){
                        System.out.println("Seis contiene 2 consonantes");
                    }
                    else if(hora == 7){
                        System.out.println("Siete contiene 2 consonantes");
                    }
                    else if(hora == 8){
                        System.out.println("Ocho contene 2 consonantes");
                    }
                    else if(hora == 9){
                        System.out.println("Nueve contiene 2 consonantes");
                    }
                    else if(hora == 10){
                        System.out.println("Diez contiene 2 consonantes");
                    }
                    else if(hora == 11){
                        System.out.println("Once contiene 2 consonantes");
                    }
                }
                else{
                    System.out.println("Se trata de un caracter mayuscula.");
                }
            }
            else if(hora >= 12 && hora <= 17 && hora % 2 == 0){
                promedio = hora / 12;
                System.out.println("El promedio entre la hora ingresada y el limite es: " + promedio);

            }
            else if(hora >= 12 && hora <= 17 && hora % 3 == 0){
                promedio = hora / 17;
                System.out.println("El promedio entre la hora ingresada y el limite es: " + promedio);
            }
            else if(hora >= 18 && hora <= 23){
                System.out.println("Ingrese la clave numerica almacenada");
                clave = Integer.valueOf(entrada.readLine());
                if(clave == almacenada){
                    System.out.println("Ingrese la segunda clave");
                    clave2 = Integer.valueOf(entrada.readLine());
                    if(clave2 > 100 && clave2 < 999){
                        int digito = clave2 /100;
                        int digitoclave = almacenada /100;
                        if(digito % digitoclave == 0){
                            System.out.println("Clave correcta");
                        }
                        else{
                            System.out.println("Clave incorrecta");
                        }
                    }
                }

            }
            else{
                System.out.println("Hora ingresada fuera del rango de las 24");
            }
        }
        catch(Exception exc){
            System.out.println(exc);
        }


    }    
}
