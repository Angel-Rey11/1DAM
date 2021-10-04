import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class cambio {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int cal;

    System.out.print("Introduce la nota: ");
    cal = s.nextInt();

    switch (cal) {
      case 1,2,3,4:
        System.out.println("Suspenso");

        break;

      case 5:
        System.out.println("Aprobado");

        break;

      case 6:
        System.out.println("Bien");

        break;

      case 7,8:
        System.out.println("Notable");

        break;

      case 9:
        System.out.println("Sobresaliente");

        break;

      case 10:
        System.out.println("Matricula");

        break;
        default:
        System.out.println("Error, introduce una nota correcta");
    }
  }
}