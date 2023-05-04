public class Ex1To4 {
    public static void main(String[] args) {
        byte x=17;
        exercise1(x);
        exercise2(11);
        System.out.println(exercise3(3,6));
        System.out.println(exercise4(3,6,9));
    }

    public static void exercise1(byte number) {
        if (number > 10){
            System.out.println("The number is greater than 10 ");
        }
    }

    public static void exercise2(int number) {
        switch (number) {
            case 1 ->
                    System.out.println("January");
            case 2 ->
                    System.out.println("February");
            case 3 ->
                    System.out.println("March");
            case 4 ->
                    System.out.println("April");
            case 5 ->
                    System.out.println("May");
            case 6 ->
                    System.out.println("June");
            case 7 ->
                    System.out.println("July");
            case 8 ->
                    System.out.println("August");
            case 9 ->
                    System.out.println("September");
            case 10 ->
                    System.out.println("Octomber");
            case 11 ->
                    System.out.println("November");
            case 12 ->
                    System.out.println("December");
            default ->
                    System.out.println("Not a month");
        }
    }

    public static int exercise3(int a , int b) {
        if(a > b) {
            return a;
        }else {
            return b;
        }
    }
    public static int exercise4(int a , int b , int c) {
        if(a > b && a > c) {
            return a;
        }else if  (b > a && b > c) {
            return b;
        }else {
            return c;
        }
    }
}
