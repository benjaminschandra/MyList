package org.example.list;

public class List {

    private Node currentNode;
    private Node startNode;
    private int size;

    public void add(int i) {
        // Neuen Knoten erzeugen
        var newNode = new Node(i);
        // Next des alten Knoten aktualisieren
        if(currentNode != null)
            currentNode.next = newNode;
        // Startknoten setzen (nur beim ersten Element)
        if(startNode == null)
            startNode = newNode;
        // Aktuellen Knoten aktualisieren
        currentNode = newNode;

        size++;
    }

    public int get(int index) {
        if (index >= size)
            throw new ArrayIndexOutOfBoundsException("");
        var node = startNode;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        if (node == null)
            throw new ArrayIndexOutOfBoundsException("Zu weit");
        return node.value;
    }

    public int size() {
        return size;
    }

    // class Node

    class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }
    }
}
