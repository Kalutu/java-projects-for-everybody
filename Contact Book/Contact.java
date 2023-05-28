import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Contact {
    private String name;
    private String phoneNumber;
    private String email;

    public Contact(String name, String phoneNumber, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

class ContactBook {
    private List<Contact> contacts;

    public ContactBook() {
        this.contacts = new ArrayList<>();
    }

    public void addContact(String name, String phoneNumber, String email) {
        Contact contact = new Contact(name, phoneNumber, email);
        contacts.add(contact);
        System.out.println("Contact added successfully.");
    }

    public void viewContacts() {
        if (contacts.isEmpty()) {
            System.out.println("Contact book is empty.");
        } else {
            System.out.println("Contact List:");
            for (int i = 0; i < contacts.size(); i++) {
                Contact contact = contacts.get(i);
                System.out.println((i + 1) + ". Name: " + contact.getName() +
                        ", Phone: " + contact.getPhoneNumber() +
                        ", Email: " + contact.getEmail());
            }
        }
    }

    public void editContact(int index, String name, String phoneNumber, String email) {
        if (index >= 0 && index < contacts.size()) {
            Contact contact = contacts.get(index);
            contact.setName(name);
            contact.setPhoneNumber(phoneNumber);
            contact.setEmail(email);
            System.out.println("Contact updated successfully.");
        } else {
            System.out.println("Invalid contact index.");
        }
    }

    public void deleteContact(int index) {
        if (index >= 0 && index < contacts.size()) {
            Contact contact = contacts.remove(index);
            System.out.println("Contact deleted: " + contact.getName());
        } else {
            System.out.println("Invalid contact index.");
        }
    }
}

public class ContactBookProgram {
    public static void main(String[] args) {
        ContactBook contactBook = new ContactBook();
        Scanner scanner = new Scanner(System.in);
        int choice = -1;

        while (choice != 0) {
            System.out.println("----- Contact Book -----");
            System.out.println("1. Add a contact");
            System.out.println("2. View contacts");
            System.out.println("3. Edit a contact");
            System.out.println("4. Delete a contact");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline character
                System.out.println();

                switch (choice) {
                    case 1:
                        System.out.print("Enter the name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter the phone number: ");
                        String phoneNumber = scanner.nextLine();
                        System.out.print("Enter the email: ");
                        String email = scanner.nextLine();
                        contactBook.addContact(name, phoneNumber, email);
                        System.out.println();
                        break;
                    case 2:
                        contactBook.viewContacts();
                        System.out.println();
                        break;
                    case 3:
                        System.out.print("Enter the index of the contact to edit: ");
                        int editIndex = scanner.nextInt();
                        scanner.nextLine(); // Consume newline character
                        System.out.print("Enter the new name: ");
                        String newName = scanner.nextLine();
                        System.out.print("Enter the new phone number: ");
                        String newPhoneNumber = scanner.nextLine();
                        System.out.print("Enter the new email: ");
                        String newEmail = scanner.nextLine();
                        contactBook.editContact(editIndex - 1, newName, newPhoneNumber, newEmail);
                        System.out.println();
                        break;
                    case 4:
                        System.out.print("Enter the index of the contact to delete: ");
                        int deleteIndex = scanner.nextInt();
                        scanner.nextLine(); // Consume newline character
                        contactBook.deleteContact(deleteIndex - 1);
                        System.out.println();
                        break;
                    case 0:
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

