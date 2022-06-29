package dsa;

public class LinkedList {
    private Node first;
    private int size;

    public boolean isEmpty(){
        return first == null;
    }

    public int getSize() {
        return size;
    }

    public void addFirst(int input){
        Node firstNode = new Node();
        firstNode.input = input;
        firstNode.next = first;
        first = firstNode;
        size++;
    }

    public void deleteFirst(){
        if (first != null)
            throw new RuntimeException("First node is empty");

    }

}
