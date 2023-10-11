package exercisi21;

import java.util.Scanner;

public class Exercisi21 {

    
    public static void main(String[] args) {
        Scanner lector = new Scanner (System.in);
        int n1 = 0, r1 = 0, c1 = 0, divisors = 0;
        System.out.println("Escriu un numero: ");
        n1 = lector.nextInt();
        for (c1=1;c1<=n1;c1++){
            r1 = n1 % c1;
            if(r1==0){
                divisors++;
            }
        }
        if(divisors == 2){
            System.out.println(n1+" es primer");
        }else{
            System.out.println(n1+" no es primer");
        }
        
    }
    
}
