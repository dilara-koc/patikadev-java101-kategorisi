import java.util.Scanner;
public class ATM {
    public static void main(String[] args) {

        //Get user information for log in
        String userName, password;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter username: ");
        userName = input.nextLine();

        System.out.print("Please enter password: ");
        password = input.nextLine();

        System.out.println("Sign up completed. Welcome!");

        //Check user information. If wrong for 3 times block account
        String userName1, password1;
        int right = 3;
        while (right > 0){
            right--;
            System.out.print("Please enter username: ");
            userName1 = input.nextLine();

            System.out.print("Please enter password: ");
            password1 = input.nextLine();

            if (userName1.equals(userName) && (password1.equals(password))){
                System.out.println("Login successful");

                //List ATM actions and let the user make selection
                int select, balance = 1500;

                do {
                    System.out.println("""
                            Select the action:
                            1- Deposit money
                            2- Withdraw money
                            3- Bank account balance
                            4- Log out""");
                    select = input.nextInt();

                    switch (select) {
                        case 1:
                            System.out.print("Enter the amount of deposit: ");
                            int price = input.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.print("Enter the amount of withdrawal: ");
                            int price1 = input.nextInt();
                            if (price1 <= balance){
                                balance -= price1;
                            } else {
                                System.out.println("Insufficient balance");
                            }
                            break;
                        case 3:
                            System.out.println("Your balance: " +balance);
                            break;
                    }
                } while (select != 4);
                System.out.println("Your transaction was successfully completed. See you again!");

                break;

            } else {
                if (right == 0) {
                    System.out.println("You entered your password wrong for 3 times. Your account is blocked.");
                } else {
                    System.out.println("Username or password wrong. Please try again. You can try " +right +" more times.");
                }
            }
        }
    }
}
