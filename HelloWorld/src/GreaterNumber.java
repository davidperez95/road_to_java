import java.util.InputMismatchException;
import java.util.Scanner;

public class GreaterNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOne;
        int numberTwo;

        try {
            System.out.println("Insert one number: ");
            numberOne = scanner.nextInt();
            System.out.println("Insert the next number: ");
            numberTwo = scanner.nextInt();

            //Using ternary operator
            System.out.println("The greater number is: " + (numberOne > numberTwo ? numberOne : numberTwo));
            //Using Math.max
            System.out.println("The greater number is: " + (Math.max(numberOne, numberTwo)));
        } catch (Exception e) {
            if (e instanceof InputMismatchException)
                System.err.println("The number must be an integer");
            main(args);
            System.exit(0);
        }
    }
}
