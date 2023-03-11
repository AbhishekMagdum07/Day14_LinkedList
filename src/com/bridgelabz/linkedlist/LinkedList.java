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
    //Uc2 = Create Linked list by using add First method.
    public void addFirst(int data){
        Node newNode  = new Node(data);
        if (head == null) {                // first checking head is null or not
            head = newNode;                // if head is null then new node will be the head.
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    // Display the methods.
    public void print() {
        if (head == null) {
            System.out.println("Linked List is Empty.");
            return;
        }
        Node temp = head;               // taking temp as a temporary variable to keep head as a constant.
        while (temp != null) {

            System.out.print(temp.data + " => "); // It will print all the data in the list.
            temp = temp.next;
        }
        System.out.println("Null");
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst(70);
        list.addFirst(30);
        list.addFirst(56);
        list.print();
    }
}
