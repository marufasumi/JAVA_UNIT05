package part_02;

public class Queue {
    private int maxSize;
    private char[] queueArray;
    private int front;
    private int rear;
    private int currentSize;

    public Queue(int size) {
        maxSize = size;
        queueArray = new char[maxSize];
        front = 0;
        rear = -1;
        currentSize = 0;
    }

    public void enqueue(char value) {
        if (isFull()) {
            throw new RuntimeException("Queue is full");
        }
        rear = (rear + 1) % maxSize;
        queueArray[rear] = value;
        currentSize++;
    }

    public char dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        char value = queueArray[front];
        front = (front + 1) % maxSize;
        currentSize--;
        return value;
    }

    public char peek() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return queueArray[front];
    }

    public boolean isEmpty() {
        return currentSize == 0;
    }

    public boolean isFull() {
        return currentSize == maxSize;
    }
}
