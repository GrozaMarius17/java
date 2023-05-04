import java.util.Scanner;

public class Tax {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        System.out.println(taxPercent(a));
    }

    public static String taxPercent(int x){
        if (x <= 2000){
            String tax = "0%";
            return tax;
        } else if(x <= 5000 && x > 2000) {
            String tax = "20%";
            return tax;
        } else {
            String tax = "35%";
            return tax;
        }
    }
}
