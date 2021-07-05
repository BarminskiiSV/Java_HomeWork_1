public class Multiplication {
    public static void main(String[] args) {
        int f = 0;
        for (int i = 1; i < 10; i++) {
            System.out.print("\n");
            for (int j = 1; j < 10; j++) {
                f = i * j;
                System.out.print(f + " ");
            }
        }
    }
}