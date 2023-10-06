import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name, address, number, member;
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
        System.out.print("Are you a member or not (yes/no) : ");
        member = sc.nextLine();

        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("Choose which type of trash you have: ");
        System.out.println("1. Inorganic");
        System.out.println("2. Organic");
        System.out.print("-->");
        int choice1 = sc.nextInt();

        System.out.print("\033[H\033[2J");
        System.out.flush();


        switch (choice1){
            case 1:
                System.out.println("Choose which inorganic trash you have: ");
                System.out.println("1. Plastic \t\t\t Rp. 2000");
                System.out.println("2. Metal \t\t\t Rp. 6000");
                System.out.println("3. Glass \t\t\t Rp. 4000");
                System.out.print("-->");
                chooseTrash = sc.nextInt();

                System.out.print("\033[H\033[2J");
                System.out.flush();

                switch (chooseTrash) {
                    case 1:
                        System.out.println("Value of Plastic is Rp. 1500");
                        System.out.println("");
                        System.out.print("Enter the weight of the trash (KG): ");
                        weightTrash = sc.nextInt();
                        System.out.print("Enter the quantity of the trash: ");
                        quantity = sc.nextInt();
                        System.out.print("Enter your distances (KM): ");
                        distance = sc.nextInt();

                        totalTrash = weightTrash * 2000;
                        shipping = distance * 10000;
                        discount = quantity * 1500;

                        if(member.equalsIgnoreCase("yes")){
                            discount += 2000;
                        }else {
                            discount += 0;
                        }
                            

                        finalPrice = (totalTrash + shipping) - discount;

                        System.out.print("\033[H\033[2J");
                        System.out.flush();

                        System.out.println("====================================");
                        System.out.println("Name        : " + name);
                        System.out.println("Address     : " + address);
                        System.out.println("Phone Number: " + number);
                        System.out.println("====================================");
                        System.out.println("Inorganic Trash");
                        System.out.println("Plastic Type : \n Weight      : " + weightTrash + " KG" +"\n Quantity    : " + quantity + "\n Distance     : " + distance + " KM");
                        System.out.println("");
                        System.out.println("Price        : Rp. " + totalTrash);
                        System.out.println("Shipping Fee : Rp. " + shipping);
                        System.out.println("Discount     : Rp. " + discount);
                        System.out.println("====================================");
                        System.out.println("Total Price  : Rp. " + finalPrice);
                        System.out.println("====================================");
                        break;
                    case 2:
                        System.out.println("Value of Metal is Rp. 4000");
                        System.out.println("");
                        System.out.print("Enter the weight of the trash (KG): ");
                        weightTrash = sc.nextInt();
                        System.out.print("Enter the quantity of the trash: ");
                        quantity = sc.nextInt();
                        System.out.print("Enter your distances (KM): ");
                        distance = sc.nextInt();
                        
                        totalTrash = weightTrash * 6000;
                        shipping = distance * 10000;
                        discount = quantity * 4000;

                        if(member.equalsIgnoreCase("yes")){
                            discount += 2000;
                        }else {
                            discount += 0;
                        }

                        finalPrice = (totalTrash + shipping) - discount;

                        System.out.print("\033[H\033[2J");
                        System.out.flush();

                        System.out.println("====================================");
                        System.out.println("Name        : " + name);
                        System.out.println("Address     : " + address);
                        System.out.println("Phone Number: " + number);
                        System.out.println("====================================");
                        System.out.println("Inorganic Trash");
                        System.out.println("Metal Type : \n Weight      : " + weightTrash + " KG" +"\n Quantity    : " + quantity + "\n Distance     : " + distance + " KM");
                        System.out.println("");
                        System.out.println("Price        : Rp. " + totalTrash);
                        System.out.println("Shipping Fee : Rp. " + shipping);
                        System.out.println("Discount     : Rp. " + discount);
                        System.out.println("====================================");
                        System.out.println("Total Price  : Rp. " + finalPrice);
                        System.out.println("====================================");
                        break;

                    case 3:
                        System.out.println("Value of Glass is Rp. 3000");
                        System.out.println("");
                        System.out.print("Enter the weight of the trash (KG): ");
                        weightTrash = sc.nextInt();
                        System.out.print("Enter the quantity of the trash: ");
                        quantity = sc.nextInt();
                        System.out.print("Enter your distances (KM): ");
                        distance = sc.nextInt();

                        totalTrash = weightTrash * 4000;
                        shipping = distance * 10000;
                        discount = quantity * 3000;

                        if(member.equalsIgnoreCase("yes")){
                            discount += 2000;
                        }else {
                            discount += 0;
                        }

                        finalPrice = (totalTrash + shipping) - discount;

                        System.out.print("\033[H\033[2J");
                        System.out.flush();

                        System.out.println("====================================");
                        System.out.println("Name        : " + name);
                        System.out.println("Address     : " + address);
                        System.out.println("Phone Number: " + number);
                        System.out.println("====================================");
                        System.out.println("Inorganic Trash");
                        System.out.println("Glass Type : \n Weight      : " + weightTrash + " KG" +"\n Quantity    : " + quantity + "\n Distance     : " + distance + " KM");
                        System.out.println("");
                        System.out.println("Price        : Rp. " + totalTrash);
                        System.out.println("Shipping Fee : Rp. " + shipping);
                        System.out.println("Discount     : Rp. " + discount);
                        System.out.println("====================================");
                        System.out.println("Total Price  : Rp. " + finalPrice);
                        System.out.println("====================================");
                        break;
                    default:
                        System.out.println("Invalid input");
                        System.exit(0);
                        break;
                }
                break;
            case 2:
                System.out.println("Choose which organic trash you have: ");
                System.out.println("1. Paper \t\t\t Rp. 1000");
                System.out.println("2. Plants and Leaves Rp. 500");
                System.out.println("3. Food Waste \t\t Rp. 200");
                System.out.print("-->");
                chooseTrash = sc.nextInt();

                System.out.print("\033[H\033[2J");
                System.out.flush();

                switch (chooseTrash) {
                    case 1:
                        System.out.println("Value of Paper is Rp. 500");
                        System.out.println("");
                        System.out.print("Enter the weight of the trash (KG): ");
                        weightTrash = sc.nextInt();
                        System.out.print("Enter the quantity of the trash: ");
                        quantity = sc.nextInt();
                        System.out.print("Enter your distances (KM): ");
                        distance = sc.nextInt();

                        totalTrash = weightTrash * 1000;
                        shipping = distance * 10000;
                        discount = quantity * 500;

                        if(member.equalsIgnoreCase("yes")){
                            discount += 2000;
                        }else {
                            discount += 0;
                        }

                        finalPrice = (totalTrash + shipping) - discount;

                        System.out.print("\033[H\033[2J");
                        System.out.flush();

                        System.out.println("====================================");
                        System.out.println("Name        : " + name);
                        System.out.println("Address     : " + address);
                        System.out.println("Phone Number: " + number);
                        System.out.println("====================================");
                        System.out.println("Organic Trash");
                        System.out.println("Paper Type : \n Weight      : " + weightTrash + " KG" +"\n Quantity    : " + quantity + "\n Distance     : " + distance + " KM");
                        System.out.println("");
                        System.out.println("Price        : Rp. " + totalTrash);
                        System.out.println("Shipping Fee : Rp. " + shipping);
                        System.out.println("Discount     : Rp. " + discount);
                        System.out.println("====================================");
                        System.out.println("Total Price  : Rp. " + finalPrice);
                        System.out.println("====================================");
                        break;
                    case 2:
                        System.out.println("Value of Plants and Leaves is Rp. 250");
                        System.out.println("");
                        System.out.print("Enter the weight of the trash (KG): ");
                        weightTrash = sc.nextInt();
                        System.out.print("Enter the quantity of the trash: ");
                        quantity = sc.nextInt();
                        System.out.print("Enter your distances (KM): ");
                        distance = sc.nextInt();

                        totalTrash = weightTrash * 500;
                        shipping = distance * 10000;
                        discount = quantity * 250;

                        if(member.equalsIgnoreCase("yes")){
                            discount += 2000;
                        }else {
                            discount += 0;
                        }

                        finalPrice = (totalTrash + shipping) - discount;

                        System.out.print("\033[H\033[2J");
                        System.out.flush();

                        System.out.println("====================================");
                        System.out.println("Name        : " + name);
                        System.out.println("Address     : " + address);
                        System.out.println("Phone Number: " + number);
                        System.out.println("====================================");
                        System.out.println("Organic Trash");
                        System.out.println("Plants and Leaves Type : \n Weight      : " + weightTrash + " KG" +"\n Quantity    : " + quantity + "\n Distance     : " + distance + " KM");
                        System.out.println("");
                        System.out.println("Price        : Rp. " + totalTrash);
                        System.out.println("Shipping Fee : Rp. " + shipping);
                        System.out.println("Discount     : Rp. " + discount);
                        System.out.println("====================================");
                        System.out.println("Total Price  : Rp. " + finalPrice);
                        System.out.println("====================================");
                        break;
                    case 3:
                        System.out.println("Value of Food Waste is Rp. 100");
                        System.out.println("");
                        System.out.print("Enter the weight of the trash (KG): ");
                        weightTrash = sc.nextInt();
                        System.out.print("Enter the quantity of the trash: ");
                        quantity = sc.nextInt();
                        System.out.print("Enter your distances (KM): ");
                        distance = sc.nextInt();

                        totalTrash = weightTrash * 200;
                        shipping = distance * 10000;
                        discount = quantity * 100;

                        if(member.equalsIgnoreCase("yes")){
                            discount += 2000;
                        }else {
                            discount += 0;
                        }

                        finalPrice = (totalTrash + shipping) - discount;

                        System.out.print("\033[H\033[2J");
                        System.out.flush();

                        System.out.println("====================================");
                        System.out.println("Name        : " + name);
                        System.out.println("Address     : " + address);
                        System.out.println("Phone Number: " + number);
                        System.out.println("====================================");
                        System.out.println("Organic Trash");
                        System.out.println("Food Waste Type : \n Weight      : " + weightTrash + " KG" +"\n Quantity    : " + quantity + "\n Distance     : " + distance + " KM");
                        System.out.println("");
                        System.out.println("Price        : Rp. " + totalTrash);
                        System.out.println("Shipping Fee : Rp. " + shipping);
                        System.out.println("Discount     : Rp. " + discount);
                        System.out.println("====================================");
                        System.out.println("Total Price  : Rp. " + finalPrice);
                        System.out.println("====================================");
                        break;
                    default:
                        System.out.println("Invalid input");
                        System.exit(0);
                        break;
                }
                break;
            default:
                System.out.println("Invalid input");
                System.exit(0);


                
        }

        

    }
}
