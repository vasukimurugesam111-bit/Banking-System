import java.util.Scanner;
public class Main {
        public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BankService bank = new BankService();

        while (true) {

            Menu.showMenu();

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Account Number : ");
                    int accNo = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Account Holder Name : ");
                    String name = sc.nextLine();

                    System.out.print("Enter Initial Balance : ");
                    double balance = sc.nextDouble();

                    bank.createAccount(accNo, name, balance);
                    break;

                case 2:
                    System.out.print("Enter Deposit Amount : ");
                    bank.deposit(sc.nextDouble());
                    break;

                case 3:
                    System.out.print("Enter Withdraw Amount : ");
                    bank.withdraw(sc.nextDouble());
                    break;

                case 4:
                    bank.checkBalance();
                    break;

                case 5:
                    bank.displayAccount();
                    break;

                case 6:
                    System.out.println("Thank You!");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice.");
            }
        }
    }
}