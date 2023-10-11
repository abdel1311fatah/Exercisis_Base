
package exercisi14;

public class Exercisi14 {

  
    public static void main(String[] args) {
        int n1 = 0, r1 = 0, n3 = 0, c1 = 0;
        for(c1 =0; c1<50;c1++){
            r1 = (c1 % 3);
            if (r1!=0){
                System.out.println(c1+" no es multiple de 3");
            }
        }
    }
    
}
