package utils;

public class SinglyList {
    static class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
        }
    }

    static Node head;

    public void insert(int data) {
        Node newNode = new Node(data);
        if(head==null) {
            head = newNode;
            newNode.next = null;
        }
        else {
            Node cur = head;
            while(cur.next != null) cur=cur.next;
            cur.next = newNode;
        }
    }

    public int remove(int data) {
        if(head.next != null && head.data == data) head = head.next;
        else {
            Node cur = head;
            Node prev = null;
            while(cur.next != null && cur.data != data) {
                prev = cur;
                cur = cur.next;
            }
            if(cur == null || prev == null) {
                System.out.println("Not found");
                return -1;
            }
            prev.next = cur.next;
        }
        return data;
    }

    public void print() {
        Node cur = head;
        System.out.print("Nodes:");
        while(cur.next != null) {
            System.out.print(cur.data+"->");
            cur = cur.next;
        }
        System.out.println(cur.data);
    }
}
