import javax.swing.JOptionPane;

public class TwoNumberCalculator {
    private static final double EPS = 1e-9;

    private static Double readDouble(String prompt) {
        while (true) {
            String input = JOptionPane.showInputDialog(null, prompt);
            if (input == null) {
                return null;
            }
            try {
                return Double.parseDouble(input.trim());
            } catch (NumberFormatException exception) {
                JOptionPane.showMessageDialog(null, "Please enter a valid number.");
            }
        }
    }

    public static void main(String[] args) {
        Double first = readDouble("Enter the first number:");
        if (first == null) return;

        Double second = readDouble("Enter the second number:");
        if (second == null) return;

        StringBuilder result = new StringBuilder();
        result.append("Sum: ").append(first + second);
        result.append("\nDifference: ").append(first - second);
        result.append("\nProduct: ").append(first * second);
        if (Math.abs(second) < EPS) {
            result.append("\nQuotient: undefined because the divisor is zero");
        } else {
            result.append("\nQuotient: ").append(first / second);
        }

        JOptionPane.showMessageDialog(null, result.toString());
    }
}
