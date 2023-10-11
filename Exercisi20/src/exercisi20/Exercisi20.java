
package exercisi20;

import java.util.Scanner;

public class Exercisi20 {

    
    public static void main(String[] args) {
        Scanner lector = new Scanner (System.in);
        int n1 = 0, r1 = 0, c1 = 0;
        System.out.println("Escriu un numero: ");
        n1 = lector.nextInt();
        for (c1=1;c1<=n1;c1++){
            r1 = n1 % c1;
            if(r1==0){
                System.out.println(c1+" es divisor de "+n1);
            }
        }
    }
}
