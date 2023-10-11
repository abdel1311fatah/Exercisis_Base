
package exercisi13;

import java.util.Scanner;
import static java.lang.Math.pow;

public class Exercisi13 {

    
    public static void main(String[] args) {
        Scanner lector = new Scanner (System.in);
        double n1 = 1, s = 1, c1 = 1;
        System.out.println("Escriu un numero: ");
        n1 = lector.nextInt();
        while(s<=n1){
            c1++;
            s = Math.pow (c1,2);
        }
        System.out.println("El numero que hem entat es "+n1+" ,la suma es "+s+ " i l' ultim numero elevat al cuadrat es "+c1);
    }
    
}
