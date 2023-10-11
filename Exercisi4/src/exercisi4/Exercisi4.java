package exercisi4;

import java.util.Scanner;


public class Exercisi4 {

   
    public static void main(String[] args) {
   
        Scanner lector = new Scanner (System.in);
        int edat = 0;
        int joves = 0;
        int mitjans = 0;
        int grans = 0;
        
        do {   
            System.out.println("Escriu la edat: ");
            edat = lector.nextInt();
            if ((edat>15) && (edat<=67)){
                if (edat !=0){
                    if (edat<30){
                        joves++;
                    }
                    if ((edat>=30) && (edat<55)){
                        mitjans++;
                    }
                    if ((edat>=55) && (edat<67)){
                        grans++;
                    }
                    System.out.println("Hi han " + joves + " joves " + mitjans + " mitjans " + grans + " grans " );     
                }
            }else{
                System.out.println("Son menors o jubilats");
                edat = 0;
            }
        }while (edat !=0);
               
    }
}
    

