import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class IOChamber {
    public static void main(String[] args) throws FileNotFoundException {


        System.out.print("Введите путь: ");
        Scanner put = new Scanner(System.in);
        String path = put.nextLine();
        if (path != "") {

            File file = new File(path);

            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            scanner.close();
        }
    }
}