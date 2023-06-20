import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        System.out.println("Enter your number:");
        doFizzBuzz();

    }
    private static void doFizzBuzz() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer val = n;
        if (val != null) {

            if ((n % 3 == 0) && (n % 5 == 0)) {
                System.out.println("FizzBuzz");
            } else if (n % 3 == 0) {
                System.out.println("Fizz");
            } else if (n % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println("None");
            }
        } sc.close();
    }
}
