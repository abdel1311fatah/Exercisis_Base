package exercisi6;

import java.util.Scanner;

public class Exercisi6{
    
    public static void main(String[] args) {
      
        Scanner lector = new Scanner (System.in);
        int nota = 0, mitjana = 0, c1 = 0, n1 = 0;
        for(c1 =0; c1<=10;c1++){
            System.out.println("Escriu una nota: ");
            nota = lector.nextInt();
            if ((nota>=0)&&(nota<=10)){
                n1 = n1 + nota;
                mitjana = n1/10;
            }
        }
        System.out.println("La mitjana es: " +mitjana);
    }
    
}
