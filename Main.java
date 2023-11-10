import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] role = { "Admin", "User" };

        String[] username = new String[10];
        String[] password = new String[10];

        // Username
        username[0] = "admin";
        username[1] = "kevv";
        username[2] = "seno1";
        username[3] = "adzinnn";

        // Password
        password[0] = "admin";
        password[1] = "kevv";
        password[2] = "seno1";
        password[3] = "adzinnn";

        String[][] data = new String[10][10];

        // Name
        data[0][0] = "admin";
        data[0][1] = "Kevin Bramasta";
        data[0][2] = "Baskoro Seno";
        data[0][3] = "Ahmad Adzin";

        // Address
        data[1][0] = "default";
        data[1][1] = "Sukun";
        data[1][2] = "Polehan";
        data[1][3] = "Gadang";

        // Number
        data[2][0] = "default";
        data[2][1] = "08123456789";
        data[2][2] = "08123456789";
        data[2][3] = "08123456789";

        // Member
        data[3][0] = "default";
        data[3][1] = "yes";
        data[3][2] = "yes";
        data[3][3] = "no";

        // Role
        data[4][0] = role[0];
        data[4][1] = role[1];
        data[4][2] = role[1];
        data[4][3] = role[1];

        int counterRegister = 4;

        int[] points = new int[20];
        points[0] = 0;
        points[1] = 300;
        points[2] = 350;
        points[3] = 500;

        String[] home = { "", "Donate Trash", "Voucher", "History", "Logout" };
        String[] admin = { "", "Account", "Trash List", "Logout" };
        String[] menuVoucher = { "", "Redeem", "Points", "Back" };
        String[] typeTrash = { "", "Inorganic Trash", "Organic Trash" };

        String[] inOrganicTrash = { "", "Plastic", "Metal", "Glass" };
        int[] priceInorganic = { 0, 200, 400, 600 };
        int[] valueInorganic = { 0, 150, 200, 300 };

        String[] organicTrash = { "", "Paper", "Plant", "Food Waste" };
        int[] priceOrganic = { 0, 100, 50, 20 };
        int[] valueOrganic = { 0, 50, 25, 10 };

        String[][] TrashPicker = { null, inOrganicTrash, organicTrash };
        int[][] pricePicker = { null, priceInorganic, priceOrganic };
        int[][] valuePicker = { null, valueInorganic, valueOrganic };

        String inputUsername, inputPassword;
        int chooseTrash;
        int weightTrash, quantity, distance;
        int totalTrash, shipping, discount, finalPrice;

        int choice = 0, choice1, choice2, choice3;
        int choiceAdmin;
        int noUser = 0;

        do {
            System.out.println("+------------------------------------------+");
            System.out.println("|         WELCOME TO TRASH PICKUP          |");
            System.out.println("+------------------------------------------+");
            System.out.println("1. Login");
            System.out.println("2. Register");
            System.out.println("3. Exit");
            System.out.print("--> ");
            choice = sc.nextInt();
            sc.nextLine();

            while (choice > 3) {
                System.out.print("\033[H\033[2J");
                System.out.flush();

                System.out.println("+------------------------------------------+");
                System.out.println("|         WELCOME TO TRASH PICKUP          |");
                System.out.println("+------------------------------------------+");
                System.out.println("1. Login");
                System.out.println("2. Register");
                System.out.println("3. Exit");
                System.out.print("--> ");
                choice = sc.nextInt();
                sc.nextLine();
            }

            System.out.print("\033[H\033[2J");
            System.out.flush();

            switch (choice) {
                // LOGIN
                case 1:
                    System.out.println("+------------------------+");
                    System.out.print("Enter your username: ");
                    inputUsername = sc.next();
                    System.out.print("Enter your password: ");
                    inputPassword = new String(System.console().readPassword());
                    System.out.println("+------------------------+");

                    boolean validCredentials = false;
                    for (int i = 0; i < username.length; i++) {
                        if (inputUsername.equals(username[i]) && inputPassword.equals(password[i])) {
                            validCredentials = true;
                            noUser = i;
                            break;
                        }
                    }

                    while (!validCredentials) {
                        System.out.print("\033[H\033[2J");
                        System.out.flush();

                        System.out.println("+------------------------------+");
                        System.out.println("| Invalid username or password |");
                        System.out.println("+------------------------------+");

                        // Prompt for username and password again
                        System.out.print("Enter your username: ");
                        inputUsername = sc.next();
                        System.out.print("Enter your password: ");
                        inputPassword = new String(System.console().readPassword());

                        for (int i = 0; i < username.length; i++) {
                            if (inputUsername.equals(username[i]) && inputPassword.equals(password[i])) {
                                validCredentials = true;
                                noUser = i;
                                break;
                            }
                        }

                        System.out.println("+------------------------------+");
                    }
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    break;

                // REGISTER
                case 2:
                    System.out.print("\033[H\033[2J");
                    System.out.flush();

                    System.out.println("+-----------------------------+");
                    System.out.println("|           SIGN IN           |");
                    System.out.println("+-----------------------------+");

                    System.out.print("Enter your name: ");
                    data[0][counterRegister] = sc.nextLine();
                    System.out.print("Enter your address: ");
                    data[1][counterRegister] = sc.nextLine();
                    System.out.print("Enter your phone number: ");
                    data[2][counterRegister] = sc.next();

                    System.out.println("+-----------------------------+");

                    System.out.print("\033[H\033[2J");
                    System.out.flush();

                    System.out.println("+-----------------------------+");
                    System.out.print("Enter your username: ");
                    username[counterRegister] = sc.next();
                    System.out.print("Enter your password: ");
                    password[counterRegister] = sc.next();

                    System.out.print("\033[H\033[2J");
                    System.out.flush();

                    System.out.println("Do you want to sign up for a membership ?");
                    System.out.println("You will get a discount if you sign up for a membership.");
                    System.out.print("(yes/no) : ");
                    data[3][counterRegister] = sc.next();

                    noUser = counterRegister;

                    data[4][counterRegister] = role[1];

                    counterRegister++;

                    System.out.print("\033[H\033[2J");
                    System.out.flush();

                    System.out.println("Press Enter key to continue...");

                    try {
                        System.in.read();
                    } catch (Exception e) {
                    }
                    break;

                // EXIT
                case 3:
                    return;
            }

            System.out.print("\033[H\033[2J");
            System.out.flush();

            // ADMIN MENU
            if (data[4][noUser].equals("Admin")) {
                do {
                    System.out.println("+------------------------------------------+");
                    System.out.println("Welcome, " + username[noUser]);
                    System.out.println("+------------------------------------------+");
                    System.out.println();
                    System.out.println("What do you want to do today?");
                    for (int i = 1; i < admin.length; i++) {
                        System.out.println(i + ". " + admin[i]);
                    }
                    /*
                     * 1. Account
                     * 2. Trash List
                     * 3. Logout
                     */
                    System.out.print("--> ");
                    choice1 = sc.nextInt();

                    while (!(choice1 < 5)) {
                        System.out.print("\033[H\033[2J");
                        System.out.flush();

                        System.out.println("+------------------------------------------+");
                        System.out.println("Welcome, " + username[noUser]);
                        System.out.println("+------------------------------------------+");
                        System.out.println();
                        System.out.println("What do you want to do today?");
                        for (int i = 1; i < admin.length; i++) {
                            System.out.println(i + ". " + admin[i]);
                        }
                        /*
                         * 1. Account
                         * 2. Trash List
                         * 3. Logout
                         */
                        System.out.print("--> ");
                        choice1 = sc.nextInt();
                    }

                    System.out.print("\033[H\033[2J");
                    System.out.flush();

                    switch (choice1) {
                        case 1:
                            do {

                                System.out.println(
                                        "+------------------------------------------------------------------+");
                                System.out.printf("%-10s | %-20s | %-20s | %-10s%n", "No", "Username", "Password",
                                        "Role");
                                System.out.println(
                                        "+------------------------------------------------------------------+");

                                for (int i = 0; i < counterRegister; i++) {
                                    System.out.printf("%-10s | %-20s | %-20s | %-10s%n", i, username[i], password[i],
                                            data[4][i]);
                                }
                                System.out.print("--> ");
                                choiceAdmin = sc.nextInt();

                                System.out.print("\033[H\033[2J");
                                System.out.flush();

                            } while (choiceAdmin != 0);

                        case 2:
                            break;
                        case 3:
                            break;
                    }
                } while (choice1 != 3);
            } else {

                // USER MENU
                do {
                    System.out.println("+------------------------------------------+");
                    System.out.println("Welcome, " + username[noUser] + "! \t\t" + "Point : " + points[noUser]);
                    System.out.println("+------------------------------------------+");
                    System.out.println();
                    System.out.println("What do you want to do today?");
                    for (int i = 1; i < home.length; i++) {
                        System.out.println(i + ". " + home[i]);
                    }
                    /*
                     * 1. Donate Trash
                     * 2. Voucher
                     * 3. History
                     * 4. Logout
                     */
                    System.out.print("--> ");
                    choice1 = sc.nextInt();

                    while (!(choice1 < 5)) {
                        System.out.print("\033[H\033[2J");
                        System.out.flush();

                        System.out.println("+------------------------------------------+");
                        System.out.println("Welcome, " + username[noUser] + "! \t\t" + "Point : " + points[noUser]);
                        System.out.println("+------------------------------------------+");
                        System.out.println();
                        System.out.println("Please choose which action you want to do: ");
                        for (int i = 1; i < home.length; i++) {
                            System.out.println(i + ". " + home[i]);
                        }
                        /*
                         * 1. Donate Trash
                         * 2. Voucher
                         * 3. History
                         * 4. Logout
                         */
                        System.out.print("--> ");
                        choice1 = sc.nextInt();
                    }

                    System.out.print("\033[H\033[2J");
                    System.out.flush();

                    switch (choice1) {
                        case 1:
                            System.out.println("+------------------------------------------+");
                            System.out.println("Choose which type of trash you have: ");
                            for (int i = 1; i < typeTrash.length; i++) {
                                System.out.println(i + ". " + typeTrash[i]);
                            }
                            /*
                             * 1. Inorganic
                             * 2. Organic
                             */
                            System.out.print("--> ");
                            choice2 = sc.nextInt();

                            System.out.print("\033[H\033[2J");
                            System.out.flush();

                            while (!(choice2 < 3)) {
                                System.out.println("+------------------------------------------+");
                                System.out.println("Please choose which type of trash you have corecctly: ");
                                for (int i = 1; i < typeTrash.length; i++) {
                                    System.out.println(i + ". " + typeTrash[i]);
                                }
                                /*
                                 * 1. Inorganic
                                 * 2. Organic
                                 */
                                System.out.print("--> ");
                                choice2 = sc.nextInt();

                                System.out.print("\033[H\033[2J");
                                System.out.flush();

                            }

                            System.out.println("+------------------------------------------+");
                            System.out.println("Choose which " + typeTrash[choice2] + " you have: ");

                            for (int i = 1; i < TrashPicker[choice2].length; i++) {
                                System.out.println(i + ". " + TrashPicker[choice2][i] + "\t\t\t" + "Rp. "
                                        + pricePicker[choice2][i]);
                            }
                            /*
                             * Inorganic
                             * 1. Plastic
                             * 2. Metal
                             * 3. Glass
                             * --------------------
                             * Organic
                             * 1. Paper
                             * 2. Plant
                             * 3. Food Waste
                             */
                            System.out.print("--> ");
                            chooseTrash = sc.nextInt();

                            System.out.print("\033[H\033[2J");
                            System.out.flush();

                            while ((chooseTrash < 1) || (chooseTrash > 4)) {
                                System.out.println("+------------------------------------------+");
                                System.out
                                        .println("Please choose which " + typeTrash[choice2] + " you have corecctly: ");
                                for (int i = 1; i < TrashPicker[choice2].length; i++) {
                                    System.out.println(i + ". " + TrashPicker[choice2][i] + "\t\t\t" + "Rp. "
                                            + pricePicker[choice2][i]);
                                }
                                System.out.print("--> ");
                                chooseTrash = sc.nextInt();

                                System.out.print("\033[H\033[2J");
                                System.out.flush();

                            }
                            System.out.println("+------------------------------------------+");
                            System.out.println("Value of " + TrashPicker[choice2][chooseTrash] + " is Rp. "
                                    + valuePicker[choice2][chooseTrash]);
                            System.out.println();
                            System.out.print("Enter the weight of the trash (KG): ");
                            weightTrash = sc.nextInt();
                            System.out.print("Enter the quantity of the trash: ");
                            quantity = sc.nextInt();
                            System.out.print("Enter your distances (KM): ");
                            distance = sc.nextInt();

                            totalTrash = weightTrash * pricePicker[choice2][chooseTrash];
                            shipping = distance * 1000;
                            discount = quantity * valuePicker[choice2][chooseTrash];

                            if (data[3][noUser].equals("yes")) {
                                discount += 200;
                            } else {
                                discount += 0;
                            }

                            finalPrice = (totalTrash + shipping) - discount;

                            System.out.print("\033[H\033[2J");
                            System.out.flush();

                            // BILL
                            System.out.println("+----------------------------------+");
                            System.out.println("  Name        : " + data[0][noUser]);
                            System.out.println("  Address     : " + data[1][noUser]);
                            System.out.println("  Phone       : " + data[2][noUser]);
                            System.out.println("+----------------------------------+");
                            System.out.println("  " + typeTrash[choice2] + "");
                            System.out.println("+----------------------------------+");
                            System.out.println("  " + TrashPicker[choice2][chooseTrash] + " Type ");
                            System.out.println("  Weight       : " + weightTrash + " KG");
                            System.out.println("  Quantity     : " + quantity);
                            System.out.println("  Distance     : " + distance + " KM");
                            System.out.println("+----------------------------------+");
                            System.out.println("  Price        : Rp. " + totalTrash);
                            System.out.println("  Shipping Fee : Rp. " + shipping);
                            System.out.println("  Discount     : Rp. " + discount);
                            System.out.println("+----------------------------------+");
                            System.out.println("  Total Price  : Rp. " + finalPrice);
                            System.out.println("+----------------------------------+");
                            System.out.println();

                            System.out.println("Press Enter key to continue...");

                            try {
                                System.in.read();
                            } catch (Exception e) {
                            }

                            System.out.print("\033[H\033[2J");
                            System.out.flush();
                            break;

                        case 2:
                            do {
                                System.out.println("+------------------------------------------+");
                                System.out.println("|\t\t VOUCHERS \t\t   |");
                                System.out.println("+------------------------------------------+");
                                System.out.println("Points : " + points[noUser]);
                                System.out.println("+------------------------------------------+");
                                System.out.println("What do you want to do?");
                                for (int i = 1; i < menuVoucher.length; i++) {
                                    System.out.println(i + ". " + menuVoucher[i]);
                                }
                                System.out.print("--> ");
                                choice3 = sc.nextInt();

                                System.out.print("\033[H\033[2J");
                                System.out.flush();

                                switch (choice3) {
                                    case 1:

                                        break;

                                    default:
                                        break;
                                }

                            } while (choice3 != 3);

                            System.out.print("\033[H\033[2J");
                            System.out.flush();

                            break;
                        case 3:
                            break;

                        case 4:
                            break;
                    }
                } while (choice1 != 4);
            }

        } while (choice != 3);
    }
}
