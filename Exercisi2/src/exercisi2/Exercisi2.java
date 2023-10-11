
package exercisi2;

import java.util.Scanner;


public class Exercisi2 {

    
    public static void main(String[] args) {
 
        Scanner lector = new Scanner (System.in);
        int n1 = 0;
        int r1 = 0;
        do{
            System.out.println("Escriu un numero: ");
            n1 = lector.nextInt();
            if(n1!=0){
                if (n1>0){
                    r1 = (n1 % 2);
                    if (r1 == 0){
                        System.out.println("Es positiu i parell   " + n1);
                    }else{
                          System.out.println("No es parell ");
                    }
                }
            }
        }while (n1 != 0);
    }
    
}
