import java.util.Scanner;
public class SwitchColor {
    public static void main(String[] args) {
        System.out.println("Podaj pierwszą literę koloru");
        String colorName = getColorName();
        System.out.println(colorName);
    }
    private static String getColorName() {
        Scanner scanner = new Scanner(System.in);
        String color = scanner.nextLine().toUpperCase();
        switch (color) {
            case "B":
                color = "biały";
                break;
            case "C":
                color = "czarny";
                break;
            case "N":
                color = "niebieski";
                break;
            case "Z":
                color = "zielony";
                break;
            default:
                color = "brak innych kolorów";
        }
        return color;
    }
}
