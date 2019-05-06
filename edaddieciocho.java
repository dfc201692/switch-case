package switch_case;


import java.util.Scanner;

public class edaddieciocho {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        int edad;

        System.out.println("Favor ingresar edad: ");
        edad = entrada.nextInt();

        if (edad >= 18) {
            System.out.println("Es mayor de edad");
        } else {

            System.out.println("Es menor de edad");
        }

    }

}
