import java.util.Random;
public class RandomNumbers {
    private static int maxNumber = 0;
    private static int minNumber = 31;

    public static void main(String[] args) {
        doRandom(5000);
        int maxValue = getMax();
        int minValue = getMin();
        System.out.println("max Value is: " + maxValue);
        System.out.println("min Value is: "+ minValue);
    }
    public static void doRandom(int max) {
        Random random = new Random();
        int sum = 0;
        while (sum < max) {
            int temp = random.nextInt(31);
            sum = sum + temp;
            System.out.println(sum);
            if (temp > maxNumber) { maxNumber = temp; }
            if (temp < minNumber) { minNumber = temp; }
        }
    }
    public static int getMax() { return maxNumber; }

    public static int getMin() { return minNumber; }
    }


















