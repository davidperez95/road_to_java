import java.util.Scanner;

public class ScannerInput {
    public static void main(String[] args) {
        int number = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input a number");
        // String numberString = scanner.nextLine();
        try {
            // number = Integer.parseInt(numberString);
            number = scanner.nextInt();
            System.out.println("The number you typed was: " + number);
        } catch (Exception e) {
            System.out.println("Error");
            main(args);
            System.exit(0);
        }
    }
}
