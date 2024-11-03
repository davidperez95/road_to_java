import java.util.InputMismatchException;
import java.util.Scanner;

public class GasTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int capacity;

        try {
            System.out.println("Insert the current tank capacity");
            capacity = scanner.nextInt();

            if (capacity > 70 || capacity < 0) {
                throw new Exception("Capacity cannot be greater than 70lts or lesser than 0");
            }

            if (capacity == 70) {
                System.out.println("Full tank");
            } else if (capacity >= 60) {
                System.out.println("Tank almost full");
            } else if (capacity >= 40) {
                System.out.println("Tank at 3/4");
            } else if (capacity >= 35) {
                System.out.println("Half tank");
            } else if (capacity >= 20) {
                System.out.println("Enough");
            } else {
                System.out.println("insufficient");
            }
        } catch (Exception e) {
            if (e instanceof InputMismatchException)
                System.err.println("The number must be an integer");

            System.err.println(e.getMessage());
            main(args);
            System.exit(0);
        }
    }
}
