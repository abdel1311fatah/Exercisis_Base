package exercisi16e2;

public class Exercisi16e2 {
    public static void main(String[] args) {
        double n1=1;
        double suma = 1;
        suma++;
        for(int c1=2;c1<=10;c1++){
            for(int c2=1;c2<=c1;c2++){
                n1 =(n1*c1);
            }
            suma = suma + 1/n1;
        }
        System.out.println("La suma es: "+n1);
    }
}
