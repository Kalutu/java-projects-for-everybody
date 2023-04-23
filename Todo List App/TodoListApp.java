import java.util.ArrayList;
import java.util.Scanner;

public class TodoListApp {
    public static void main(String[] args) {
        ArrayList<String> todoList = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("====Todo List====");
            for (int i = 0; i < todoList.size(); i++) {
                System.out.println((i+1) + ". " + todoList.get(i));
            }
            System.out.println("=================");
            System.out.println("1. Add item");
            System.out.println("2. Remove item");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume the newline character
            
            if (choice == 1) {
                System.out.print("Enter item to add: ");
                String item = scanner.nextLine();
                todoList.add(item);
                System.out.println("Item added!");
            } else if (choice == 2) {
                System.out.print("Enter item number to remove: ");
                int itemNum = scanner.nextInt();
                scanner.nextLine(); // consume the newline character
                if (itemNum > 0 && itemNum <= todoList.size()) {
                    todoList.remove(itemNum-1);
                    System.out.println("Item removed!");
                } else {
                    System.out.println("Invalid item number.");
                }
            } else if (choice == 3) {
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
        
        System.out.println("Exiting Todo List App.");
        scanner.close();
    }
}

