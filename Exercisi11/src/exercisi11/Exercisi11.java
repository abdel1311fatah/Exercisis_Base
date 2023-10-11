package exercisi11;

import java.util.Scanner;

public class Exercisi11 {

   
    public static void main(String[] args) {
        Scanner lector = new Scanner (System.in);
        int n1 = 0, n2 = 0, n3 = 1, c1 = 0;
        for(c1 =0; c1<=5;c1++){
            System.out.println("Escriu un numero: ");
            n1 = lector.nextInt();
            n3 = n1 + 1;
            if (n1<n3){
                n2 = n1;
            }
            n3 = n1 -1 ;
        }
        System.out.println("El mes petit es " + n2);
    }
    
}
