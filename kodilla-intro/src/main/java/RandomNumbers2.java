import java.util.Random;

public class RandomNumbers2 {
    int minRandom = 31;
    int maxRandom = 0;
    public static void main(String[] args) {
        getCountOfRandomNumber(5000);

    }
    private static  void getCountOfRandomNumber(int max) {
        Random random = new Random();
        int sum = 0;
        while (sum < max) {
            int temp = random.nextInt(31);
            sum = sum + temp;
            System.out.println(sum);
        }
    }
}
