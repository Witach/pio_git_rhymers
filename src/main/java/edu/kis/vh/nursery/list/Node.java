package edu.kis.vh.nursery.list;
final class Node {

     private int value;
     private Node prev;
    private Node next;

     Node(int i) {
         this.value = i;
    }

    public int getValue() {
        return value;
    }


    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
