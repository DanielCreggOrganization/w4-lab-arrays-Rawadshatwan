public class DIY5 {
    public static void main(String[] args) {
        // Array of Strings (which are objects in Java)
        String[] names = {"Alice", "Bob", "Charlie"};

        // Array of custom objects
        Book[] books = new Book[2];

        books[0] = new Book("THE BFG", 42);
        books[1] = new Book("Charlie and the Chocolate factory", 60);

        for (Book book : books) {
            System.out.println(book.getName() + " is " + book.getAge() + " years old and written by Rohal Dahl.");
        }
    }
}

class Book {
    private String name;
    private int age;

    // Constructor
    Book(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter methods
    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }
}