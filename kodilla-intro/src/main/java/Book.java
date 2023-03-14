public class Book {
    private String author;
    private String title;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }
    public static Book of(String author, String title) {
        Book book = new Book(author, title);
        return book;
    }
    public static void main(String[] args) {
        Book book = Book.of("Adam Mickiewicz", "Pan Tadeusz");
        System.out.println("Autor: " + book.author);
        System.out.println("Tytuł: " + book.title);
    }
}
