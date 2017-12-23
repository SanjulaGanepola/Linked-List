/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

/**
 *
 * @author 072671415
 */
public class Node<I> {

    //We decided to go with singly linked list because insertions and deletions
    //of nodes can be done easily and each node does not require an extra field
    //for a pointer to the previous node.

    private I item;
    private Node<I> next;
    Patient p = new Patient();
    /**
     * Constructor for Node with item as parameter
     * @param insert item in the node
     */
    public Node(I insert) {
        setItem(insert);
        setNext(null);
    }
    /**
     * Constructor for Node with item and next node as parameter
     * @param insert    item in the node
     * @param pnext     next node
     */
    public Node(I insert, Node<I> pnext) {
        setItem(insert);
        setNext(pnext);
    }

    
    @Override
    /**
     * Output item at node in String format
     */
    public String toString (){
        return item.toString();
    }

    /**
     * @return the item
     */
    public I getItem() {
        return item;
    }

    /**
     * @param item the item to set
     */
    public void setItem(I item) {
        this.item = item;
    }

    /**
     * @return the next
     */
    public Node<I> getNext() {
        return next;
    }

    /**
     * @param next the next to set
     */
    public void setNext(Node<I> next) {
        this.next = next;
    }
}
