import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name, address, number;
        int chooseTrash;
        int weightTrash, quantity, distance;
        int totalTrash, shipping, discount, finalPrice;

        System.out.println("==============================================");
        System.out.println("          WELCOME TO TRASH PICKUP             ");
        System.out.println("==============================================");
        System.out.print("Enter your name: ");
        name = sc.nextLine();
        System.out.print("Enter your address: ");
        address = sc.nextLine();
        System.out.print("Enter your phone number: ");
        number = sc.nextLine();

        System.out.println("==============================================");
        System.out.println("Pick what type of trash you have: ");
        System.out.println("==============================================");
        System.out.println("1. Bottle \t\t\t Rp. 2000");
        System.out.println("2. Paper \t\t\t Rp. 500");
        System.out.println("3. Metal \t\t\t Rp. 5000");
        System.out.print("-->");
        int choice1 = sc.nextInt();

        

    }
}
