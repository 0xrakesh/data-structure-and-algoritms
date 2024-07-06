package utils;

public class CircularDoubly {
    static class Node{
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
            newNode.next = head;
            newNode.prev = head;
        }
        else {
            Node cur = head;
            while(cur.next != null && cur.next != head) cur = cur.next;
            cur.next = newNode;
            newNode.next = head;
            newNode.prev = cur;
            head.prev = newNode;
        }
    }

    public int delete(int data) {
        if(head.next != null && head.data == data) {
            Node last = head;
            while(last.next != head) last = last.next;
            head = head.next;
            head.prev = last;
            last.next = head;
        }
        else {
            Node cur = head;
            Node prev = null;
            while(cur.next != null && cur.next != head && cur.data != data) {
                prev = cur;
                cur = cur.next;
            }
            if(cur.next == null || prev == null) {
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
        System.out.print("Node : ");
        while(cur.next != null && cur.next != head) {
            System.out.print(cur.data+"->");
            cur = cur.next;
        }
        System.out.println(cur.data);
    }

    public void reverse() {
        Node cur = head;
        System.out.print("Reverse Node :");
        while(cur.next != null && cur.next != head) cur = cur.next;
        Node last = cur;
        while(cur.prev != null && cur.prev != last) {
            System.out.print(cur.data+"->");
            cur = cur.prev;
        }
        System.out.println(cur.data);
    }
}
