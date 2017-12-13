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
public class Node<I> implements Comparable<Node> {

    private I item = null;
    private Node<I> next = null;

    public Node(I insert) {
        setItem(insert);
    }

    public Node(I insert, Node<I> pnext) {
        setItem(insert);
        setNext(pnext);
    }

    @Override
    public int compareTo(Node o) {
        return this.compareTo(o);
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
