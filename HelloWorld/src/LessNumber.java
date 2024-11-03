import java.util.Scanner;

public class LessNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int amountOfNumbers;
        int currentNumber;
        int min = 0;

        try {
            System.out.println("Insert the amount of numbers");
            amountOfNumbers = scanner.nextInt();

            int[] listOfNumbers = new int[amountOfNumbers];

            System.out.println("Insert " + amountOfNumbers + " Numbers followed by enter");

            for (int i = 0; i < amountOfNumbers; i++) {
                currentNumber = scanner.nextInt();
                listOfNumbers[i] = currentNumber;
                if (i == 0)
                    min = listOfNumbers[i];

                if (listOfNumbers[i] <= min)
                    min = listOfNumbers[i];
            }

            System.out.println("The minimum number in the list is " + min);
        } catch (Exception e) {
            System.err.println(e);
            main(args);
            System.exit(0);
        }
    }
}
