import java.util.Scanner;

public class RecogeDatos{
    public static void main(String args[]){
        int nume;
        float numf;
        String cadena;
        //teclado servirá para pedir datos por teclado
        Scanner teclado = new Scanner (System.in);

        System.out.println("Introduce un valor entero: ");
        nume=teclado.nextInt();//para recoger un entero, usamos nextInt

        System.out.println("Introduce un valor real: ");
        numf=teclado.nextFloat();

        System.out.println("Introduce un texto: ");
        cadena=teclado.nextLine();
        

        System.out.println("El numero entero es "+nume);
        System.out.println("El numero real es "+numf);
    }
}