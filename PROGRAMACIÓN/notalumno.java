import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class notalumno {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int cal;

    System.out.print("Introduce la nota: ");
    cal = s.nextInt();

    if(cal>=1&&cal<=4){
        System.out.println("Suspenso");
    }else if(cal==5){
        System.out.println("Aprobado");
    }else if(cal==6){
        System.out.println("Bien");
    }else if(cal==7 || cal==8){
        System.out.println("Notable");
    }else if(cal==9){
        System.out.println("Sobresaliente");
    }else if(cal==10){
        System.out.println("Matricula");
    }else{
        System.out.println("La nota introducida es incorrecta");
    }
    }
}
    