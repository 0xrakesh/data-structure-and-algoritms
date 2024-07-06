package utils;

public class Queue {
    private final int[] queueArray;
    private final int size;
    private int front;
    private int rear;
    public Queue(int maxSize) {
        size = maxSize;
        front = -1;
        rear = -1;
        queueArray = new int[size];
    }
    
    public void insert(int data) {
        if(rear < size-1) queueArray[++rear] = data;
        else System.out.println("Queue is full");
    }
    
    public boolean isEmpty() {
        if(front > rear-1 || rear == -1) return true;
        else return false;
    }
    
    public boolean isFull() {
        return (rear >= size-1);
    }
    
    public int remove() {
        if(isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        else {
            return queueArray[++front];
        }
    }
    
    public void display() {
        System.out.print("Queue nodes : ");
        for(int i=rear;i>front;i--) System.out.print(" | "+queueArray[i]);
        if(rear>front)
            System.out.println(" |");
    }
}
