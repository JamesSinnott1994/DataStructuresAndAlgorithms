package StacksAndQueues;

public class QueueWithLinkedList {
    Node front;
    Node rear;
    int length;

    public QueueWithLinkedList() {
        this.front = null;
        this.rear = null;
        this.length = 0;
    }

    public void enqueue(char element) {
        Node newNode = new Node(element);
        if (this.rear == null) {
            this.front = this.rear = newNode;
            length++;
            return;
        }
        this.rear.next = newNode;
        this.rear = newNode;
        length++;
    }

    public char dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return ' ';
        }
        Node temp = this.front;
        this.front = temp.next;
        if (this.front == null) {
            this.rear = null;
        }
        length--;
        return temp.data;
    }

    public char peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return ' ';
        }
        return this.front.data;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public int size() {
        return length;
    }

    public void printQueue() {
        Node temp = this.front;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

class Node {
    char data;
    Node next;

    public Node(char data) {
        this.data = data;
        this.next = null;
    }
}
