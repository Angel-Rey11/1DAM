public class Fecha{
    public static void main(String args[]){
        boolean esbisiesto=false;
        int dia;
        int mes;
        int ano;
        Scanner teclado = new Scanner (System.in);

        System.out.println("Introduce una fecha: ");
        dia=teclado.nextInt();
        mes=teclado.nextInt();
        ano=teclado.nextInt();
        if (ano > 0 && mes >0 && mes<=12 && dia >=1 && dia<=31) {
            if (mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12) {
                System.out.println("Fecha Válida");
            } else if ((mes==4 || mes==6 || mes==9 || mes==11) && dia>=1 && dia<=30) {
                System.out.println("Fecha Válida");
            } else if (dia<=28) {
                System.out.println("Fecha Válida");
            } 
        } else {
                System.out.println("Fecha  No Válida");
        }
    }
}