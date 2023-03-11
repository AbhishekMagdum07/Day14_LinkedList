package com.bridgelabz.linkedlist;

public class  LinkedList<T extends Comparable<T>> {
    Node<T> head;
    class Node<T> {
        T data;
        Node<T> next;
        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }
    // Uc10= Arrange all elements in ascending order using comparable method.
    public void nodesInAscendingOrder(T data) {
        Node<T> newNode = new Node<T>(data);

        if (head == null || data.compareTo(head.data) < 0) {
            newNode.next = head;
            head = newNode;
        } else {
            Node<T> temp = head;
            while (temp.next != null && data.compareTo(temp.next.data) > 0) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }

    // Display the methods.
    public void printElements() {
        if (head == null) {
            System.out.println("Linked List is Empty.");
            return;
        }
        Node<T> temp = head;        // taking temp as a temporary variable to keep head as a constant.
        while (temp != null) {

            System.out.print(temp.data + " => "); // It will print all the data in the list.
            temp = temp.next;
        }
        System.out.println("Null");
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.nodesInAscendingOrder(56);
        list.nodesInAscendingOrder(30);
        list.nodesInAscendingOrder(40);
        list.nodesInAscendingOrder(70);
        list.printElements();
    }
}
