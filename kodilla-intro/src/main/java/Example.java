public class Example {
    public static void main(String[] args) {
        branchedFlow("text");
    }
    public static void branchedFlow(String text) {
        while(text.length()>0) {
            System.out.println(text);
            text = text.substring(0, text.length()-1);
        }
    }
}
