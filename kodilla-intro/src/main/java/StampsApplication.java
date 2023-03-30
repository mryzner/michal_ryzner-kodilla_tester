import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Ugly stamp", 4, 3, true));
        stamps.add(new Stamp("Old stamp", 5, 4, false));
        stamps.add(new Stamp("Nice stamp", 3, 4, true));
        stamps.add(new Stamp("Old stamp", 5, 4, false));
        stamps.add(new Stamp("Lovely stamp", 6, 2, false));
        stamps.add(new Stamp("Valuable stamp", 5, 4, true));

        if (stamps.size() == 5) {
            System.out.println("Adding stamps to collection works correctly");
        } else {
            System.out.println("An error occurred !");
        }
//      if (stamps.size() != 5) {
//          throw new RuntimeException("Something is wrong with adding stamps to set");
//      }
        System.out.println("Displaying collection info:");
        System.out.println("Collection size: " + stamps.size());
        int count = 0;
        for (Stamp stamp: stamps) {
            count++;
            System.out.println(count);
            System.out.println(stamp);
        }
    }
}
