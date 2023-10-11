
package exercisi5;

import java.util.Scanner;

public class Exercisi5 {

   
    public static void main(String[] args) {
        Scanner lector = new Scanner (System.in);
        int n1 = 0, n2 = 0, r1 = 0, r2 = 0,c1 =0, suma = 0;
        System.out.println("Escriu el primer numero: ");
        n1 = lector.nextInt();
        System.out.println("Escriu el segon numero: ");
        n2 = lector.nextInt();
        if ((n1==0)||(n2==0)){
            System.out.println("Un dels 2 numeros o els 2 numeros son 0");
        }else{
            if ((n1 >0)&&(n2>0)){
                r1 = (n1 % 2);
                r2 = (n2 % 2);
                if ((r1!=0)&&(r2!=0)){
                    for(c1 =0; c1<=n1;c1++){
                        for(n2 =n2; n2<=n1;n2++){ 
                            suma = suma + (n1+n2);
                        }
                    }
                    System.out.println("El resultat de la suma es: "+suma);
                }else{
                    System.out.println("Un dels dos numeros no es imparell");
                }
            }
        }
    }
}
