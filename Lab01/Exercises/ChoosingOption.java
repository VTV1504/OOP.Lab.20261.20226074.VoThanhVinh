import javax.swing.JOptionPane;

public class ChoosingOption {
    public static void main(String[] args) {
        int option = JOptionPane.showConfirmDialog(
                null,
                "Do you want to change to the first class ticket?",
                "Choose an option",
                JOptionPane.YES_NO_CANCEL_OPTION);

        switch (option) {
            case JOptionPane.YES_OPTION:
                JOptionPane.showMessageDialog(null, "You chose Yes.");
                break;
            case JOptionPane.NO_OPTION:
                JOptionPane.showMessageDialog(null, "You chose No.");
                break;
            default:
                JOptionPane.showMessageDialog(null, "You cancelled or closed the dialog.");
        }

        Object[] choices = {"I do", "I don't"};
        int custom = JOptionPane.showOptionDialog(
                null,
                "Do you agree?",
                "Custom options",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                choices,
                choices[0]);
        System.out.println("Custom option index: " + custom);
    }
}
