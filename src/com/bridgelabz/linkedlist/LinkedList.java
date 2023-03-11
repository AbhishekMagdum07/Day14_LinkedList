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
    //Uc3 = Create Linked list by using Append or AddLast method.
    public void addLast(Object data) {
        Node newNode = new Node(data); // create object of Node and pushing data.
        if (head == null) {
            head = newNode;     // if linkedList is empty then new node will be head.
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;  // traversing the temp till end of the list.
        }
        temp.next = newNode;   // adding node at end of the list.
    }

    //Uc5 = Delete the first node of linked list.
    public void deleteFirst() {
        if(head == null){
            System.out.println("Your Linked List is Empty");
            return;
        }
        head = head.next;     // Deleting first node of Liked List by switching position of Head.
    }


    // Display the methods.
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
        list.addLast(56);
        list.addLast(30);
        list.addLast(70);
        list.deleteFirst();
        list.print();
    }
}
