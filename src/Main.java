import utils.SinglyList;
import utils.DoublyList;
import utils.CiruclarSingly;
import utils.CircularDoubly;
import utils.Stack;
import utils.Queue;
import utils.CiruclarQueue;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nSingly Link List");
        SinglyList singlet = new SinglyList();
        for(int i=1;i<6;i++) singlet.insert(i);
        singlet.print();
        int delete = singlet.remove(3);
        if(delete!=-1) {
            System.out.println("Successfully deleted node value : "+ delete);
            singlet.print();
        }

        System.out.println("\nDoubly Link List");
        DoublyList doublyList = new DoublyList();
        for(int i=1;i<11;i++) doublyList.insert(i);
        doublyList.print();
        int deleteEle =doublyList.delete(1);
        if(deleteEle!=-1) {
            System.out.println("Successfully deleted node value : "+deleteEle);
            doublyList.print();
        }
        doublyList.reverseprint();

        System.out.println("\nCircular Singly Link List");
        CiruclarSingly ciruclarSingly = new CiruclarSingly();
        for(int i=1;i<11;i++) ciruclarSingly.insert(i);
        ciruclarSingly.print();
        deleteEle = ciruclarSingly.delete(1);
        if(deleteEle!=-1) {
            System.out.println("Successfully deleted node value : "+deleteEle);
            ciruclarSingly.print();
        }
        deleteEle = ciruclarSingly.delete(10);
        if(deleteEle!=-1) {
            System.out.println("Successfully deleted node value : "+deleteEle);
            ciruclarSingly.print();
        }

        System.out.println("\nCircular Doubly Link List");
        CircularDoubly circularDoubly = new CircularDoubly();
        for(int i=1000;i<1044;i+=4) circularDoubly.insert(i);
        circularDoubly.print();
        deleteEle = circularDoubly.delete(1020);
        if(deleteEle!=-1){
            System.out.println("Successfully deleted node value : "+ deleteEle);
            circularDoubly.print();
        }
        circularDoubly.reverse();

        System.out.println("\nStack using array");
        Stack stack = new Stack(100);
        for(int i=10;i<21;i++) stack.push(i);
        stack.display();
        int data = stack.pop();
        if(data!=-1) {
            System.out.println("Pop element is "+data);
        }
        stack.display();

        System.out.println("\nQueue");
        Queue queue = new Queue(10);
        for(int i=1;i<6;i++) queue.insert(i);
        queue.display();
        System.out.println("Delete value : "+ queue.remove());
        queue.display();

        System.out.println("\nCircular Queue");
        CiruclarQueue ciruclarQueue = new CiruclarQueue(5);
        for(int i=1;i<6;i++) ciruclarQueue.insert(i);
        ciruclarQueue.display();
        ciruclarQueue.remove();
        ciruclarQueue.display();
        System.out.println("Adding more element with more than max size of queue.");
        for(int i=6;i<9;i++) ciruclarQueue.insert(i);
        ciruclarQueue.display();
    }
}