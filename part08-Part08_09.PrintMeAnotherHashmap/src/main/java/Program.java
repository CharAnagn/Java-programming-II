import java.util.HashMap;

public class Program {
    static HashMap<String, Book> hashmap = new HashMap<>();

    public static void main(String[] args) {
        // Test your program here!
        hashmap.put("sense", new Book("Sense and Sensibility", 1811, "..."));
        hashmap.put("prejudice", new Book("Pride and prejudice", 1813, "...."));

        printValues(hashmap);
        System.out.println("---");
        printValueIfNameContains(hashmap, "prejud");
    }

    // Prints all values in the hashmap using the Book's toString method
    public static void printValues(HashMap<String, Book> hashmap) {
        for (Book book : hashmap.values()) {
            System.out.println(book);
        }
    }

    // Prints only the books whose name contains the given substring
    public static void printValueIfNameContains(HashMap<String, Book> hashmap, String text) {
        for (Book book : hashmap.values()) {
            if (book.getName().toLowerCase().contains(text.toLowerCase())) {
                System.out.println(book);
            }
        }
    }
}
