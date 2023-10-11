
package exercisi10;

import java.util.Scanner;

public class Exercisi10 {

   
    public static void main(String[] args) {
        Scanner lector = new Scanner (System.in);
        int n1 = 0, n2 = 0, n3 = 0, c1 = 0;
        for(c1 =0; c1<=10;c1++){
            System.out.println("Escriu un numero: ");
            n1 = lector.nextInt();
            if (n1>n3){
                n3 = n1;
            }
        }
        System.out.println("El mes gran es " + n3);
    }
    
}
