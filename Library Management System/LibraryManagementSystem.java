import java.io.*;
import java.util.*;

class Book {
    private String title;
    private String author;
    private boolean checkedOut;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.checkedOut = false;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isCheckedOut() {
        return checkedOut;
    }

    public void setCheckedOut(boolean checkedOut) {
        this.checkedOut = checkedOut;
    }
}

class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(String title, String author) {
        Book book = new Book(title, author);
        books.add(book);
    }

    public void searchBook(String keyword) {
        List<Book> searchResults = new ArrayList<>();

        for (Book book : books) {
            if (book.getTitle().contains(keyword) || book.getAuthor().contains(keyword)) {
                searchResults.add(book);
            }
        }

        if (searchResults.isEmpty()) {
            System.out.println("No books found matching the search keyword.");
        } else {
            System.out.println("Search results:");
            for (Book book : searchResults) {
                System.out.println(book.getTitle() + " by " + book.getAuthor());
            }
        }
    }

    public void checkoutBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                if (!book.isCheckedOut()) {
                    book.setCheckedOut(true);
                    System.out.println("Book '" + title + "' checked out successfully.");
                } else {
                    System.out.println("Book '" + title + "' is already checked out.");
                }
                return;
            }
        }

        System.out.println("Book '" + title + "' not found in the library.");
    }

    public void returnBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                if (book.isCheckedOut()) {
                    book.setCheckedOut(false);
                    System.out.println("Book '" + title + "' returned successfully.");
                } else {
                    System.out.println("Book '" + title + "' is not checked out.");
                }
                return;
            }
        }

        System.out.println("Book '" + title + "' not found in the library.");
    }

    public void saveBooksToFile(String filename) {
        try (PrintWriter writer = new PrintWriter(filename)) {
            for (Book book : books) {
                writer.println(book.getTitle() + "," + book.getAuthor() + "," + book.isCheckedOut());
            }
            System.out.println("Books saved to file: " + filename);
        } catch (IOException e) {
            System.out.println("Error saving books to file: " + e.getMessage());
        }
    }

    public void loadBooksFromFile(String filename) {
        try (Scanner scanner = new Scanner(new File(filename))) {
            books.clear();
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");
                String title = parts[0];
                String author = parts[1];
                boolean checkedOut = Boolean.parseBoolean(parts[2]);
                Book book = new Book(title, author);
                book.setCheckedOut(checkedOut);
                books.add(book);
            }
            System.out.println("Books loaded from file: " + filename);
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filename);
        }
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();

        // Loading books from a file (if available)
        library.loadBooksFromFile("library.txt");

        Scanner scanner = new Scanner(System.in);
        int choice = -1;

        while (choice != 0) {
            System.out.println("----- Library Management System -----");
            System.out.println("1. Add a book");
            System.out.println("2. Search for books");
            System.out.println("3. Check out a book");
            System.out.println("4. Return a book");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline character
                System.out.println();

                switch (choice) {
                    case 1:
                        System.out.print("Enter the title of the book: ");
                        String title = scanner.nextLine();
                        System.out.print("Enter the author of the book: ");
                        String author = scanner.nextLine();
                        library.addBook(title, author);
                        System.out.println("Book added successfully.\n");
                        break;
                    case 2:
                        System.out.print("Enter the search keyword: ");
                        String keyword = scanner.nextLine();
                        library.searchBook(keyword);
                        System.out.println();
                        break;
                    case 3:
                        System.out.print("Enter the title of the book to check out: ");
                        String checkoutTitle = scanner.nextLine();
                        library.checkoutBook(checkoutTitle);
                        System.out.println();
                        break;
                    case 4:
                        System.out.print("Enter the title of the book to return: ");
                        String returnTitle = scanner.nextLine();
                        library.returnBook(returnTitle);
                        System.out.println();
                        break;
                    case 0:
                        // Saving books to a file
                        library.saveBooksToFile("library.txt");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.\n");
                }
            } else {
                System.out.println("Invalid input. Please try again.\n");
                scanner.nextLine(); // Consume invalid input
            }
        }

        scanner.close();
    }
}

