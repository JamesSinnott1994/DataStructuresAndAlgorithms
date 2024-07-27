import HashTables.HashTables;
import LinkedLists.Node;
import StacksAndQueues.Queue;
import StacksAndQueues.Stack;

import java.util.LinkedList;

import static HashTables.HashTables.hashFunction;
import static HashTables.HashSets.runHashSetFunctionality;
import static HashTables.HashMaps.runHashMapFunctionality;


public class Main {

    public static void main(String[] args) {
        //createDoublyLinkedList();
        //traverseAndPrintRun();
        //callStackFunctionality();
        //callQueueFunctionality();
        //callHashSetFunctionality();
        callHashMapFunctionality();
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

    /* Stacks and Queues */

    public static void callStackFunctionality() {
        Stack myStack = new Stack(10);

        myStack.push('A');
        myStack.push('B');
        myStack.push('C');

        // Print initial stack
        System.out.print("Stack: ");
        myStack.printStack();

        System.out.println("Pop: " + myStack.pop());
        System.out.println("Peek: " + myStack.peek());
        System.out.println("isEmpty: " + myStack.isEmpty());
        System.out.println("Size: " + myStack.size());
    }

    public static void callQueueFunctionality() {
        Queue myQueue = new Queue(10);

        myQueue.enqueue('A');
        myQueue.enqueue('B');
        myQueue.enqueue('C');
        myQueue.printQueue();

        System.out.println("Dequeue: " + myQueue.dequeue());

        System.out.println("Peek: " + myQueue.peek());

        System.out.println("isEmpty: " + myQueue.isEmpty());

        System.out.println("Size: " + myQueue.size());
    }

    /* Stacks and Queues */

    /* Hash Tables */

    public static void callHashTableFunctionality() {
        String value = "Bob";
        System.out.println("'" + value + "' has hash code: " + hashFunction(value));

        // System.out.println("'Pete' is in the Hash Set: " + HashTables.contains("Pete"));

        LinkedList<String>[] myHashSet = new LinkedList[10];

        for (int i = 0; i < myHashSet.length; i++) {
            myHashSet[i] = new LinkedList<>();
        }

        HashTables.add("Jones", myHashSet);
        HashTables.add("Lisa", myHashSet);
        HashTables.add("Bob", myHashSet);
        HashTables.add("Siri", myHashSet);
        HashTables.add("Pete", myHashSet);
        HashTables.add("Stuart", myHashSet);

        for (LinkedList<String> bucket : myHashSet) {
            System.out.println(bucket);
        }
        System.out.println("Contains Stuart: " + HashTables.contains("Stuart", myHashSet));


    }

    public static void callHashSetFunctionality() {
        runHashSetFunctionality();
    }

    public static void callHashMapFunctionality() {
        runHashMapFunctionality();
    }

    /* Hash Tables */

}
