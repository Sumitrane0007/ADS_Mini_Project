import java.util.Scanner;

public class PhoneBookApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PhoneBook phoneBook = new PhoneBook(); // Assuming PhoneBook class exists with required methods
        
        int value;
        String phoneNo;
        String name;

        do {
            System.out.println("What you want to do with Contact List?");
            System.out.println("1. Add Contact");
            System.out.println("2. Search Contact");
            System.out.println("3. Delete Contact");
            System.out.println("4. Display Contact");
            System.out.println("0. Exit");
            
            
            System.out.print("Enter your choice: ");
            value = sc.nextInt();
            System.out.println();

            switch (value) {
                case 1:
                    System.out.print("Enter person name: ");
                    name = sc.next();
                    System.out.println();

                    System.out.print("Enter person phone no: ");
                    phoneNo = sc.next();

                    phoneBook.addContact(name, phoneNo);
                    break;

                case 2:
                    System.out.print("Enter person name to search: ");
                    name = sc.next();

                    phoneBook.searchContact(name);
                    break;

                case 3:
                    System.out.print("Enter person name to delete: ");
                    name = sc.next();

                    phoneBook.deleteContact(name);
                    break;

                case 4:
                    phoneBook.displayContacts();
                    break;

                case 0:
                    System.out.println("Thank you for using Phonebook app!");
                    return;

                

                default:
                    System.out.println("Invalid input");
            }
            System.out.println();
        } while (value != 6);
        
        sc.close();
    }
}
