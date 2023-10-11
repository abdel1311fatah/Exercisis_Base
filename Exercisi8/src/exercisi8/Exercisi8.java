
package exercisi8;

import java.util.Scanner;

public class Exercisi8 {

    public static void main(String[] args) {
        Scanner lector = new Scanner (System.in);
        int n1 = 0, n2 = 0, c1 = 0, c2 = 0, resultat = 0;
        System.out.println("Escriu un numero: "); 
        n1 = lector.nextInt();
        System.out.println("Escriu un altre numero: "); 
        n2 = lector.nextInt();
        for (c1=1;c1<=n2;c1++){
               resultat = resultat+n1; 
        }
        System.out.println("El resultat es "+resultat);
    }
    
}
