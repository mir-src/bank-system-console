import java.util.Scanner;
import java.util.ArrayList;

public class Menu {
    public static void StartApp(){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Account> accounts = new ArrayList<>();
        int idCnt = 1;
        while(true){
            System.out.println("---MENU---");
            System.out.println("1. Create Account");
            System.out.println("2. Enter Account");
            System.out.println("3. Send Money to another Account");
            System.out.println("4. Ask for Money");
            System.out.println("5. Delete Account");
            System.out.println("6. Enter another account");
            System.out.println("7. Exit App");

            String choice = IO.readln();
            switch(choice){
                case "1":
                    IO.print("Enter account name: ");
                    String nameCaseOne = IO.readln();
                    IO.println();

                    IO.print("Enter password: ");
                    String passwordCaseOne = IO.readln();
                    IO.println();

                    IO.print("Enter amount to deposit: ");
                    int amountCaseOne = scanner.nextInt();
                    scanner.next();
                    IO.println();

                    accounts.add(new Account(idCnt,amountCaseOne, passwordCaseOne, nameCaseOne));
                    idCnt++;
                    IO.println("Account created succesfully!");
                    IO.println("Account created succesfully!");
                    IO.println("Account created succesfully!");

                    IO.println("Press Enter Key to continue...");
                    IO.readln();
                    break;
                case "7":
                    return;
            }
            System.out.print("\033[H\033[2J");
            System.out.flush();
        }
    }
}
