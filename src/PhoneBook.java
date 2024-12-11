
// PhoneBook class to manage the linked list
class PhoneBook {
    private ContactNode head;

    public PhoneBook() {
        this.head = null;
    }

    // Add a contact to the phone book
    public void addContact(String name, String phoneNumber) {
        ContactNode newContact = new ContactNode(name, phoneNumber);
        if (head == null) {
            head = newContact;
        } else {
            ContactNode temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newContact;
        }
        System.out.println("Contact added: " + name + " - " + phoneNumber);
    }

    
    // Display all contacts in the phone book
    public void displayContacts() {
        if (head == null) {
            System.out.println("Phone book is empty.");
            return;
        }
        ContactNode temp = head;
        while (temp != null) {
            System.out.println("Name: " + temp.name + ", Phone: " + temp.phoneNumber);
            temp = temp.next;
        }
    }

    
    // Search for a contact by name
    public void searchContact(String name) {
        ContactNode temp = head;
        while (temp != null) {
            if (temp.name.equalsIgnoreCase(name)) {
                System.out.println("Contact found: " + temp.name + " - " + temp.phoneNumber);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Contact not found: " + name);
    }

    
    // Delete a contact by name
    public void deleteContact(String name) {
        if (head == null) {
            System.out.println("Phone book is empty.");
            return;
        }

        // If the contact to delete is the head
        if (head.name.equalsIgnoreCase(name)) {
            System.out.println("Contact deleted: " + head.name);
            head = head.next;
            return;
        }

        ContactNode temp = head;
        while (temp.next != null && !temp.next.name.equalsIgnoreCase(name)) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Contact not found: " + name);
        } else {
            System.out.println("Contact deleted: " + temp.next.name);
            temp.next = temp.next.next;
        }
    }
}

