package com.example.linkedlist;

public class SingleDriver {

    public static void main(String[] args) {
        LinkedList<String> linkedlist = new SinglyLinkedList<>();

        linkedlist.addFirst("First");
        linkedlist.addFirst("Second");
        linkedlist.addFirst("Third");
        linkedlist.addFirst("Fourth");
        linkedlist.addFirst("Fifth");

        System.out.println(linkedlist);
        linkedlist.addFirst("sisth");
        linkedlist.addFirst("seventh");
        linkedlist.addFirst("Eight");
        System.out.println(linkedlist);

        linkedlist.pollFirst();

        System.out.println(linkedlist);
    }
}
