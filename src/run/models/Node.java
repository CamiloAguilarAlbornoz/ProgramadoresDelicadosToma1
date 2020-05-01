package models;

public class Node {

    private String element;
    private Node next;

    public Node(String element) {
        this.element = element;
    }

    public String getElement() {
        return this.element;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}