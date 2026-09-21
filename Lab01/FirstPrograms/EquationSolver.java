import java.util.Scanner;

public class EquationSolver {
    private static final double EPS = 1e-9;
    private static final Scanner SCANNER = new Scanner(System.in);

    private static double read(String name) {
        while (true) {
            System.out.print(name + " = ");
            if (SCANNER.hasNextDouble()) {
                return SCANNER.nextDouble();
            }
            System.out.println("Invalid number. Please try again.");
            SCANNER.next();
        }
    }

    private static boolean isZero(double value) {
        return Math.abs(value) < EPS;
    }

    private static void solveLinearEquation() {
        double a = read("a");
        double b = read("b");
        if (isZero(a)) {
            System.out.println(isZero(b) ? "Infinitely many solutions." : "No solution.");
        } else {
            System.out.println("x = " + (-b / a));
        }
    }

    private static void solveLinearSystem() {
        double a11 = read("a11");
        double a12 = read("a12");
        double b1 = read("b1");
        double a21 = read("a21");
        double a22 = read("a22");
        double b2 = read("b2");

        double d = a11 * a22 - a21 * a12;
        double d1 = b1 * a22 - b2 * a12;
        double d2 = a11 * b2 - a21 * b1;

        if (!isZero(d)) {
            System.out.println("x1 = " + d1 / d + ", x2 = " + d2 / d);
        } else if (isZero(d1) && isZero(d2)) {
            System.out.println("Infinitely many solutions.");
        } else {
            System.out.println("No solution.");
        }
    }

    private static void solveQuadraticEquation() {
        double a = read("a");
        double b = read("b");
        double c = read("c");

        if (isZero(a)) {
            if (isZero(b)) {
                System.out.println(isZero(c) ? "Infinitely many solutions." : "No solution.");
            } else {
                System.out.println("Linear equation: x = " + (-c / b));
            }
            return;
        }

        double delta = b * b - 4 * a * c;
        if (delta > EPS) {
            double sqrtDelta = Math.sqrt(delta);
            System.out.println("x1 = " + (-b + sqrtDelta) / (2 * a));
            System.out.println("x2 = " + (-b - sqrtDelta) / (2 * a));
        } else if (isZero(delta)) {
            System.out.println("Double root x = " + (-b / (2 * a)));
        } else {
            System.out.println("No real root.");
        }
    }

    public static void main(String[] args) {
        System.out.println("1. Linear equation ax + b = 0");
        System.out.println("2. Linear system with two variables");
        System.out.println("3. Quadratic equation ax^2 + bx + c = 0");
        System.out.print("Choose 1-3: ");
        int choice = SCANNER.nextInt();
        switch (choice) {
            case 1: solveLinearEquation(); break;
            case 2: solveLinearSystem(); break;
            case 3: solveQuadraticEquation(); break;
            default: System.out.println("Invalid choice.");
        }
    }
}
