import org.w3c.dom.ls.LSOutput;

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
            System.out.println("2. Send Money to another Account");
            System.out.println("3. Ask for Money");
            System.out.println("4. Delete Account");
            System.out.println("5. Enter another account");
            System.out.println("6. Exit App");
            System.out.println("7. Display Accounts");

            String choice = IO.readln();
            switch(choice){
                case "1":
                    IO.println("Enter account name: ");
                    String nameCaseOne = IO.readln();

                    IO.println("Enter password: ");
                    String passwordCaseOne = IO.readln();

                    IO.println("Enter amount to deposit: ");
                    int amountCaseOne = scanner.nextInt();
                    scanner.nextLine();

                    accounts.add(new Account(idCnt,amountCaseOne, passwordCaseOne, nameCaseOne));
                    idCnt++;
                    IO.println("Account created succesfully!");
                    break;
                case "2":
                    String nameStartCaseTwo = IO.readln("Start Account Name: ");
                    String nameDestinationCaseTwo = IO.readln("Second Account Name: ");
                    int amountCaseTwo = scanner.nextInt();
                    scanner.nextLine();

                    Account itemOne = null;
                    Account itemTwo = null;
                    for (Account item : accounts){
                        if (item.getName().equals(nameStartCaseTwo)){
                            itemOne = item;
                        }
                    }
                    for (Account item : accounts){
                        if (item.getName().equals(nameDestinationCaseTwo)){
                            itemTwo = item;
                        }
                    }
                    if (itemOne != null && itemTwo != null){
                        itemOne.transfer(itemTwo, amountCaseTwo);
                        System.out.println("Transfered FROM: " + itemOne.getName() + " -" + amountCaseTwo);
                        System.out.println("Transfered TO: " + itemTwo.getName() + " +" + amountCaseTwo);
                    }
                    else{
                        System.out.println("One of the accounts doesn't exist");
                    }
                    break;
                case "6":
                    return;
                case "7":
                    System.out.println("ACCOUNTS...");
                    for (Account item : accounts){
                        System.out.println("Name: " + item.getName() + " | Money: " + item.getAmount());
                    }
                    break;
            }
            System.out.print("\033[H\033[2J");
            System.out.flush();
        }
    }
}
