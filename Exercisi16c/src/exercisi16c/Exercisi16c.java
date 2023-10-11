package exercisi16c;

public class Exercisi16c {
    
    public static void main(String[] args) {
        double n1 =0;
        for (double c1 =2;c1<=512;c1=c1+2){   
            n1 = n1 +(1/c1); 
        }
        System.out.println("El resultat es "+n1);
    }
}
