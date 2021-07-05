import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.*;
import java.util.stream.*;
import java.nio.file.Paths;
import java.io.*;

public class IOChamber  {
    public static void main(String[] args) {

        int count = 1;
        if (args.length == 0) {
            Scanner input = new Scanner(System.in);
            String f;
            String m = "";
            while (true)  {
                f = input.nextLine();
                if(f.isEmpty()){break;}
                if(count % 2 != 0){
                    m = m + f + "\n";}
                count++;
            }
            System.out.print(m);
            return;
        }
        File fileIn1 = new File(args[0]);

        try (BufferedReader bf = new BufferedReader(new FileReader(fileIn1))) {

            String readLine;
            int line = 1;

            while ((readLine = bf.readLine()) != null) {
                if (line % 2 != 0) {
                    System.out.println(readLine);
                }
                line++;
            }

        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}