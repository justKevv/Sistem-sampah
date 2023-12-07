import java.util.Scanner;
import java.io.Console;

public class Main {

    static Console getConsole = System.console();

    static Scanner sc = new Scanner(System.in);

    private static final String[] ROLE = { "Admin", "User" };
    private static final String[] ACCOUNTS = { "Username", "Password" };
    private static final String[] DATA_ACCOUNTS = { "ID", "Name", "Area", "Number", "Member", "Role" };

    private static final String[] HOME = { "", "Donate Trash", "Voucher", "History", "Profile", "Logout" };
    private static final String[] ADMIN = { "", "Account", "Trash List", "Location", "Logout" };
    private static final String[] MENU_VOUCHER = { "", "Redeem", "Points", "Back" };
    private static final String[] TYPE_TRASH = { "", "Inorganic Trash", "Organic Trash" };

    private static final String[] LOCATION = new String[15];
    private static final int[] DISTANCE = new int[15];

    static {
        LOCATION[0] = "Bakalankrajan";
        LOCATION[1] = "Bandulan";
        LOCATION[2] = "Bandungrejosari";
        LOCATION[3] = "Ciptomulyo";
        LOCATION[4] = "Gadang";
        LOCATION[5] = "Karangbesuki";
        LOCATION[6] = "Kebonsari";
        LOCATION[7] = "Mulyorejo";
        LOCATION[8] = "Pisangcandi";
        LOCATION[9] = "Sukun";
        LOCATION[10] = "Tanjungrejo";

        DISTANCE[0] = 2;
        DISTANCE[1] = 4;
        DISTANCE[2] = 1;
        DISTANCE[3] = 2;
        DISTANCE[4] = 5;
        DISTANCE[5] = 6;
        DISTANCE[6] = 4;
        DISTANCE[7] = 5;
        DISTANCE[8] = 4;
        DISTANCE[9] = 1;
        DISTANCE[10] = 2;

    }

    private static int counterLocation = 11;

    private static final String[] USERNAME = new String[20];
    private static final String[] PASSWORD = new String[20];

    static {
        // Username
        USERNAME[0] = "";
        USERNAME[1] = "kevv";
        USERNAME[2] = "seno1";
        USERNAME[3] = "adzin";
        USERNAME[4] = "admin";

        // Password
        PASSWORD[0] = "";
        PASSWORD[1] = "kevv";
        PASSWORD[2] = "seno1";
        PASSWORD[3] = "adzin";
        PASSWORD[4] = "admin";
    }

    private static final String[][] DATA = new String[10][20];

    static {
        // ID
        DATA[0][0] = "default";
        DATA[0][1] = "U111";
        DATA[0][2] = "U112";
        DATA[0][3] = "U113";
        DATA[0][4] = "A101";
        // Name
        DATA[1][0] = "";
        DATA[1][1] = "Kevin Bramasta";
        DATA[1][2] = "Baskoro Seno";
        DATA[1][3] = "Ahmad Adzin";
        DATA[1][4] = "Admin";

        // Area
        DATA[2][0] = "default";
        DATA[2][1] = LOCATION[9];
        DATA[2][2] = LOCATION[6];
        DATA[2][3] = LOCATION[4];
        DATA[2][4] = "-";

        // Number
        DATA[3][0] = "default";
        DATA[3][1] = "08123456789";
        DATA[3][2] = "08123456789";
        DATA[3][3] = "08123456789";
        DATA[3][4] = "-";

        // Member
        DATA[4][0] = "default";
        DATA[4][1] = "yes";
        DATA[4][2] = "yes";
        DATA[4][3] = "no";
        DATA[4][4] = "-";

        // Role
        DATA[5][0] = ROLE[0];
        DATA[5][1] = ROLE[1];
        DATA[5][2] = ROLE[1];
        DATA[5][3] = ROLE[1];
        DATA[5][4] = ROLE[0];
    }

    private static final int[] POINTS = new int[20];

    static {
        POINTS[0] = 0;
        POINTS[1] = 500;
        POINTS[2] = 350;
        POINTS[3] = 500;
        POINTS[4] = 0;
    }

    private static final int[] freeVoucher = new int[20];

    static {
        freeVoucher[0] = 0;
        freeVoucher[1] = 2;
        freeVoucher[2] = 3;
        freeVoucher[3] = 2;
        freeVoucher[4] = 0;
    }

    private static int counterAdmin = 2;
    private static int counterUser = 4;
    private static int counterAccount = 5;

