import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Primitives {
    public static void main(String[] args) {
        byte littleNumber = 127;
        System.out.println("Byte in bytes is: " + Byte.BYTES);
        System.out.println("Byte in bites is: " + Byte.SIZE);
        System.out.println("Byte in max value is: " + Byte.MAX_VALUE);
        System.out.println("Byte in min value is: " + Byte.MIN_VALUE);

        String inputNumber = showInputDialog(null, "enter a number");
        int intNumber;
        try {
            intNumber = Integer.parseInt(inputNumber);
            showMessageDialog(null, intNumber);
        } catch (Exception e) {
            showMessageDialog(null, "Error: insert a valid integer");
            main(args);
            System.exit(0);
        }
    }
}
