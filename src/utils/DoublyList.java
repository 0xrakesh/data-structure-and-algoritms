package utils;

public class DoublyList {
    static class Node {
        int data;
        Node next;
        Node prev;
        Node(int d) {
            data = d;
            next = null;
            prev = null;
        }
    }

    static Node head;

    public void insert(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
        }
        else {
            Node cur = head;
            while(cur.next != null) cur = cur.next;
            cur.next = newNode;
            newNode.prev = cur;
        }
    }

    public int delete(int data) {
        if(head.next != null && head.data == data) {
            head = head.next;
            head.prev = null;
        }
        else {
            Node cur = head;
            Node prev = null;
            while(cur.next != null && cur.data != data) {
                prev = cur;
                cur = cur.next;
            }
            if(cur.next == null || prev==null) {
                System.out.println("Not found");
                return -1;
            }
            prev.next = cur.next;
            cur.next.prev = prev;
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

    public void reverseprint() {
        Node cur = head;
        System.out.print("Reverse Node:");
        while(cur.next != null) cur = cur.next;
        while(cur.prev != null) {
            System.out.print(cur.data+"->");
            cur = cur.prev;
        }
        System.out.println(cur.data);
    }
}
