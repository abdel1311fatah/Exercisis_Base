
package exercisi3;

import java.util.Scanner;

public class Exercisi3 {
 
    public static void main(String[] args) {
 
        Scanner lector = new Scanner (System.in);
        int n1 = 0;
        int r1 = 0;
        int c2 = 0;
        
        
        for(int c1 =0; c1<=10;c1++){
            System.out.println("Escriu el numero: ");
            n1 = lector.nextInt();
            r1 = (n1 % 3);
            if (r1== 0){
                c2++;
            }
        }
        System.out.println ("Hi han " + c2 + " numeros multiples de 3");  
    }
    
}
