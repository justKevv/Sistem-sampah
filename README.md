# Sistem-sampah

Nama Anggota
1. Ahmad Adzin Brillian Lazuardy Karim (2341720242) @adzinbrillian
2. Baskoro Seno Aji (2341720063) @Anothaatype
3. Kevin Bramasta Arvyto Wardhana (2341720233) @justKevv

Trash Pickup Service
This code is a Java program that simulates a trash pickup system. It allows users to login, register, donate trash, view vouchers, and view their donation history. The program also has an admin mode that allows administrators to manage user accounts and view the trash list.

## Input
* User input for login or registration (username and password)
* User input for choosing the type of trash they want to donate
* User input for the weight, quantity, and distance of the donated trash

## Flow
1. The program presents a menu with options to log in, register, or exit.
2. If the user chooses to log in, they are prompted to enter their username and password. If the credentials are valid, the user is logged in.
3. If users choose to register, they are prompted to enter their account details (username, password, name, phone number, and location).
4. After logging in or registering, the program presents a menu with options for different actions (donate trash, redeem vouchers, view history, or log out).
5. If the user chooses to donate trash, they are prompted to choose the type of trash, specific trash type, weight, and quantity. The program calculates the total price, shipping fee, discount, and final price based on the user's input.
6. If the user has vouchers, they are prompted to choose whether to use the vouchers or not.
7. The program displays the bill with the user's information and the calculated prices.
8. The user is prompted to press enter to continue.
9. The program returns to the main menu.

## Outputs
* Login or registration success/failure message
* Menu options for the user or admin
* Donation bill with details of the donation
