package exercisi18;

public class Exercisi18 {

    public static void main(String[] args) {
        int n1 = 0,r1 = 0, resultat = 0;
        for (int c1 =1;c1<=100;c1++){
            r1 = (c1 % 2);
            if (r1!=0){
                n1 = (n1+c1);
                resultat = (resultat+n1);
            }
        }
        System.out.println("El resultat es "+resultat);
    }
    
}
