package Ex2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class MainApp {
    public static void main(String[] args) throws IOException {
        int suma = 0, minim = 10, maxim = 0, c = 0;
        float medie;

        Scanner scanner = new Scanner(new File("D:/IntelliJ IDEA/Proiecte/Tema/src/Ex2/in.txt"));
        while (scanner.hasNextInt()) {
            int nr = scanner.nextInt();
            suma += nr;
            if (minim > nr) minim = nr;
            if (maxim < nr) maxim = nr;
            c++;
        }
        FileWriter writer = new FileWriter("D:/IntelliJ IDEA/Proiecte/Tema/src/Ex2/in.txt");
        writer.write("suma: " +suma+"\n");
        writer.write("valoarea minima:" + minim+"\n");
        writer.write("valoarea maxima:" + maxim+"\n");
        writer.close();
    }
}


