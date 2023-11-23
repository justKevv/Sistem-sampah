import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    private static final String[] ROLE = { "Admin", "User" };
    private static final String[] ACCOUNTS = { "Username", "Password" };
    private static final String[] DATA_ACCOUNTS = { "Name", "Address", "Number", "Member", "Role" };

    private static final String[] HOME = { "", "Donate Trash", "Voucher", "History", "Logout" };
    private static final String[] ADMIN = { "", "Account", "Trash List", "Logout" };
    private static final String[] MENU_VOUCHER = { "", "Redeem", "Points", "Back" };
    private static final String[] TYPE_TRASH = { "", "Inorganic Trash", "Organic Trash" };

    private static final String[] USERNAME = new String[20];
    private static final String[] PASSWORD = new String[20];

    static {
        // Username
        USERNAME[0] = "";
        USERNAME[1] = "kevv";
        USERNAME[2] = "seno1";
        USERNAME[3] = "adzinnn";
        USERNAME[4] = "ADMIN";

        // Password
        PASSWORD[0] = "";
        PASSWORD[1] = "kevv";
        PASSWORD[2] = "seno1";
        PASSWORD[3] = "adzinnn";
        PASSWORD[4] = "ADMIN";
    }

    private static final String[][] DATA = new String[10][20];

    static {
        // Name
        DATA[0][0] = "";
        DATA[0][1] = "Kevin Bramasta";
        DATA[0][2] = "Baskoro Seno";
        DATA[0][3] = "Ahmad Adzin";
        DATA[0][4] = "Admin";

        // Address
        DATA[1][0] = "default";
        DATA[1][1] = "Sukun";
        DATA[1][2] = "Polehan";
        DATA[1][3] = "Gadang";
        DATA[1][4] = "-";

        // Number
        DATA[2][0] = "default";
        DATA[2][1] = "08123456789";
        DATA[2][2] = "08123456789";
        DATA[2][3] = "08123456789";
        DATA[2][4] = "-";

        // Member
        DATA[3][0] = "default";
        DATA[3][1] = "yes";
        DATA[3][2] = "yes";
        DATA[3][3] = "no";
        DATA[3][4] = "-";

        // Role
        DATA[4][0] = ROLE[0];
        DATA[4][1] = ROLE[1];
        DATA[4][2] = ROLE[1];
        DATA[4][3] = ROLE[1];
        DATA[4][4] = ROLE[0];
    }

    private static final int[] POINTS = new int[20];

    static {
        POINTS[0] = 0;
        POINTS[1] = 300;
        POINTS[2] = 350;
        POINTS[3] = 500;
        POINTS[4] = 0;
    }

    private static int counterRegister = 5;

    public static void main(String[] args) {

        String[] inOrganicTrash = { "", "Plastic", "Metal", "Glass" };
        int[] priceInorganic = { 0, 200, 400, 600 };
        int[] valueInorganic = { 0, 150, 200, 300 };

        String[] organicTrash = { "", "Paper", "Plant", "Food Waste" };
        int[] priceOrganic = { 0, 100, 50, 20 };
        int[] valueOrganic = { 0, 50, 25, 10 };

        String[][] TrashPicker = { null, inOrganicTrash, organicTrash };
        int[][] pricePicker = { null, priceInorganic, priceOrganic };
        int[][] valuePicker = { null, valueInorganic, valueOrganic };

        String[][] accountPicker = { USERNAME, PASSWORD };

        String inputUsername, inputPassword;
        int chooseTrash;
        int weightTrash, quantity, distance;
        int totalTrash, shipping, discount, finalPrice;

        int choice, choice1, choice2, choice3;
        int choiceAdmin = 0;
        String choiceEdit;
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

            clearTerminal();

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
                    for (int i = 0; i < USERNAME.length; i++) {
                        if (inputUsername.equals(USERNAME[i]) && inputPassword.equals(PASSWORD[i])) {
                            validCredentials = true;
                            noUser = i;
                            break;
                        }
                    }

                    while (!validCredentials) {
                        System.out.print("\033[H\033[2J");
                        System.out.flush();

                        System.out.println("+------------------------------+");
                        System.out.println("| Invalid USERNAME or PASSWORD |");
                        System.out.println("+------------------------------+");

                        // Prompt for USERNAME and PASSWORD again
                        System.out.print("Enter your username: ");
                        inputUsername = sc.next();
                        System.out.print("Enter your password: ");
                        inputPassword = new String(System.console().readPassword());

                        for (int i = 0; i < USERNAME.length; i++) {
                            if (inputUsername.equals(USERNAME[i]) && inputPassword.equals(PASSWORD[i])) {
                                validCredentials = true;
                                noUser = i;
                                break;
                            }
                        }

                        System.out.println("+------------------------------+");
                    }

                    clearTerminal();

                    break;

                // REGISTER
                case 2:

                    clearTerminal();

                    System.out.println("+-----------------------------+");
                    System.out.println("|           SIGN IN           |");
                    System.out.println("+-----------------------------+");

                    System.out.print("Enter your name: ");
                    DATA[0][counterRegister] = sc.nextLine();
                    System.out.print("Enter your address: ");
                    DATA[1][counterRegister] = sc.nextLine();
                    System.out.print("Enter your phone number: ");
                    DATA[2][counterRegister] = sc.next();

                    System.out.println("+-----------------------------+");

                    clearTerminal();

                    System.out.println("+-----------------------------+");
                    System.out.print("Enter your username: ");
                    USERNAME[counterRegister] = sc.next();
                    System.out.print("Enter your password: ");
                    PASSWORD[counterRegister] = sc.next();

                    System.out.print("\033[H\033[2J");
                    System.out.flush();

                    System.out.println("Do you want to sign up for a membership ?");
                    System.out.println("You will get a discount if you sign up for a membership.");
                    System.out.print("(yes/no) : ");
                    DATA[3][counterRegister] = sc.next();

                    noUser = counterRegister;

                    DATA[4][counterRegister] = ROLE[1];

                    counterRegister++;

                    clearTerminal();

                    break;

                // EXIT
                case 3:
                    return;
            }

            clearTerminal();

            // ADMIN MENU
            if (DATA[4][noUser].equals("Admin")) {
                do {
                    System.out.println("+------------------------------------------+");
                    System.out.println("Welcome, " + USERNAME[noUser]);
                    System.out.println("+------------------------------------------+");
                    System.out.println();
                    System.out.println("What do you want to do today?");
                    for (int i = 1; i < ADMIN.length; i++) {
                        System.out.println(i + ". " + ADMIN[i]);
                    }
                    /*
                     * 1. Account
                     * 2. Trash List
                     * 3. Logout
                     */
                    System.out.print("--> ");
                    choice1 = sc.nextInt();

                    while (!(choice1 < 5)) {

                        clearTerminal();

                        System.out.println("+------------------------------------------+");
                        System.out.println("Welcome, " + USERNAME[noUser]);
                        System.out.println("+------------------------------------------+");
                        System.out.println();
                        System.out.println("What do you want to do today?");
                        for (int i = 1; i < ADMIN.length; i++) {
                            System.out.println(i + ". " + ADMIN[i]);
                        }
                        /*
                         * 1. Account
                         * 2. Trash List
                         * 3. Logout
                         */
                        System.out.print("--> ");
                        choice1 = sc.nextInt();
                    }

                    clearTerminal();

                    switch (choice1) {
                        case 1:
                            do {
                                System.out.println("Choose which account you want to access.");
                                System.out.println(
                                        "+------------------------------------------------------------------+");
                                System.out.printf("%-10s | %-20s | %-20s | %-10s%n", "No", "Username", "Password",
                                        "Role");
                                System.out.println(
                                        "+------------------------------------------------------------------+");

                                for (int i = 1; i < counterRegister; i++) {
                                    System.out.printf("%-10s | %-20s | %-20s | %-10s%n", i, USERNAME[i], PASSWORD[i],
                                            DATA[4][i]);
                                }
                                System.out.println(
                                        "+------------------------------------------------------------------+");
                                System.out.println("Use 0 to go back to main menu.");
                                System.out.print("--> ");
                                choiceAdmin = sc.nextInt();
                                sc.nextLine();

                                clearTerminal();

                                if (choiceAdmin != 0) {
                                    do {
                                        System.out
                                                .println("+---------------------------------------------------------+");
                                        for (int i = 0; i < ACCOUNTS.length; i++) {
                                            System.out.println(ACCOUNTS[i] + "\t: " + accountPicker[i][choiceAdmin]);
                                        }
                                        System.out
                                                .println("+---------------------------------------------------------+");
                                        for (int i = 0; i < DATA_ACCOUNTS.length; i++) {
                                            System.out.println(DATA_ACCOUNTS[i] + "\t: " + DATA[i][choiceAdmin]);
                                        }
                                        System.out
                                                .println("+--------------------------------------------------------+");
                                        System.out.println("Use 0 to go back to main menu.");
                                        System.out.println("Which one you want to edit : ");
                                        System.out.print("--> ");
                                        choiceEdit = sc.nextLine();

                                        clearTerminal();

                                        for (int i = 0; i < DATA_ACCOUNTS.length; i++) {
                                            boolean isDataAccount = choiceEdit.equalsIgnoreCase(DATA_ACCOUNTS[i]);
                                            if (isDataAccount) {
                                                System.out.println("+-----------------------------------+");
                                                System.out.println("\t    Edit " + DATA_ACCOUNTS[i]);
                                                System.out.println("+-----------------------------------+");
                                                System.out.println("Enter new " + DATA_ACCOUNTS[i]);
                                                System.out.print("--> ");
                                                DATA[i][choiceAdmin] = sc.nextLine();
                                            }
                                        }

                                        for (int i = 0; i < accountPicker.length; i++) {
                                            boolean isAccount = choiceEdit.equalsIgnoreCase(ACCOUNTS[i]);
                                            if (isAccount) {
                                                System.out.println("+-------------------------------------------+");
                                                System.out.println("Are you sure you want to edit the "
                                                        + ACCOUNTS[i] + " ?");
                                                System.out.println("+-------------------------------------------+");
                                                System.out.println(
                                                        "Warning: this will lead user to unable to access the account.");
                                                System.out.print("yes/no : ");
                                                choiceEdit = sc.nextLine();

                                                if (choiceEdit.equalsIgnoreCase("yes")) {
                                                    System.out.println("+-----------------------------------+");
                                                    System.out.println("\t    Edit " + ACCOUNTS[i]);
                                                    System.out.println("+-----------------------------------+");
                                                    System.out.println("Enter new " + ACCOUNTS[i]);
                                                    System.out.print("--> ");
                                                    accountPicker[i][choiceAdmin] = sc.nextLine();
                                                } else {
                                                    break;
                                                }
                                            }
                                        }

                                        clearTerminal();

                                    } while (!choiceEdit.equals("0"));
                                }

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
                    System.out.println("Welcome, " + USERNAME[noUser] + "! \t\t" + "Point : " + POINTS[noUser]);
                    System.out.println("+------------------------------------------+");
                    System.out.println();
                    System.out.println("What do you want to do today?");
                    for (int i = 1; i < HOME.length; i++) {
                        System.out.println(i + ". " + HOME[i]);
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

                        clearTerminal();

                        System.out.println("+------------------------------------------+");
                        System.out.println("Welcome, " + USERNAME[noUser] + "! \t\t" + "Point : " + POINTS[noUser]);
                        System.out.println("+------------------------------------------+");
                        System.out.println();
                        System.out.println("Please choose which action you want to do: ");
                        for (int i = 1; i < HOME.length; i++) {
                            System.out.println(i + ". " + HOME[i]);
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

                    clearTerminal();

                    switch (choice1) {
                        case 1:
                            System.out.println("+------------------------------------------+");
                            System.out.println("Choose which type of trash you have: ");
                            for (int i = 1; i < TYPE_TRASH.length; i++) {
                                System.out.println(i + ". " + TYPE_TRASH[i]);
                            }
                            /*
                             * 1. Inorganic
                             * 2. Organic
                             */
                            System.out.print("--> ");
                            choice2 = sc.nextInt();

                            clearTerminal();

                            while (!(choice2 < 3)) {
                                System.out.println("+------------------------------------------+");
                                System.out.println("Please choose which type of trash you have corecctly: ");
                                for (int i = 1; i < TYPE_TRASH.length; i++) {
                                    System.out.println(i + ". " + TYPE_TRASH[i]);
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
                            System.out.println("Choose which " + TYPE_TRASH[choice2] + " you have: ");

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

                            clearTerminal();

                            while ((chooseTrash < 1) || (chooseTrash > 4)) {
                                System.out.println("+------------------------------------------+");
                                System.out
                                        .println(
                                                "Please choose which " + TYPE_TRASH[choice2] + " you have corecctly: ");
                                for (int i = 1; i < TrashPicker[choice2].length; i++) {
                                    System.out.println(i + ". " + TrashPicker[choice2][i] + "\t\t\t" + "Rp. "
                                            + pricePicker[choice2][i]);
                                }
                                System.out.print("--> ");
                                chooseTrash = sc.nextInt();

                                clearTerminal();

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

                            if (DATA[3][noUser].equals("yes")) {
                                discount += 200;
                            } else {
                                discount += 0;
                            }

                            finalPrice = (totalTrash + shipping) - discount;

                            clearTerminal();

                            // BILL
                            System.out.println("+----------------------------------+");
                            System.out.println("  Name        : " + DATA[0][noUser]);
                            System.out.println("  Address     : " + DATA[1][noUser]);
                            System.out.println("  Phone       : " + DATA[2][noUser]);
                            System.out.println("+----------------------------------+");
                            System.out.println("  " + TYPE_TRASH[choice2] + "");
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

                            clearTerminal();

                            break;

                        case 2:
                            do {
                                System.out.println("+------------------------------------------+");
                                System.out.println("|\t\t VOUCHERS \t\t   |");
                                System.out.println("+------------------------------------------+");
                                System.out.println("Points : " + POINTS[noUser]);
                                System.out.println("+------------------------------------------+");
                                System.out.println("What do you want to do?");
                                for (int i = 1; i < MENU_VOUCHER.length; i++) {
                                    System.out.println(i + ". " + MENU_VOUCHER[i]);
                                }
                                System.out.print("--> ");
                                choice3 = sc.nextInt();

                                clearTerminal();

                                switch (choice3) {
                                    case 1:

                                        break;

                                    default:
                                        break;
                                }

                            } while (choice3 != 3);

                            clearTerminal();

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

    static void clearTerminal() {

        System.out.print("\033[H\033[2J");
        System.out.flush();

    }
}
