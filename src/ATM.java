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
        short PIN = 1234;
        double mooneyAvailable = 2000;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write your pin");
        short a = scanner.nextShort();

        if(a == PIN) {
            System.out.println("Success");
            System.out.println("How much mooney do you want to withdrawn?");
            double b = scanner.nextDouble();
            if (mooneyAvailable >= b){
                System.out.println("Success.You have enough mooney to make the operation");
                double dif = mooneyAvailable-b;
                System.out.println("You have " + dif + " mooney available!");
            } else {
                System.out.println("Failure. Not enough mooney");
                System.out.println("You have: " + mooneyAvailable);
            }
        } else {
            System.out.println("The PIN is incorrect");
        }
    }
}