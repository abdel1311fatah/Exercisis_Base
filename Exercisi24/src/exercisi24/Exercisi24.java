
package exercisi24;

import java.util.Scanner;

public class Exercisi24 {

    public static void main(String[] args) {
        Scanner lector = new Scanner (System.in);
        int diners = 0, billet500 = 500, billet200 = 200, billet100 = 100, billet50 = 50, billet20 = 20, billet10 = 10, billet5 = 5, moneda2 = 2, moneda1 = 1;
        System.out.println("Escriu els diners totals: ");
        diners = lector.nextInt();
        do {
            diners -= billet500;
        }while(diners>=500);
        do {
            diners -= billet500;
        }while(diners<=200);
    }
}
