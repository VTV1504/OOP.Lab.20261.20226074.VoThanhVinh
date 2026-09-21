import java.util.Locale;
import java.util.Scanner;

public class DaysOfMonth {
    private static int parseMonth(String raw) {
        String month = raw.trim().toLowerCase(Locale.ROOT).replace(".", "");
        String[][] names = {
                {"1", "january", "jan"}, {"2", "february", "feb"},
                {"3", "march", "mar"}, {"4", "april", "apr"},
                {"5", "may"}, {"6", "june", "jun"},
                {"7", "july", "jul"}, {"8", "august", "aug"},
                {"9", "september", "sep", "sept"}, {"10", "october", "oct"},
                {"11", "november", "nov"}, {"12", "december", "dec"}
        };
        for (int i = 0; i < names.length; i++) {
            for (String name : names[i]) {
                if (month.equals(name)) return i + 1;
            }
        }
        return -1;
    }

    private static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month;
        int year;

        while (true) {
            System.out.print("Month: ");
            month = parseMonth(scanner.nextLine());
            if (month != -1) break;
            System.out.println("Invalid month. Try again.");
        }

        while (true) {
            System.out.print("Year: ");
            String rawYear = scanner.nextLine().trim();
            if (rawYear.matches("\\d+")) {
                try {
                    year = Integer.parseInt(rawYear);
                    break;
                } catch (NumberFormatException ignored) {
                    // Number is too large for int; ask again.
                }
            }
            System.out.println("Year must be a non-negative integer written in full.");
        }

        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (month == 2 && isLeapYear(year)) days[1] = 29;
        System.out.println("Number of days: " + days[month - 1]);
        scanner.close();
    }
}
