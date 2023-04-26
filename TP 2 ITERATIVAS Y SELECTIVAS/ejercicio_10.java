    import java.io.BufferedReader;
    import java.io.InputStreamReader;

    public class ejercicio_10 {
        public static void main(String[]args){
            int ingresado = 100;
            int contador = 0;
            boolean corta= true;

            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            try{
                while(corta == true){
                System.out.println("Ingrese un numero entero del 0 al 10:");
                ingresado = Integer.valueOf(entrada.readLine());
                if(ingresado > 0 && ingresado <= 10){
                    contador= contador+ ingresado;
                }
                else{
                    corta = false;
                    System.out.println("La suma de todos los numero ingresados es:" + contador); 
                    }                  
                }
            }
            catch(Exception exc){
                System.out.println(exc);
            }
        }
    }
