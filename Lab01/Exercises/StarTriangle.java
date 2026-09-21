import java.util.Scanner;

public class StarTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.print("Enter a positive height: ");
            n = scanner.nextInt();
        } while (n <= 0);

        for (int row = 1; row <= n; row++) {
            for (int space = 0; space < n - row; space++) {
                System.out.print(" ");
            }
            for (int star = 0; star < 2 * row - 1; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
        scanner.close();
    }
}
