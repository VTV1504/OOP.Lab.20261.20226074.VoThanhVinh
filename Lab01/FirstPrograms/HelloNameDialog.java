import javax.swing.JOptionPane;

public class HelloNameDialog {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog(null, "Please enter your name:");
        if (name == null) {
            JOptionPane.showMessageDialog(null, "Input was cancelled.");
        } else {
            JOptionPane.showMessageDialog(null, "Hi " + name.trim() + "!");
        }
        System.exit(0);
    }
}
