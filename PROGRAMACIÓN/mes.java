import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class mes {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int dias;
    String mes;
    int pedir;

    System.out.print("Introduce el mes: ");
    pedir = s.nextInt();
    switch (mes) {
        case 1:
            dias=31;
            mes="Enero";
            break;
        case 2:
            dias=28;
            mes="Febrero";
            break;
        case 3:
            dias=31;
            mes="Marzo";
            break;
        case 4:
            dias=30;
            mes="Abril";
            break;
        case 5:
            dias=31;
            mes="Mayo";
            break;
        case 6:
            dias=30;
            mes="Junio";
            break;
        case 7:
            dias=31;
            mes="Julio";
            break;
        case 8:
            dias=31;
            mes="Agosto";
            break;
        case 9:
            dias=30;
            mes="Septiembre";
            break;
        case 10:
            dias=31;
            mes="Octubre";
            break;
        case 11:
            dias=30;
            mes="Noviembre";
            break;
        case 12:
            dias=31;
            mes="Diciembre";
            break;
        
     }
     System.out.print(mes + "tiene" + dias + "dias");
  }
}