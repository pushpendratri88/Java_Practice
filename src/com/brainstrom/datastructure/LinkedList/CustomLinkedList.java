package com.brainstrom.datastructure.LinkedList;

public class CustomLinkedList {
    Node head = null;
    static class Node{
        String data;
        Node next ;

        public Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head =  newNode;
            return;
        }
        Node current =  head;
        while(current.next != null){
            current =  current.next;
        }
         current.next = newNode;
    }
    public void addFirst(String data){
        Node newNode =  new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;

    }
    public void deleteLast(){
        if(head == null){
            System.out.println("List is empty");
        }
        if(head.next == null){
            head = null;
            return;
        }

        Node secondLastNode = head;
        Node lastNode = head.next;
        while(lastNode.next != null){
            lastNode = lastNode.next;
            secondLastNode = secondLastNode.next;
        }
        secondLastNode.next = null;


    }
    public void deleteFirst(){
        if(head == null){
            System.out.println("List is Empty");
        }
        head = head.next;

    }

    public void reverseNode(){
        Node prevNode = null;
        Node currentNode = head;

        while(currentNode != null){
            Node temp = currentNode.next;
            currentNode.next = prevNode;

           prevNode = currentNode;
           currentNode =  temp;
        }
        head = prevNode;
    }

    public void sortLinkedList(){
        
    }

    public void sortLinkedListDesc(){

    }

    public void print(){
        Node current = head;
        while(current != null){
            System.out.print(current.data + " --> ");
            current  = current.next;
        }
        System.out.println( "Null");

    }
    public static void main(String[] args) {
        CustomLinkedList ll =  new CustomLinkedList();
        ll.addLast("3");
        ll.addLast("11");
        ll.addLast("4");
        ll.addLast("8");
        ll.addLast("15");
        ll.print();

        ll.addFirst("20");
        ll.print();

        ll.deleteLast();
        ll.print();

        ll.deleteFirst();
        ll.print();

        ll.reverseNode();
        ll.print();

    }
}
