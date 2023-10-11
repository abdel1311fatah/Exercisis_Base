package exercisi16e;

public class Exercisi16e {
   
    public static void main(String[] args) {
        double n1=1, suma = 0;
        for(int c1=1;c1<=10;c1++){
            for(int c2=1;c2<=c1;c2++){
                n1 =(n1*c1);
            }
            suma += (1/n1);
        }
        
        System.out.println("El resultat es: "+suma);
    }
}
