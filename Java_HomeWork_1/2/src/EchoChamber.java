import java.util.Scanner;

public class EchoChamber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String f;
        String m = "";
        while (true)  {
            f = input.nextLine();
            if (f.isEmpty()){break;}
            m = m + f + "\n";
        }
        System.out.print(m);
    }
}
