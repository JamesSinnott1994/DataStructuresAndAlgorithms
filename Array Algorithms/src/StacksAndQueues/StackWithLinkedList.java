package StacksAndQueues;

public class StackWithLinkedList {

    private StackNode head;
    private int size;

    public StackWithLinkedList() {
        this.head = null;
        this.size = 0;
    }

    public void push(char value) {
        StackNode newNode = new StackNode(value);
        if (head != null) {
            newNode.next = head;
        }
        head = newNode;
        size++;
    }

    public char pop() {
        if (isEmpty()) {
            return ' ';
        }
        char popped = head.value;
        head = head.next;
        size--;
        return popped;
    }

    public char peek() {
        if (isEmpty()) {
            return ' ';
        }
        return head.value;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

}

class StackNode {
    char value;
    StackNode next;
    StackNode(char value) {
        this.value = value;
        this.next = null;
    }
}
