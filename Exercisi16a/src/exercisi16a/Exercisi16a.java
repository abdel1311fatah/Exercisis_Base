package exercisi16a;

public class Exercisi16a {

    
    public static void main(String[] args) {
        double n1 = 0, suma = 0, c1 = 2;
        for(c1=2;c1<=100;c1++){
            n1 = n1 + (1/c1);
            suma = n1;
        }
        suma++;
        System.out.println("El resultat es: "+suma);
    }

}

