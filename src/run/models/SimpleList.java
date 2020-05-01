package models;

public class SimpleList {

    private Node head;

    public void add(String element) {
        if (head != null) {
            Node aux = head;
            while (aux.getNext() != null) {
                aux = aux.getNext();
            }
            aux.setNext(new Node(element));
        } else {
            head = new Node(element);
        }
    }

    public void recorrer(IRecorrer iRecorrer) {
        Node aux = head;
        while(aux != null) {
            if (iRecorrer.doSometing(aux.getElement())) {
                break;
            }
            aux = aux.getNext();
        }
    }
}