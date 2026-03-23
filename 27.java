import java.io.*;
import java.util.*;

public class CopyFile {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter source file name: ");
        String src = sc.nextLine();

        System.out.print("Enter destination file name: ");
        String dest = sc.nextLine();

        FileInputStream fin = new FileInputStream(src);
        FileOutputStream fout = new FileOutputStream(dest);

        int ch;

        while((ch = fin.read()) != -1) {
            fout.write(ch);
        }

        fin.close();
        fout.close();

        System.out.println("File copied successfully!");
    }
}
