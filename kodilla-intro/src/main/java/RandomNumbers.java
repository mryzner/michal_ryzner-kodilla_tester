import java.util.Random;

public class RandomNumbers {
    int minRandom = 31;
    int maxRandom = 0;
    public static void main(String[] args) {
        getCountOfRandomNumber(5000);

    }
    public static int getCountOfRandomNumber(int max) {
        Random random = new Random();
        int result = 0;
        int sum = 0;
        while (sum < max) {
            int temp = random.nextInt(31);
            sum = sum + temp;
            result++;
            System.out.println(sum);
        }
        return result;
    }
}
