package switch_case;

import java.util.Scanner;

public class Mayordeedad {

    static Scanner entrada = new Scanner(System.in);
    
    public static void main(String[] args) {
            
        int contadoredad = 0, edad;

        for(int c=1;c<=3; c++){
            System.out.println("Favor ingresar edad: ");
            edad = entrada.nextInt();
            
            if (edad>=18){
                contadoredad++;
            }
            System.out.println("La catidad de personas mayores de edad es: "+contadoredad);
        }


    }
    
}
