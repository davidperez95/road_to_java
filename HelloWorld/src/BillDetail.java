import java.util.Scanner;

public class BillDetail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String billName;
        double firstProduct;
        double secondProduct;
        double total;
        double taxes;
        double totalWithTaxes;

        try {
            System.out.println("Please insert the name of the bill:");
            billName = scanner.nextLine();
            System.out.println("Please insert the value of the first product:");
            firstProduct = scanner.nextDouble();
            System.out.println("Please insert the value of the second product:");
            secondProduct = scanner.nextDouble();
            total = firstProduct + secondProduct;
            taxes = (total * 19) / 100;
            totalWithTaxes = total + taxes;
            System.out.println("The bill: " + billName + " has a total of: " + total + " before taxes and " + totalWithTaxes + " After taxes");
        } catch (Exception e) {
            System.out.println("There was an error, please try again");
            main(args);
            System.exit(0);
        }
    }
}
