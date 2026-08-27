public class Menu {
    public static void StartApp(){
        while(true){
            System.out.println("---MENU---");
            System.out.println("1. Create Account");
            System.out.println("2. Enter Account");
            System.out.println("3. Send Money to another Account");
            System.out.println("4. Ask for Money");
            System.out.println("5. Delete Account");
            System.out.println("6. Enter another account");

            System.out.print("\033[H\033[2J");
            System.out.flush();
        }
    }
}
