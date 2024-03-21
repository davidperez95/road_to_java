import java.util.Scanner;

public class NameHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstPersonName;
        String secondPersonName;
        String thirdPersonName;
        StringBuilder finalName = new StringBuilder();

        try {
            System.out.println("Insert first person first name:");
            firstPersonName = scanner.nextLine();
            System.out.println("Insert second person first name:");
            secondPersonName = scanner.nextLine();
            System.out.println("Insert third person first name:");
            thirdPersonName = scanner.nextLine();

            String[] listOfNames = new String[]{firstPersonName, secondPersonName, thirdPersonName};

            for (String name : listOfNames) {
                if (name.length() <= 2) {
                    throw new Exception("The length of the name: " + name + " must be greater than 2");
                }

                //Ways to find the last two characters validating the length
                //String substring = str.length() > 2 ? str.substring(str.length() - 2) : str;
                //String substring = str.substring(Math.max(str.length() - 2, 0));

                String lastTwoCharacters = name.substring(name.length() - 2);
                Character secondLetter = name.toUpperCase().charAt(1);
                finalName.append(secondLetter).append('.').append(lastTwoCharacters);
                if (!name.equals(listOfNames[2])) {
                    finalName.append('_');
                }
            }
            System.out.println(finalName);
        } catch(Exception e){
            System.err.println(e.getMessage());
            main(args);
            System.exit(0);
        }
    }
}
