package Ex5;
import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;
public class MainApp {

    static boolean PatratPerfect(int x)
    {
        int s = (int) Math.sqrt(x);
        return (s*s==x);
    }

    Random rand = new Random();
    int rand1= rand.nextInt(20);

    static boolean Fibonacci(int rand1)
    {
        return PatratPerfect(5*rand1*rand1+4) || PatratPerfect(5*rand1*rand1-4);
    }

    public static void main(String[] args) {
      Random rand = new Random();
      int rand1= rand.nextInt(20);
      int fib1 = 0;
      int fib2 = 1;
        System.out.println("Numarul este: "+rand1);
      do {
        int saveFib1 = fib1;
        fib1 = fib2;
        fib2 = saveFib1 + fib2;
      }while(fib2<rand1);

        if(fib2==rand1)
        {
            System.out.println("nr e fibonacci");
        }
        else
        {
            System.out.println("Nr nu e fibonacci");
        }

    }
}
