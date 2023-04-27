import javax.swing.JOptionPane;

public class DialogBox {
    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog(null, "Enter your name");
        JOptionPane.showMessageDialog(null, "Hi " + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter yout age"));
        JOptionPane.showMessageDialog(null, "Your age is " + age);
    }
}
