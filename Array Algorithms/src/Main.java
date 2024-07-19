import LinkedLists.Node;

public class Main {

    public static void main(String[] args) {
        //createDoublyLinkedList();
        traverseAndPrintRun();
    }

    public static void createLinkedList() {

        Node node1 = new Node(3);
        Node node2 = new Node(5);
        Node node3 = new Node(13);
        Node node4 = new Node(2);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        Node currentNode = node1;
        while (currentNode != null) {
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next;
        }
        System.out.println("null");

    }

    public static void createDoublyLinkedList() {

        Node node1 = new Node(3);
        Node node2 = new Node(5);
        node1.next = node2;
        node2.prev = node1;

        Node node3 = new Node(13);
        node2.next = node3;
        node3.prev = node2;

        Node node4 = new Node(2);
        node3.next = node4;
        node4.prev = node3;

        Node currentNode = node1;
        System.out.print("Forward: ");
        while (currentNode != null) {
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next;
        }
        System.out.println("null");

        currentNode = node4;
        System.out.print("Backward: ");
        while (currentNode != null) {
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.prev;
        }
        System.out.println("null");


    }

    public static void createCircularSinglyLinkedList() {
        Node node1 = new Node(3);
        Node node2 = new Node(5);
        Node node3 = new Node(13);
        Node node4 = new Node(2);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node1;  // Circular link

        Node currentNode = node1;
        Node startNode = node1;
        System.out.print(currentNode.data + " -> ");
        currentNode = currentNode.next;

        while (currentNode != startNode) {
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next;
        }

        System.out.println("...");  // Indicating the list loops back
    }

    public static void traverseAndPrintRun() {
        Node node1 = new Node(7);
        Node node2 = new Node(11);
        Node node3 = new Node(3);
        Node node4 = new Node(2);
        Node node5 = new Node(9);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        System.out.println("Before deletion:");
        traverseAndPrint(node1);

        //System.out.println("The lowest value in the linked list is: " + findLowestValue(node1));

        //node1 = deleteSpecificNode(node1, node4);

        // Insert a new node with value 97 at position 2
        Node newNode = new Node(97);
        node1 = insertNodeAtPosition(node1, newNode, 2);

        System.out.println("\nAfter deletion:");
        traverseAndPrint(node1);
    }

    public static void traverseAndPrint(Node head) {
        Node currentNode = head;
        while(currentNode != null) {
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next;
        }
        System.out.println("null");
    }

    public static int findLowestValue(Node head) {
        int minValue = head.data;
        Node currentNode = head.next;
        while (currentNode != null) {
            if (currentNode.data < minValue) {
                minValue = currentNode.data;
            }
            currentNode = currentNode.next;
        }
        return minValue;
    }

    public static Node deleteSpecificNode(Node head, Node nodeToDelete) {

        if (head == nodeToDelete) {
            return head.next;
        }

        Node currentNode = head;
        while (currentNode.next != null && currentNode.next != nodeToDelete) {
            currentNode = currentNode.next;
        }

        if (currentNode.next == null) {
            return head;
        }

        currentNode.next = currentNode.next.next;

        return head;
    }

    public static Node insertNodeAtPosition(Node head, Node newNode, int position) {
        if (position == 1) {
            newNode.next = head;
            return newNode;
        }

        Node currentNode = head;
        for (int i = 1; i < position - 1 && currentNode != null; i++) {
            currentNode = currentNode.next;
        }

        if (currentNode != null) {
            newNode.next = currentNode.next;
            currentNode.next = newNode;
        }
        return head;
    }

}
