public class Library {
    // Add the missing implementation to this class
    private String address;
    private Book[] collection;
    private int book_num = 0;

    public Library(String address_){
        address = address_;
        collection = new Book[10];
    }

    public void addBook(Book book){
        collection[book_num] = book;
        //System.out.println(collection[book_num]);
        book_num++;
    }

    public static void printOpeningHours(){
        System.out.println("All libraries have the same opening hours: 9 AM to 5 PM daily.");
    }
    public void printAddress(){
        System.out.println("This library is located at " + address );
    }

    public void borrowBook(String book){
        for (int i = 0; i <= book_num-1 ; i++){
            if (collection[i].title == book){
                collection[i].borrowed = true;
                return;
            }
        }
    }
    public void returnBook(String book){
        for (int i = 0; i <= book_num-1 ; i++){
            if (collection[i].title == book){
                collection[i].borrowed = false;
                return;
            }
        }
    }
    public void printAvailableBooks(){
        int flag = 0;
        for (int i = 0; i <= book_num-1 ; i++){
            if (collection[i].borrowed == false){
                System.out.println(collection[i].title);
                flag = 1;
            }
        }
        if (flag == 0){
            System.out.println("None");
        }
    }
    public static void main(String[] args) {
        // Create two libraries
        Library firstLibrary = new Library("10 Main St.");
        Library secondLibrary = new Library("228 Liberty St.");

        // Add four books to the first library
        firstLibrary.addBook(new Book("The Da Vinci Code"));
        firstLibrary.addBook(new Book("Le Petit Prince"));
        firstLibrary.addBook(new Book("A Tale of Two Cities"));
        firstLibrary.addBook(new Book("The Lord of the Rings"));

        // Print opening hours and the addresses
        System.out.println("Library hours:");
        printOpeningHours();
        System.out.println();

        System.out.println("Library addresses:");
        firstLibrary.printAddress();
        secondLibrary.printAddress();
        System.out.println();

        // Try to borrow The Lords of the Rings from both libraries
        System.out.println("Borrowing The Lord of the Rings:");
        firstLibrary.borrowBook("The Lord of the Rings");
        firstLibrary.borrowBook("The Lord of the Rings");
        secondLibrary.borrowBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of all available books from both libraries
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
        System.out.println();
        System.out.println("Books available in the second library:");
        secondLibrary.printAvailableBooks();
        System.out.println();

        // Return The Lords of the Rings to the first library
        System.out.println("Returning The Lord of the Rings:");
        firstLibrary.returnBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of available from the first library
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
    }
} 