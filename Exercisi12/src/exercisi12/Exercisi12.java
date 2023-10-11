
package exercisi12;

import java.util.Scanner;

public class Exercisi12 {
    
   
    public static void main(String[] args) {
        Scanner lector = new Scanner (System.in);
        double n1 = 1, resultat = 1, c2 = 0, c1 = 0;
        System.out.println("Escriu un numero menor de 30: ");
        n1 = lector.nextInt();  
        if ((n1>0)&&(n1<=30)){
            c2 = n1;
            for(c1=1;c1<c2;c1++){
                n1 = n1*c1;
            }
        resultat = n1;
        }else{
            System.out.println("Ha de ser un numero entre 1 i 30");
        }
        System.out.println("El factorial es: "+resultat);
    }
    
}
