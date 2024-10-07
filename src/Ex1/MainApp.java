package Ex1;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner lungime = new Scanner(System.in);
        System.out.println("lungime = ");
        int a = lungime.nextInt();
        Scanner latime = new Scanner(System.in);
        System.out.println("latime = ");
        int b = latime.nextInt();
        while(a<b)
        {
            System.out.println("introduceti lungimea din nou = ");
            a = lungime.nextInt();
            System.out.println("introduceti latimea din nou = ");
            b = latime.nextInt();
        }
        int arie = a*b;
        int perimetru = (a*2) + (b*2);

        System.out.println("Aria dreptunghiului este: " + arie);
        System.out.println("Perimetru este: " + perimetru);
        lungime.close();
        latime.close();
    }
}