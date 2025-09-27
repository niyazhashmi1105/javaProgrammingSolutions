package com.java.datastructure;

import lombok.Getter;

public class LinkedList {

    @Getter
    private final int data;
    LinkedList next;

    public LinkedList(int data){
        super();
        this.data = data;
    }

    public static void main(String[] args) {
        LinkedList head = new LinkedList(10);
        head.next = new LinkedList(20);
        head.next.next = new LinkedList(30);
        traverseLinkedList(head);
    }

    public static void traverseLinkedList(LinkedList head){
        LinkedList current = head;
        while(current != null){
            System.out.print(current.getData()+" ");
            current = current.next;
        }
    }
}
