/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithmandds.LinkedList;

import algorithmandds.node.Node;

/**
 *
 * @author neo
 */
public class LinkedList {
    Node root;
    
    // Default constructor, create 4 element List
    public LinkedList() {
        root = new Node(1);
        Node currentNode = new Node(2);
        root.next = currentNode;
        currentNode.next = new Node(3);
        currentNode = currentNode.next; // shift next to current
        currentNode.next = new Node(4);
        currentNode = currentNode.next;
        currentNode.next = null;
    }
    
    public void printLinkedList() {
        Node current = root;
        do {
            System.out.print(current.number + " ");
            current = current.next;
        } while (current != null);
    }
    
    public void addElement(int num) {
        Node newElement = new Node(num);
        Node current = root;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newElement;
    }
    
    public void removeElement(int num) {
        if (root.number == num) {
            root = root.next;
            return;
        }
        Node current = root.next;
        Node previous = root;
        while (current != null) {
            if (current.number == num) {
                previous.next = current.next;
            }
            previous = current;
            current = current.next;
        }
    }
}
