public class SimpleArray {
    public static void main(String[] args) {
        String[] felidae = new String[6];
        felidae[0] = "lew";
        felidae[1] = "tygrys";
        felidae[2] = "jaguar";
        felidae[3] = "puma";
        felidae[4] = "gepard";
        felidae[5] = "kot domowy";

        String cat = felidae[3];
        System.out.println(cat);

        int numberOfElements = felidae.length;
        System.out.println("Liczba elementów w mojej tablicy to " + numberOfElements);

    }
}
