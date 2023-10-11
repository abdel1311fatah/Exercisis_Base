package exercisi7;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Exercisi7 {

    
    public static void main(String[] args) {
        
        int numero = 1, c1 = 0;
        double resultat = 0;
        for(c1 =1; c1<=15;c1++){
            resultat = (c1*c1);
            System.out.println("El cuadrat de "+c1+" es "+resultat); //Cuadrat"//
            resultat = (c1*c1*c1);
            System.out.println("El cub de "+c1+" es "+resultat); //Cub//
            resultat = (double) Math.pow (c1,1.0/2.0);
            System.out.println("L' arrel cuadrada de "+c1+ " es "+resultat); //Arrel cuadrada //
            resultat = (double) Math.pow (c1, 1.0/3.0);
            System.out.println("L' arrel cubica de "+c1+ " es "+resultat); //Arrel cubica //
        }
    }    
}
