package LinkedList;

class LinkedList {

    // Node
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    // Insert at beginning
    void insertAtBeginning(int data) {
        Node newNode = new Node(data);

        newNode.next = head;
        head = newNode;
    }

    // Insert at end
    void insertAtEnd(int data) {
        Node newNode = new Node(data);

        // If list is empty
        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    // Insert at specific position
    // Position starts from 1
    void insertAtPosition(int data, int position) {

        if (position == 1) {
            insertAtBeginning(data);
            return;
        }

        Node newNode = new Node(data);
        Node temp = head;

        // Go to node before the required position
        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }

        // Invalid position
        if (temp == null) {
            System.out.println("Invalid position");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Display linked list
    void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("NULL");
    }

    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        // Beginning
        list.insertAtBeginning(20);
        list.insertAtBeginning(10);

        // End
        list.insertAtEnd(30);
        list.insertAtEnd(40);

        // Specific position
        list.insertAtPosition(25, 3);

        list.display();
    }
}
