package utils;

public class Stack {
    private final int size;
    private final int[] stackArray;
    private int top;
    public Stack(int maxSize) {
        size = maxSize;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int data) {
        if(top < size-1) stackArray[++top] = data;
        else System.out.println("Stack overflow. Can't add element "+data);
    }

    public int pop() {
        if(top <= -1) {
            System.out.println("Stack underflow");
            return -1;
        }
        else {
            return stackArray[top--];
        }
    }

    public void display() {

        System.out.println("First element ----------------- Last element");
        for(int i=top;i>=0;i--) System.out.print("|"+stackArray[i]);
        System.out.println("|\n");
    }
}
