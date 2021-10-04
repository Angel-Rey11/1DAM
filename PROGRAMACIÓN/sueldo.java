import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class sueldo {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int anti;
    float sueldo;
    double sueldoD;
    double sueldoF;

    System.out.print("Introduce tu sueldo: ");
    sueldo=s.nextFloat();
    System.out.print("Introduce tu antiguedad: ");
    anti=s.nextInt();

    if(sueldo<1000 && anti>=10){
        sueldoD=sueldo*0.2;
        sueldoF=sueldo+sueldoD;
        System.out.println("Tu sueldo inicial es " + sueldo + " tienes un aumento del 20% " + " tu sueldo final es " + sueldoF);
    } else if (sueldo<1000 && anti<10){
        sueldoD=sueldo*0.05;
        sueldoF=sueldo+sueldoD;
        System.out.println("Tu sueldo inicial es " + sueldo + " tienes un aumento del 5% " + " tu sueldo final es " + sueldoF);
    }
    else if (sueldo>1000) {
        System.out.println("Tu sueldo se mantiene sin cambios");
    }
    else {
        System.out.println("Los datos introducidos no son correctos");
    }
  }
}
