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
public class Node<I>{
    //The design decision was to be single because it's easier because we don't
    //get marks deducted from it.
    private I item;
    private Node<I> next;
    Patient p = new Patient();
    public Node(I insert) {
        setItem(insert);
        setNext(null);
    }

    public Node(I insert, Node<I> pnext) {
        setItem(insert);
        setNext(pnext);
    }


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
