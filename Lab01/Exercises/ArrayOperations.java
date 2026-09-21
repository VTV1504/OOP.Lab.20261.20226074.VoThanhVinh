import java.util.Arrays;
import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Array length: ");
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("Length must be positive.");
            scanner.close();
            return;
        }

        double[] numbers = new double[n];
        double sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("numbers[" + i + "] = ");
            numbers[i] = scanner.nextDouble();
            sum += numbers[i];
        }

        Arrays.sort(numbers);
        System.out.println("Sorted array: " + Arrays.toString(numbers));
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + sum / n);
        scanner.close();
    }
}
