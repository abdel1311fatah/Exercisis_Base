package exercisi22;

public class Exercisi22 {

    
    public static void main(String[] args) {
        int c2 = 0, r1 = 0, c1 = 0, divisors = 0;
        for(c2=1;c2<=344;c2++){
            for (c1=1;c1<=c2;c1++){
                r1 = c2 % c1;
                if(r1==0){
                    divisors++;
                }
            }
            r1 = 0;
            if(divisors == 2){
                System.out.println(c2+" es primer");
            }else{
                System.out.println(c2+" no es primer");
            }
            divisors = 0;
        }
    } 
}
