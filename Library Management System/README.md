# Library Management System
The Library Management System is a basic Java application that allows users to manage a library by adding books, searching for books, checking out books, and returning books. The book details are stored in a file.

## Features
- Add a book: Users can add a new book to the library by providing the title and author.
- Search for books: Users can search for books by entering a keyword. The system will display a list of books matching the keyword.
- Check out a book: Users can check out a book by specifying its title. If the book is available, it will be marked as checked out.
- Return a book: Users can return a checked-out book by specifying its title. The book will be marked as available.

## Usage
1. Compile the Java source code: `javac LibraryManagementSystem.java`
2. Run the application: `java LibraryManagementSystem`
3. Follow the prompts in the command-line interface to interact with the Library Management System.
4. Enter `0` to exit the application. The book details will be automatically saved to the file.

## File Storage
The book details are stored in a file named `library.txt`. The file follows a comma-separated format where each line represents a book and contains the title, author, and checkout status (true/false).

To customize the file name or location, modify the code in `Library.java` where the `saveBooksToFile()` and `loadBooksFromFile()` methods are called.

## Note
This implementation is a basic version of a library management system and does not include advanced features such as user authentication, database integration, or error handling. It serves as a starting point that can be enhanced and customized as per specific requirements.

Feel free to modify and extend the code to suit your needs.

## Contributing
Contributions are welcome! If you find any issues or have suggestions for improvement, please open an issue or submit a pull request.

## Credits
This project is created by Kalutu Daniel.



