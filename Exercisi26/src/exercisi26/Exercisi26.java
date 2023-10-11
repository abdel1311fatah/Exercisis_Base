
package exercisi26;

import java.util.Scanner;


public class Exercisi26 {

    public static void main(String[] args) {
        Scanner lector = new Scanner (System.in);
        long n1 = 0, n2 = 0, r = 1;
        System.out.println("Escriu el primer numero: ");
        n1 = lector.nextInt();
        System.out.println("Escriu el segon numero: ");
        n2 = lector.nextInt();
        for (int c1 = 1;c1<=n2;c1++){
            r = r * n1;
        }
        System.out.println("El resultat es: "+r);
    }
}
