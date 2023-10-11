
package exercisi1;

import java.util.Scanner;


public class Exercisi1 {

    
    public static void main(String[] args) {
        Scanner lector = new Scanner (System.in);
        int n1 = 0;
        int n2 = 0;
        System.out.println("Escriu el primer numero: ");
        n1 = lector.nextInt();
        System.out.println("Escriu el segon numero: ");
        n2 = lector.nextInt();
        
        if (n1 == n2){ 
            System.out.println("Son iguals");
        }
        if (n1>n2){
            System.out.println("El primer numero es mes gran que el segon");
        }
        if (n1<n2){
            System.out.println("El primer numero es mes petit que el segon");
        }
    }   
}
 
