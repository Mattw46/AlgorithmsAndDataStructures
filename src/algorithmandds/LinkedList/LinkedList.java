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
}
