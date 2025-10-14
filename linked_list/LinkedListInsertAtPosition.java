// Node class representing a single node in the linked list
class Node {
    int data;
    Node next;

    // Constructor to initialize a node
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Linked List class
class LinkedList {
    Node head;
    Node tail;

    // Constructor to initialize an empty linked list
    public LinkedList() {
        this.head = null;
        this.tail = null;
    }

    // Method to insert a node at a specific position
    public void insertAtPosition(int data, int position) {
        Node newNode = new Node(data);

        // If inserting at the beginning
        if (position <= 1) { 
            newNode.next = head;
            head = newNode;
            if (tail == null) { // If list was empty, update tail
                tail = newNode;
            }
            return;
        }

        // Traverse to the (position - 1)th node
        Node temp = head;
        for (int i = 1; temp != null && i < position - 1; i++) {
            temp = temp.next;
        }

        // If position is beyond the last node
        if (temp == null) {
            System.out.println("Position out of range! Adding at the end.");
            if (tail != null) {
                tail.next = newNode;
            }
            tail = newNode;
            return;
        }

        // Insert the node at the specified position
        newNode.next = temp.next;
        temp.next = newNode;

        // If the new node is added at the end, update the tail
        if (newNode.next == null) {
            tail = newNode;
        }
    }

    // Method to print the linked list
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

// Main class to test the linked list operations
public class LinkedListInsertAtPosition {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        
        list.insertAtPosition(10, 1); // Insert at the beginning
        list.insertAtPosition(20, 2); // Insert at position 2
        list.insertAtPosition(30, 3); // Insert at position 3
        list.insertAtPosition(25, 3); // Insert at position 3 (between 20 and 30)
        list.insertAtPosition(5, 1);  // Insert at position 1 (new head)

        System.out.println("Linked List after insertions:");
        list.display();
    }
    
}
