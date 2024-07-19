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

}
