package com.zipcodewilmington.singlylinkedlist;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList {

    class Node {
        Object number;
        Node next;

        public Node(Object number) {
            this.number = number;
            next = null;
        }
    }


    public Node head;
    public Node tail;

    public void add(Object number) {
        Node newNode = new Node(number);
        if (this.head == null) {
            this.head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
    }


    public void remove(int index) {
        Node current = this.head;
        Node prev = null;

        if (index == 0 && current != null) {
            this.head = current.next;
        }

        int counter = 0;

        while (current != null) {
            if (counter == index) {
                prev.next = current.next;
                break;
            } else {
                prev = current;
                current = current.next;
                counter++;
            }
        }
        if (current == null) {
            System.out.println("Was not found.");
        }
    }


    public boolean contains(Object key) {
        Node current = this.head;
        while (current != null) {
            if (current.number != key) {
                current = current.next;
            } else {
                return true;
            }
        }
        return false;
    }

    public Integer size() {
        Integer counter = 0;
        Node current = head;

        while (current != null) {
            counter++;
            current = current.next;
        }
        return counter;
    }


    public Integer find(int data) {
        Node current = this.head;
        int index = 0;

        while (current != null) {
            if (!current.number.equals(data)) {
                index++;
                current = current.next;
            } else {
                return index;
            }
        }
        return -1;
    }


    public Object get(int index) {
        Node current = this.head;
        int seek = 0;
        while (current != null) {
            if (seek == index) {
                return current.number;
            }
            seek++;
            current = current.next;
        }
        return -1;
    }


    public SinglyLinkedList copy() {
        SinglyLinkedList copied = new SinglyLinkedList();
        Node current = this.head;
        while( current != null) {
            copied.add(current.number);
            current = current.next;
        }
        return copied;
    }


    public void sort() {
        Node current = this.head;

        for (int i = 0; i < size(); i++) {
            while (current.next != null) {
                Node next = current.next;
                if ((Integer) current.number <= (Integer) next.number) {
                } else {
                    Object temp = current.number;
                    current.number = next.number;
                    next.number = temp;
                }
                current = current.next;
            }
        }

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
