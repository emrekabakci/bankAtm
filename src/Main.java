import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password;
        Scanner inp = new Scanner(System.in);
        int balance = 1500, price;
        int select;
        System.out.print("Username : ");
        userName = inp.nextLine();
        System.out.print("Password : ");
        password = inp.nextLine();
        if (userName.equals("emre") && password.equals("emre123")) {
            System.out.print("Welcome to X Bank!");
            do {
                System.out.println("Please choose the banking process you want to do");
                System.out.println("1-Deposit\n" +
                        "2-Withdraw\n" +
                        "3-Balance Inquiry\n" +
                        "4-Exit");
                select = inp.nextInt();
                switch (select) {
                    case 1:
                        System.out.print("Amount to be deposited : ");
                        price = inp.nextInt();
                        balance += price;
                        System.out.println("Your balance : " + balance);
                        break;
                    case 2:
                        System.out.println("Amount to be withdrawn : ");
                        price = inp.nextInt();
                        if (price > balance) {
                            System.out.print("Insufficient balance!");
                        } else {
                            balance -= price;
                            System.out.println("Your balance : " + balance);
                        }
                        break;
                    case 3:
                        System.out.print("Your balance : " + balance);
                        break;
                    case 4:
                        System.out.print("Checking Out...");
                }
            }while (select != 4);
        }
    }
}
