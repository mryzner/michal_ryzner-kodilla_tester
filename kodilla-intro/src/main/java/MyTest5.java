import java.util.Scanner;
public class MyTest5 {
    public static void main(String[] args) {
        System.out.println("Enter your name and your age:");
        learnScan();
        printJustKidding();
    }
    private static void learnScan() {
        Scanner sc = new Scanner(System.in);
        String sample = sc.nextLine();
        int sample2 = sc.nextInt();
        System.out.println("Your name: " + sample + " ;" + " Your age: " + sample2*4);
    }
    private static void printJustKidding() {
        System.out.println("Just Kidding!");
    }
}
