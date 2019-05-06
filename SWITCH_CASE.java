package switch_case;

import java.util.Scanner;

public class SWITCH_CASE {
  
    public static void main(String[] args) {
        
        int opc;
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un numero de dia");
            opc = teclado.nextInt();
        
    switch (opc) {
      case 1:
        System.out.println("Monday");
        break;
      case 2:
        System.out.println("Tuesday");
        break;
      case 3:
        System.out.println("Wednesday");
        break;
      case 4:
        System.out.println("Thursday");
        break;
      case 5:
        System.out.println("Friday");
        break;
      case 6:
        System.out.println("Saturday");
        break;
      case 7:
        System.out.println("Sunday");
        break;
    }
  }
}

