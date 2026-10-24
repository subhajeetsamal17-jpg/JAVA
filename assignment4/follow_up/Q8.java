class Book {
    int bookId;
    String title;
    String author;
    boolean available;

    Book(int bookId, String title,
         String author, boolean available) {

        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.available = available;
    }

    void display() {
        System.out.println(bookId + " "
                + title + " "
                + author + " "
                + available);
    }

    void search(int id) {
        if (bookId == id) {
            display();
        }
    }
}
public class LibraryDemo {
    public static void main(String[] args) {

        Book b1 = new Book(101,
                "Java Programming",
                "Herbert Schildt",
                true);

        Book b2 = new Book(102,
                "Data Structures",
                "Seymour Lipschutz",
                true);

        System.out.println("Books:");

        b1.display();
        b2.display();

        System.out.println("\nSearch Book ID 102:");
        b1.search(102);
        b2.search(102);
    }
}