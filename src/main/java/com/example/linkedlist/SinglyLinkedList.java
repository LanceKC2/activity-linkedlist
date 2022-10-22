package com.example.linkedlist;

import java.util.StringJoiner;

public class SinglyLinkedList <E> implements LinkedList<E>{

    private Node head;
    private Node tail;

    public String toString(){
        StringBuilder builder = new StringBuilder("[");
        StringJoiner joiner = new StringJoiner(", ");
        Node current = head;

        while(current != null){
            joiner.add(current.element.toString());
            current = current.next;
        }

        builder.append(joiner);
        builder.append("]");

        return builder.toString();
    }

    public void addFirst(E element) {


        Node node = new Node(element, head); //1&2

        if(head == null){
            head = node; // step 3
            tail = head;
        }else{
            head = node; // also step 3
        }
    }

    public void addLast(E element) {
        Node node = new Node(element, null); //1&2

        if(tail == null){
            tail = node;
            head = tail;
        }else{
            tail.next = node;
            tail = node;

        }
    }

    public E pollFirst() {
        E element;
        if (head == null){
            element = null;
        }else{

            element = head.element;

            Node next = head.next;
            head.next = null;
            head = next;
        }
        return element;
    }

    public E pollLast() {
        E element;
        if (tail == null) {
            element = null;
        } else {
            element = tail.element;

            if (head == tail)
            {
                head = null;
                tail = null;
            }else{
                Node current = head;
                Node previous = head;
                while (current.next != null) { //2
                    previous = current;
                    current = current.next;
                }
                tail = previous;
                tail.next = null;
            }

        }

        return element;
    }


    public E peekFirst() {
        return head.element;
    }

    public E peekLast() {
        return tail.element;
    }

    public void clear() {

    }

    public boolean contains(E element) {
        return false;
    }

    private class Node{

        Node next;
        E element;

        public Node(E element, Node next){
            this.element = element;
            this.next = next;
        }
    }
}
