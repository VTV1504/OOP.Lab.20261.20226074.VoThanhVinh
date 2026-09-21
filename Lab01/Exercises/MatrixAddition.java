import java.util.Scanner;

public class MatrixAddition {
    private static double[][] readMatrix(Scanner scanner, int rows, int columns, String name) {
        double[][] matrix = new double[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(name + "[" + i + "][" + j + "] = ");
                matrix[i][j] = scanner.nextDouble();
            }
        }
        return matrix;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Rows: ");
        int rows = scanner.nextInt();
        System.out.print("Columns: ");
        int columns = scanner.nextInt();
        if (rows <= 0 || columns <= 0) {
            System.out.println("Matrix dimensions must be positive.");
            scanner.close();
            return;
        }

        double[][] first = readMatrix(scanner, rows, columns, "A");
        double[][] second = readMatrix(scanner, rows, columns, "B");

        System.out.println("A + B =");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.printf("%8.2f", first[i][j] + second[i][j]);
            }
            System.out.println();
        }
        scanner.close();
    }
}
