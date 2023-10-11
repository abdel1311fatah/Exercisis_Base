
package exercisi28;

import java.util.Scanner;

public class Exercisi28 {

    public static void main(String[] args) {
        Scanner lector = new Scanner (System.in);
        double pes = 0, preu = 0, total_fruita = 0, descompte = 0, factura = 0;
        do{
            System.out.println("Escriu el pes: ");
            pes = lector.nextInt();
            if (pes!=0){
                System.out.println("Escriu el preu: ");
                preu = lector.nextInt();
            }
            total_fruita += pes;
            factura += preu;
        }while(pes!=0);
        if((total_fruita>=2.01)&&(total_fruita<=5)){
            descompte = total_fruita*(10/100);
            factura -= descompte;
        }
        if((total_fruita>=5.01)&&(total_fruita<=10)){
            descompte = total_fruita*(15/100);
            factura -= descompte;
        }
        if(total_fruita<=10.01){
            descompte = total_fruita*(20/100);
            factura -= descompte;
        }
        System.out.println("El pes total es: "+total_fruita);
        System.out.println("El preu total es: "+factura);
    }
}
