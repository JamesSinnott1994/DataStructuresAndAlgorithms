package StacksAndQueues;

public class Queue {

    char[] queue;
    int front;
    int size;
    int capacity;

    public Queue(int capacity) {
        this.capacity = capacity;
        this.queue = new char[capacity];
        this.front = 0;
        this.size = 0;
    }

    public void enqueue(char element) {
        if (size == capacity) {
            System.out.println("Queue is full");
            return;
        }
        queue[(front + size) % capacity] = element;
        size++;
    }

    public char dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return '\u0000'; // Null character
        }
        char item = queue[front];
        front = (front + 1) % capacity;
        size--;
        return item;
    }

    public char peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return '\u0000'; // Null character
        }
        return queue[front];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void printQueue() {
        System.out.print("Queue: ");
        for (int i = 0; i < size; i++) {
            System.out.print(queue[(front + i) % capacity] + " ");
        }
        System.out.println();
    }
}
