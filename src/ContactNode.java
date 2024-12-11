// Node class to represent each contact in the phone book
class ContactNode {
    String name;
    String phoneNumber;
    ContactNode next;

    public ContactNode(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.next = null;
    }
}

