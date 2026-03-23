import java.io.*;
import java.util.*;

public class FileDemo {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text to write into file: ");
        String text = sc.nextLine();

        FileWriter fw = new FileWriter("test.txt");
        fw.write(text);
        fw.close();

        System.out.println("Reading from file:");

        FileReader fr = new FileReader("test.txt");
        int ch;

        while((ch = fr.read()) != -1) {
            System.out.print((char)ch);
        }
        fr.close();
    }
}
