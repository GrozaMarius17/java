package Homewrok15;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RecursionHomework {
    public static void main(String[] args) {
        Map<Long , Long> fibonacciResult = new HashMap<>();
        System.out.println(fibonacciArray(10));
        System.out.println(sumOfDigitsForANumber(12345));
        System.out.println(sumOfFirstIntegerNumbers(10));
        System.out.println(sumOfFirstEvenIntegersNumbers(13));
        palindrome1("ana");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String for check:");
        String string = scanner.nextLine();
        if(palindrome2(string))
            System.out.println(string + " is a palindrome");
        else
            System.out.println(string + " is not a palindrome");
    }



   public static int sumOfFirstIntegerNumbers(int n) {
       if (n == 1) {
           return 1;
       }
       return n + sumOfFirstIntegerNumbers(n - 1);
   }

   public static int sumOfFirstEvenIntegersNumbers(int n){
        if(n % 2 == 1){
            n = n-1;
       }
        if( n == 2){
            return 2;
        }
        return n + sumOfFirstEvenIntegersNumbers(n - 2);
   }

   public static void palindrome1(String str){
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--){
            reverse = reverse + str.charAt(i);
       }
        if(str.equals(reverse)){
            System.out.println("Is palindrome");
        }else {
            System.out.println("Is not palindrome");
        }
   }

   public static boolean palindrome2(String str){
        if (str.length() == 0 || str.length() == 1){
            return true;
        }
       if(str.charAt(0) == str.charAt(str.length()-1)){
           return palindrome2(str.substring(1, str.length()-1));
       }
       return false;
   }

   public static int sumOfDigitsForANumber(int number){
       if ( number / 10 == 0) {
           return number;
       }
       return number % 10 + sumOfDigitsForANumber(number / 10);
   }

    public static int fibonacciArray(int k){
        if(k == 0){
            return 0;
        }
        if(k == 1){
            return 1;
        }
        return fibonacciArray(k-1) + fibonacciArray(k-2);
    }
}

