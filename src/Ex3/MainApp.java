package Ex3;
import java.util.Scanner;

public class MainApp
{
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.println("n = ");
        int n = scanner.nextInt();
        int i;
        int k = 1;
        for(i=2;i<=n/2;i++)
        {
            if(n%i==0)
            {
                System.out.println(i);
            }
            else
            {
                System.out.println("n e prim");
                break;
            }
        }
    }
}