    private static final String[] INORGANIC_TRASH = new String[10];
    private static final int[] PRICE_INORGANIC = new int[10];
    private static final int[] VALUE_INORGANIC = new int[10];

    static {
        INORGANIC_TRASH[0] = "";
        INORGANIC_TRASH[1] = "Plastic";
        INORGANIC_TRASH[2] = "Metal";
        INORGANIC_TRASH[3] = "Glass";

        PRICE_INORGANIC[0] = 0;
        PRICE_INORGANIC[1] = 200;
        PRICE_INORGANIC[2] = 400;
        PRICE_INORGANIC[3] = 600;

        VALUE_INORGANIC[0] = 0;
        VALUE_INORGANIC[1] = 50;
        VALUE_INORGANIC[2] = 200;
        VALUE_INORGANIC[3] = 100;
    }

    private static final String[] ORGANIC_TRASH = new String[10];
    private static final int[] PRICE_ORGANIC = new int[10];
    private static final int[] VALUE_ORGANIC = new int[10];

    static {
        ORGANIC_TRASH[0] = "";
        ORGANIC_TRASH[1] = "Paper";
        ORGANIC_TRASH[2] = "Plant";
        ORGANIC_TRASH[3] = "Food Waste";

        PRICE_ORGANIC[0] = 0;
        PRICE_ORGANIC[1] = 100;
        PRICE_ORGANIC[2] = 50;
        PRICE_ORGANIC[3] = 20;

        VALUE_ORGANIC[0] = 0;
        VALUE_ORGANIC[1] = 1;
        VALUE_ORGANIC[2] = 25;
        VALUE_ORGANIC[3] = 5;
    }

    private static int trashCount = 4;

    private static final String[][] TRASH_PICKER = { null, INORGANIC_TRASH, ORGANIC_TRASH };
    private static final int[][] PRICE_PICKER = { null, PRICE_INORGANIC, PRICE_ORGANIC };
    private static final int[][] VALUE_PICKER = { null, VALUE_INORGANIC, VALUE_ORGANIC };

    private static final String[][] ACCOUNT_PICKER = { USERNAME, PASSWORD };

    private static String inputUsername, inputPassword;
    private static int chooseTrash;
    private static int weightTrash, quantity;
    private static int totalTrash, shipping, discount, finalPrice;

    private static int choice, choice1, choice2, choice3;
    private static String choiceAdmin, choiceAdd;
    private static String choiceEdit, choiceTrash, choiceLocation;
    private static int noUser = 0;

    public static void main(String[] args) {
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

                clearTerminal();

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

                    checkAccount(inputUsername, inputPassword);

                    while (!checkAccount(inputUsername, inputPassword)) {

                        clearTerminal();

                        System.out.println("+------------------------------+");
                        System.out.println("| Invalid USERNAME or PASSWORD |");
                        System.out.println("+------------------------------+");

                        // Prompt for USERNAME and PASSWORD again
                        System.out.print("Enter your username: ");
                        inputUsername = sc.next();
                        System.out.print("Enter your password: ");
                        inputPassword = new String(System.console().readPassword());

                        checkAccount(inputUsername, inputPassword);

                        System.out.println("+------------------------------+");
                    }

                    clearTerminal();

                    break;

                // REGISTER
                case 2:
                    choiceAdd = "User";

                    clearTerminal();

                    System.out.println("+-----------------------------+");
                    System.out.println("|           SIGN IN           |");

                    registerMenu();

                    System.out.println("Do you want to sign up for a membership ?");
                    System.out.println("You will get a discount if you sign up for a membership.");
                    System.out.print("(yes/no) : ");
                    DATA[4][counterAccount] = sc.next();
                    noUser = counterAccount;

                    IDAccount(choiceAdd);

                    clearTerminal();

                    break;
                // EXIT
                case 3:
                    return;
            }

            clearTerminal();

            // ADMIN MENU
            if (DATA[5][noUser].equals("Admin")) {
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
                        sc.nextLine();
                    }

                    clearTerminal();

