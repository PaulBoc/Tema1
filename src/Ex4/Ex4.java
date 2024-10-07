package Ex4;
import java.util.Random;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Random rand  = new Random();
        int rand_1 = rand.nextInt(30);
        int rand_2 = rand.nextInt(30);
        int i;
        int cmmdc = 1;
        System.out.println("primul numar este: " +rand_1);
        System.out.println("Al doilea numar este: "+rand_2);
        for(i=30;i>1;i--) {
            if (rand_1 % i == 0 && rand_2  % i == 0) {
                cmmdc = i;
                break;
            }
        }
        System.out.println("cmmdc este: "+cmmdc);
    }
}
