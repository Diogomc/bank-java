import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String clientName = "Rodrigo";
        double accountValue = 2500.00;
        String accountType = "Checking Account";

        //Client information
        System.out.println("******************************");
        System.out.println("Operations: ");
        System.out.println("Name: " + clientName);
        System.out.println("Value: " + accountValue);
        System.out.println("Account Type: " + accountType);
        System.out.println("******************************");

        String operation = """
                1- Account value
                2- Transfer
                3- Receive
                4- Exit
                """;

        Scanner reading = new Scanner(System.in);
        int option = 0;


        while (option != 4) {
            System.out.println(operation);
            option = reading.nextInt();

            if (option == 1) {
                System.out.println("You have: $" + accountValue);
            } else {
                double calc;
                if (option == 2) {
                    System.out.println("How much money do you want to transfer?");
                    calc = reading.nextDouble();
                    if (calc > accountValue) {
                        System.out.println("Money enough");
                    } else {
                        accountValue -= calc;
                        System.out.println("Do you have: " + accountValue);
                    }
                } else if (option == 3) {
                    System.out.println("How much money do you will receive?");
                    calc = reading.nextDouble();
                    accountValue += calc;
                    System.out.println("Do you have: " + accountValue);
                } else if (option == 4) {
                    System.out.println("Thanks for using our app");
                } else if (option != 4) {
                    System.out.println("Choose a correct option");
                }
            }

        }
    }
}