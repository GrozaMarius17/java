/*6) Write an ATM application:
- have in main a pre-defined PIN.
- have in main a variable that holds the amount of money available
request the pin from console
if the pin is correct, print a success message
if the pin is incorrect, print failure message and close the application
if the pin is correct, request the wanted amount of money
if the wanted amount of money can be withdrawn, print a success message and the amount of money left
if the wanted amount of money cannot be withdran, print a failure message and the maximum amount that can be withdrawn*/

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        int PIN = 1234;
        int mooneyAvailable = 2000;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write your pin");
        short a = scanner.nextShort();

    }
}