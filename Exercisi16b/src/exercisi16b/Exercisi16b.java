
package exercisi16b;

public class Exercisi16b {
    
    public static void main(String[] args) {
        double n1 = 0,resultat = 0, c1 = 2;
        for (c1 =2;c1<=100;c1=c1+2){
            n1 = n1 +(1/c1); 
            resultat = n1;   
        }
        System.out.println("El resultat es "+resultat);
    }
    
}
