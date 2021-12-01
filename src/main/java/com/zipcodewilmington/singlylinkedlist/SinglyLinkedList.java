package com.zipcodewilmington.singlylinkedlist;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList<T> {

    private Node<T> head;
    private Node<T> tail;

    private class Node<T> {

        private T data;
        private Node<T> next;

        public Node() {

        }

        public Node(T data, Node<T> next) {
            this.data = data;
            this.next = next;
        }

        public Node(T data) {
            this.data = data;
        }
    }

//        Object number;
//        Node next;
//
//        public Node(Object number) {
//            this.number = number;
//            next = null;
//        }
//    }
//
//
//    public Node head;
//    public Node tail;

    public void add(T data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }


//        Node newNode = new Node(number);
//        if (this.head == null) {
//            this.head = newNode;
//        } else {
//            tail.next = newNode;
//        }
//        tail = newNode;
    }


    public void remove(int index) {

        // given index to remove
        // iterate through singly linked list
        Node<T> currentNode = head, previousNode = null;
        int currentIndex = 0;
        // check if the current node exists

        while (currentNode != null && currentIndex != index) {
            // keeping track of the prev node
            previousNode = currentNode;
            // continuing the iteration
            currentNode = currentNode.next;
            // iterate through the next node
            currentIndex++;
        }
        //remove the index
        if (currentIndex == index) {
            if (previousNode != null) {
                // add the previous node to the node after
                previousNode.next = currentNode.next;
            }
            // checking if the current node is the head
            if (currentNode == head) {
                // and also if the current node is null
                if (currentNode == null || currentNode.next == null) {
                    // return head as null;
                    head = null;
                } else {
                    // the head is the current head
                    head = currentNode.next;
                }
            }
            // current is the tail
            else if (currentNode == tail) {
                // then adjust the tail to the previous node
                tail = previousNode;
            }
        }


//        Node current = this.head;
//        Node prev = null;
//
//        if (index == 0 && current != null) {
//            this.head = current.next;
//        }
//
//        int counter = 0;
//
//        while (current != null) {
//            if (counter == index) {
//                prev.next = current.next;
//                break;
//            } else {
//                prev = current;
//                current = current.next;
//                counter++;
//            }
//        }
//        if (current == null) {
//            System.out.println("Was not found.");
//        }
    }


    public boolean contains(T element) {


        Node<T> currentNode = head, previousNode = null;
//        int currentIndex = 0;

        while (currentNode != null) {
            if (currentNode.data != element) {
                currentNode = currentNode.next;
            } else {
                return true;
            }
        }
        return false;


//        Node current = this.head;
//        while (current != null) {
//            if (current.number != key) {
//                current = current.next;
//            } else {
//                return true;
//            }
//        }
//        return false;
//    }
//
//    public Integer size() {
//        Integer counter = 0;
//        Node current = head;
//
//        while (current != null) {
//            counter++;
//            current = current.next;
//        }
//        return counter;
    }


    public Integer find(T element) {


        int currentIndex = 0;
        Node<T> currentNode = head;

        while (currentNode != null) {
            if (currentNode.data != element) {
                currentNode = currentNode.next;
                currentIndex++;
            }
            if (currentNode.data == element) {
                return currentIndex;
            }
        }
        return -1;


//        Node current = this.head;
//        int index = 0;
//
//        while (current != null) {
//            if (!current.number.equals(data)) {
//                index++;
//                current = current.next;
//            } else {
//                return index;
//            }
//        }
//        return -1;
    }


    public Object get(int index) {


        int currentIndex = 0;
        Node<T> currentNode = head;

        while (currentNode != null && currentIndex != index) {
            currentNode = currentNode.next;
            currentIndex++;
        }
        if (currentIndex == index && currentNode != null) {
            return currentNode.data;
        }
        return null;


//        Node current = this.head;
//        int seek = 0;
//        while (current != null) {
//            if (seek == index) {
//                return current.number;
//            }
//            seek++;
//            current = current.next;
//        }
//        return -1;
    }


    public SinglyLinkedList copy() {


//        SinglyLinkedList copied = new SinglyLinkedList();
//        Node current = this.head;
//        while( current != null) {
//            copied.add(current.number);
//            current = current.next;
//        }
//        return SinglyLinkedList;
        return null;
    }


    public void sort() {


//        Node current = this.head;
//
//        for (int i = 0; i < size(); i++) {
//            while (current.next != null) {
//                Node next = current.next;
//                if ((Integer) current.number <= (Integer) next.number) {
//                } else {
//                    Object temp = current.number;
//                    current.number = next.number;
//                    next.number = temp;
//                }
//                current = current.next;
//            }
//        }

    }

    public int size() {

            int currentIndex = 0;
            Node<T> currentNode = head;

            while (currentNode != null) {
                currentNode = currentNode.next;
                currentIndex++;
            }

            return currentIndex;
        }
//    public static void main(String[] args) {
//        LinkedList linky = new LinkedList();
//
//        linky.add("John");
//        linky.add("Ellis");
//        linky.add(34);
//        linky.add("05-22-1987");
//        linky.add(true);
//        linky.add("The GOAT");
//        linky.remove(4);
////        System.out.println(linky.subList(1, 4)); // sublist w elements 1, 2, 3
////        System.out.println(linky.peek()); // shows first element
////        linky.addFirst("1987");
////        System.out.println(linky.peek());
//        System.out.println(linky);
//
//        Iterator it = linky.iterator(); // making an iterator using linky
//
//
//    }
}