                    switch (choice1) {
                        case 1:
                            do {
                                System.out.println("Choose which account you want to access.");
                                System.out.println(
                                        "+------------------------------------------------------------------+");
                                System.out.printf("%-5s | %-20s | %-20s | %-10s%n", "ID", "Username", "Password",
                                        "Role");
                                System.out.println(
                                        "+------------------------------------------------------------------+");

                                for (int i = 1; i < counterAccount; i++) {
                                    System.out.printf("%-5s | %-20s | %-20s | %-10s%n", DATA[0][i], USERNAME[i],
                                            PASSWORD[i],
                                            DATA[5][i]);
                                }
                                System.out.println(
                                        "+------------------------------------------------------------------+");
                                System.out.println("Type \"help\"" + " for more information");
                                System.out.print("--> ");
                                choiceAdmin = sc.nextLine();

                                commandAdmin(choiceAdmin);

                                clearTerminal();

                            } while (!choiceAdmin.equals("0"));
                            break;

                        case 2:
                            do {
                                System.out.println(
                                        "+----------------------------------------+");
                                System.out.printf("%-20s | %-20s%n", "Inorganic", "Organic");
                                System.out.println(
                                        "+----------------------------------------+");

                                for (int i = 1; i < trashCount; i++) {
                                    System.out.printf("%-20s | %-20s%n", TRASH_PICKER[1][i],
                                            TRASH_PICKER[2][i]);
                                }
                                System.out.println(
                                        "+----------------------------------------+");
                                System.out.println("Use 0 to go back to main menu.");
                                System.out.print("--> ");
                                choiceTrash = sc.nextLine();

                                clearTerminal();

                            } while (!choiceTrash.equals("0"));
                            break;
                        case 3:
                            do {
                                System.out.println(
                                        "+----------------------------------------+");
                                System.out.printf("%-20s | %-20s%n", "Location", "Distance");
                                System.out.println(
                                        "+----------------------------------------+");
                                for (int i = 0; i < counterLocation; i++) {
                                    System.out.printf("%-20s | %-20s%n", LOCATION[i],
                                            DISTANCE[i]);
                                }
                                System.out.println(
                                        "+----------------------------------------+");
                                System.out.println("Use 0 to go back to main menu.");
                                System.out.print("--> ");
                                choiceLocation = sc.nextLine();

                            } while (!choiceLocation.equals("0"));
                        case 4:
                            break;
                    }

                } while (choice1 != (ADMIN.length - 1));
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

                    while (!(choice1 < HOME.length)) {

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

                                clearTerminal();

                            }

                            System.out.println("+------------------------------------------+");
                            System.out.println("Choose which " + TYPE_TRASH[choice2] + " you have: ");

                            for (int i = 1; i < trashCount; i++) {
                                System.out.println(i + ". " + TRASH_PICKER[choice2][i] + "\t\t\t" + "Rp. "
                                        + PRICE_PICKER[choice2][i]);
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

                            while (chooseTrash >= trashCount || chooseTrash < 1) {
                                System.out.println("+------------------------------------------+");
                                System.out
                                        .println(
                                                "Please choose which " + TYPE_TRASH[choice2] + " you have corecctly: ");
                                for (int i = 1; i < trashCount; i++) {
                                    System.out.println(i + ". " + TRASH_PICKER[choice2][i] + "\t\t\t" + "Rp. "
                                            + PRICE_PICKER[choice2][i]);
                                }
                                System.out.print("--> ");
                                chooseTrash = sc.nextInt();

                                clearTerminal();

                            }
                            System.out.println("+------------------------------------------+");
                            System.out.println("Value of " + TRASH_PICKER[choice2][chooseTrash] + " is Rp. "
                                    + VALUE_PICKER[choice2][chooseTrash]);
                            System.out.println();
                            System.out.print("Enter the weight of the trash (KG): ");
                            weightTrash = sc.nextInt();
                            System.out.print("Enter the quantity of the trash: ");
                            quantity = sc.nextInt();
                            sc.nextLine();

                            totalTrash = weightTrash * PRICE_PICKER[choice2][chooseTrash];
                            shipping = DISTANCE[checkDistance(noUser)] * 1000;
                            discount = quantity * VALUE_PICKER[choice2][chooseTrash];

                            if (DATA[4][noUser].equals("yes")) {
                                discount += 200;
                            } else {
                                discount += 0;
                            }

                            finalPrice = Math.max(0, ((totalTrash + shipping) - discount));

                            clearTerminal();

                            System.out.println("Do you want to use Voucher : ");
                            String input = sc.nextLine();

                            // BILL
                            printBill(input);

                            break;

                        case 2:
                            do {
                                System.out.println("+------------------------------------------+");
                                System.out.println("|\t\t VOUCHERS \t\t   |");
                                System.out.println("+------------------------------------------+");
                                System.out.println("Points : " + POINTS[noUser]);
                                System.out.println("Voucher : " + freeVoucher[noUser]);
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
                                        if (POINTS[noUser] >= 500) {
                                            System.out.println("You can redeem your voucher");
                                            freeVoucher[noUser]++;
                                            POINTS[noUser] -= 500;
                                        } else {
                                            System.out.println("You don't have enough points to redeem");
                                        }
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
                            System.out.println("+-------------------------+");
                            System.out.println("|      User Profile       |");
                            System.out.println("+-------------------------+");

                            for (int i = 0; i < ACCOUNTS.length; i++) {
                                System.out.println(
                                        ACCOUNTS[i] + "\t: " + ACCOUNT_PICKER[i][noUser]);

                            }
                            System.out.println("+-------------------------+");
                            for (int i = 1; i < 4; i++) {
                                System.out.println(
                                        DATA_ACCOUNTS[i] + "\t: " + DATA[i][noUser]);
                            }
                            System.out.println("+-------------------------+");
                            if (DATA[4][noUser].equals("yes")) {
                                System.out.println("Member is activated.");
                            } else {
                                System.out.println("Member is not activated. ");
                            }

                            System.exit(0);
                            break;
                    }
                } while (choice1 != HOME.length - 1);
            }

        } while (choice != 3);

    }

    static int getAccount(String Id) {
        int noUser = -1;
        for (int i = 0; i < DATA[0].length; i++) {
            if (DATA[0][i].toLowerCase().contains(Id.toLowerCase())) {
                noUser = i;
                break;
            }
        }
        return noUser;
    }

    static void promptEnterKey() {
        System.out.println("Press \"ENTER\" to continue...");
        getConsole.readLine();
    }

    static void clearTerminal() {

        System.out.print("\033[H\033[2J");
        System.out.flush();

    }

    static boolean checkAccount(String username, String password) {
        boolean validCredentials = false;
        for (int i = 0; i < USERNAME.length; i++) {
            if (username.equals(USERNAME[i]) && password.equals(PASSWORD[i])) {
                validCredentials = true;
                noUser = i;
                break;
            }
        }
        return validCredentials;
    }

    static void editAccount(int ID) {
        if (!choiceAdmin.isEmpty()) {
            do {
                clearTerminal();

                System.out
                        .println("+---------------------------------------------------------+");
                for (int i = 0; i < ACCOUNTS.length; i++) {
                    System.out.println(
                            ACCOUNTS[i] + "\t: " + ACCOUNT_PICKER[i][ID]);
                }
                System.out
                        .println("+---------------------------------------------------------+");
                for (int i = 0; i < DATA_ACCOUNTS.length; i++) {
                    System.out.println(
                            DATA_ACCOUNTS[i] + "\t: " + DATA[i][ID]);
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
                    boolean isArea = choiceEdit.equalsIgnoreCase(DATA_ACCOUNTS[2]);
                    if (isDataAccount) {
                        System.out.println("+-----------------------------------+");
                        System.out.println("\t    Edit " + DATA_ACCOUNTS[i]);
                        System.out.println("+-----------------------------------+");
                        if (isArea) {
                            listArea();
                        }
                        System.out.println("Enter new " + DATA_ACCOUNTS[i]);
                        System.out.print("--> ");
                        DATA[i][ID] = sc.nextLine();
                        if (isArea) {
                            assignLocation(DATA[i][ID]);
                        }
                    }
                }

                for (int i = 0; i < ACCOUNT_PICKER.length; i++) {
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
                            ACCOUNT_PICKER[i][ID] = sc.nextLine();
                        } else {
                            break;
                        }
                    }
                }

                clearTerminal();

            } while (!choiceEdit.equals("0"));

        }
    }

    // Feature to Add Account
    static void addAccount() {

        clearTerminal();

        System.out.println("+-----------------------------------+");
        System.out.println("\t Add new account    ");
        System.out.println("+-----------------------------------+");
        System.out.print("Select account type (");
        for (int i = 0; i < ROLE.length; i++) {
            System.out.print((i == ROLE.length - 1) ? ROLE[i] : ROLE[i] + "/");
        }
        System.out.print("): ");
        choiceAdd = sc.nextLine();

        clearTerminal();

        registerMenu();

        IDAccount(choiceAdd);
    }

    // Feature for Registering Menu
    static void registerMenu() {

        // Username and Password
        for (int i = 0; i < ACCOUNTS.length; i++) {
            System.out.println("+-----------------------------+");
            System.out.println("Enter the " + ACCOUNTS[i]);
            System.out.print("--> ");
            ACCOUNT_PICKER[i][counterAccount] = sc.nextLine();
        }

        clearTerminal();

        System.out.println("+-----------------------------+");
        System.out.println("Enter your name ");
        System.out.print("--> ");
        DATA[1][counterAccount] = sc.nextLine();
        System.out.println("+-----------------------------+");
        System.out.println("Enter your phone number ");
        System.out.print("--> ");
        DATA[3][counterAccount] = sc.nextLine();

        clearTerminal();
        listArea();

        System.out.println("Enter your location ");
        System.out.print("--> ");
        String tempLoc = sc.nextLine();

        assignLocation(tempLoc);

        clearTerminal();
    }

    // Feature to assign location for the user ID
    static void assignLocation(String location) {
        boolean isAdmin = DATA[5][noUser].equals(ROLE[0]);
        for (int i = 0; i < LOCATION.length; i++) {
            if (location.equalsIgnoreCase(LOCATION[i])) {
                if (isAdmin) {
                    DATA[2][getAccount(choiceAdmin)] = LOCATION[i];
                    break;
                } else {
                    DATA[2][counterAccount] = LOCATION[i];
                    break;
                }
            }
        }
    }

    // Feature to check the user distance by their user ID
    static int checkDistance(int ID) {
        int distanceUser = 0;
        for (int i = 0; i < LOCATION.length; i++) {
            if (DATA[2][ID].contains(LOCATION[i])) {
                distanceUser = i;
                break;
            }
        }
        return distanceUser;
    }

    // Feature to show list area that can be reached out by the expeditions
    static void listArea() {
        System.out.println(" We are based in Trash Bank Sukun Malang");
        System.out.println("+-----------------------------+");
        for (int i = 0; i < counterLocation; i++) {
            System.out.printf("%-10s %n", LOCATION[i]);
            if (i % 5 == 0 && i != 0) {
                System.out.println("+-----------------------------+");
            }
        }
    }

    // Feature to show exact command admin purposes
    static void helpAdmin() {
        System.out.println();
        System.out.println("\"add\"" + "\t\t\t" + "To add new account");
        System.out.println("\"0\"" + "\t\t\t" + "To go back to main menu");
        System.out.println("\"help\"" + "\t\t\t" + "To get help");
        System.out.println("\"A101\"" + "\t\t\t" + "To access user (Use different ID)");
        System.out.print("--> ");
        choiceAdmin = sc.nextLine();

        commandAdmin(choiceAdmin);

    }

    // Feature Command Admin
    static void commandAdmin(String choose) {
        if (choose.equalsIgnoreCase("help")) {
            helpAdmin();
        } else if (choose.equalsIgnoreCase("0")) {

        } else if (choose.equalsIgnoreCase("add")) {
            addAccount();
        } else {
            editAccount(getAccount(choose));
        }
    }

    // Feature Assign New Id
    static void IDAccount(String account) {
        if (account.equalsIgnoreCase("Admin")) {
            DATA[5][counterAccount] = ROLE[0];
            DATA[0][counterAccount] = "A10" + counterAdmin;
            counterAdmin++;
        } else {
            DATA[5][counterAccount] = ROLE[1];
            DATA[0][counterAccount] = "U11" + counterUser;
            counterUser++;
        }
        counterAccount++;
    }

    // Feature Bill
    static void printBill(String input) {
        System.out.println("+----------------------------------+");
        System.out.println("  Name        : " + DATA[1][noUser]);
        System.out.println("  Area        : " + DATA[2][noUser]);
        System.out.println("  Phone       : " + DATA[3][noUser]);
        System.out.println("+----------------------------------+");
        System.out.println("  " + TYPE_TRASH[choice2] + "");
        System.out.println("+----------------------------------+");
        System.out.println("  " + TRASH_PICKER[choice2][chooseTrash] + " Type ");
        System.out.println("  Weight       : " + weightTrash + " KG");
        System.out.println("  Quantity     : " + quantity);
        System.out.println("  Distance     : " + DISTANCE[checkDistance(noUser)] + " KM");
        if (input.equals("yes")) {
            System.out.println("+----------------------------------+");
            System.out.println("  Price        : Free ");
            System.out.println("  Shipping Fee : Free ");
            System.out.println("  Discount     : Free ");
            System.out.println("+----------------------------------+");
            System.out.println("  Total Price  : Free ");
            System.out.println("+----------------------------------+");
            System.out.println();
        } else {
            System.out.println("+----------------------------------+");
            System.out.println("  Price        : Rp. " + totalTrash);
            System.out.println("  Shipping Fee : Rp. " + shipping);
            System.out.println("  Discount     : Rp. " + discount);
            System.out.println("+----------------------------------+");
            System.out.println("  Total Price  : Rp. " + finalPrice);
            System.out.println("+----------------------------------+");
            System.out.println();
        }

        promptEnterKey();

        clearTerminal();
    }
}
