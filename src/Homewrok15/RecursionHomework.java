package Homewrok15;
import java.util.Scanner;


public class RecursionHomework {
    public static void main(String[] args) {
        System.out.println(sumOfFirstIntegerNumbers(10));
        System.out.println(sumOfFirstEvenIntegersNumbers(13));
        System.out.println(palindrome("raluca"));
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

   public static boolean palindrome(String str){
       int n = str.length();
       boolean ok = true;
       for(int i = 0 ; i <= (n - 1) / 2 ; i++){
           if(str.charAt(i) != str.charAt(n - 1)){
               ok = false;
               return ok;
           }
           n = n -1;
       }
       return ok;
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
}

