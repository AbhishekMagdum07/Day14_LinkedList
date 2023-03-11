package com.bridgelabz.linkedlist;
public class LinkedList {
    Node head;
    class Node {
        Object data;
        Node next;
        Node(Object data) {
            this.data = data;
            this.next = null;
        }
    }

    //Uc1 = Create simple Linded List.
    public void simpleLinkedList(Object data) {
        Node newNode = new Node(data); // create object of Node and pushing data.
        if (head == null) {
            head = newNode;     // if linkedList is empty then new node will be head.
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;  // traversing the temp till end of the list.
        }
        temp.next = newNode;
    }

    public void print() {
        if (head == null) {
            System.out.println("Linked List is Empty.");
            return;
        }
        Node temp = head;        // taking temp as a temporary variable to keep head as a constant.
        while (temp != null) {

            System.out.print(temp.data + " => "); // It will print all the data in the list.
            temp = temp.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.simpleLinkedList(56);
        list.simpleLinkedList(30);
        list.simpleLinkedList(70);
        list.print();
    }
}
