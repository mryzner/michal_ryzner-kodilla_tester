import java.util.Scanner;
public class MyTest7 {
    public static void main(String[] args) {
        System.out.println("Podaj pierwszą literę koloru, użyj małych liter");
        printColorName();

    }
    private static void printColorName() {
        Scanner scanner = new Scanner(System.in);
        String colour = scanner.nextLine();
        switch (colour) {
            case "b":
                System.out.println("biały lub brązowy");
                break;
            case "c":
                System.out.println("czarny lub czerwony");
                break;
            case "f":
                System.out.println("fioletowy");
                break;
            case "n":
                System.out.println("niebieski");
                break;
            case "r":
                System.out.println("różowy lub rudy");
                break;
            case "s":
                System.out.println("szary");
                break;
            case "z":
                System.out.println("zielony");
                break;
            default:
                System.out.println("Error!");
        }
    }
}
