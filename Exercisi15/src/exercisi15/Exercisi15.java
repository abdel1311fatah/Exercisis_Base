
package exercisi15;

import java.util.Scanner;


public class Exercisi15 {

    
    public static void main(String[] args) {
        Scanner lector = new Scanner (System.in);
        int alumne = 0, nota = 0, insuficients = 0, suficients = 0, be = 0, notable = 0, excelent = 0;
        for (alumne =0;alumne<=10;alumne++){
            System.out.println("Escriu una nota: ");
            nota = lector.nextInt();
            if ((nota>=0)&&(nota<=10)){
           
                if (nota<5){
                    insuficients++;
                }
                if ((nota>=5)&&(nota<6)){
                    suficients++;
                }
                if ((nota>=6)&&(nota<7)){
                    be++;
                }
                if ((nota>=7)&&(nota<9)){
                    notable++;
                }
                if ((nota>=9)&&(nota<=10)){
                    excelent++;
                }
            }else{
                System.out.println("No es una nota valida");
            }
        }
        System.out.println("Hi han: "+insuficients+" insuficients, "+suficients+ " suficients, "+be+ " be, "+notable+ " notables, "+excelent+ " excelents");
    }
    
}
