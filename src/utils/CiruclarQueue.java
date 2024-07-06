package utils;

public class CiruclarQueue {
    private int size;
    private int[] queueList;
    private int front;
    private int rear;
    private boolean reset;

    public CiruclarQueue(int maxSize) {
        size=maxSize;
        front = -1;
        rear = -1;
        queueList = new int[size];
    }

    public boolean isEmpty() {
        return (rear==-1 || front == rear-1);
    }

    public boolean isFull() {
        return (rear>=size);
    }

    public void insert(int data) {
        if(isFull()) {
            System.out.println("Queue is Full");
            return;
        }
        if(rear==size-1) {
            rear = -1;
            reset = true;
        }
        queueList[++rear] = data;
    }

    public void remove() {
        if(isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        else {
            System.out.println("Removed element : " + queueList[++front]);
        }
    }

    public void display() {
        System.out.print("Queue :");
        int start = reset ? size-1 : rear;
        int end = reset?-1:front;
        for(int i=start;i>end;i--) System.out.print(" | "+queueList[i]);
        if(front<rear) System.out.println(" |");
    }

}
