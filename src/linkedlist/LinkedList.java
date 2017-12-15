/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

/**
 *
 * @author 348676487
 */
public class LinkedList implements List {

    private Node myHead;
    private Node myTail;
    private int size;

    public LinkedList() {
        myHead = null;
        myTail = null;
        size = 0;
    }

    @Override
    public Node get(int pos) {
        //Temporary variable that stores the head 
        Node temp = myHead;
        //Loops through the nodes until it reaches the position of the node
        for (int i = 0; i < pos; i++) {
            //Temporary Node becomes the next node in the list
            temp = temp.getNext();
        }
        //Returns the node at position
        return temp;
    }

    @Override
    public int getSize() {
        //return size;      

        Node temp = myHead;
        int i;
        for (i = 0; i<){
        //if the next node is null, then stop the for loop
        temp = temp.getNext();
            if (temp.getNext() == null) {
            
              }
        }
        return 1;
    }

    /**
     * adds an element item to the end of the list
     *
     * @param item element to add to end of the list
     */
    @Override
    public void add(Object item) {
        add(item, iMySize);
    }

    /**
     * adds an element item at the given index pos
     *
     * @param item element to add to list
     * @param pos index to add element in list
     */
    @Override
    public void add(Object item, int pos) {
        Node n = (Node) item;

        if (myHead == null) {
            myHead = n;
            myTail = n;
            iMySize = 1;
        } else if (pos == iMySize) {
            myTail.setNext(n);
            myTail = n;
            myTail.setNext(null);
        } else {
            for (int i = 0; i <= pos; i++) {

            }
        }
    }

    @Override
    public Object set(Object item, int pos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Delete an item at a given index i.
     *
     * @param i The index of the item.
     */
    @Override
    public void remove(int i) {

    }

    /**
     * Delete a matching item d.
     *
     * @param d The item to remove.
     */
    @Override
    public void remove(Object d) {
        Node n = (Node) d;
        if (myHead == n.getItem()) {
            remove(0);
        }
        Node temp = myHead;
        for (int i = 1; i < getSize(); i++) {
            temp = temp.getNext();
            if (temp == n.getItem()) {
                remove(i);
            }
        }
    }

    /**
     * @return the myHead
     */
    public Node getMyHead() {
        return myHead;
    }

    /**
     * @param myHead the myHead to set
     */
    public void setMyHead(Node myHead) {
        this.myHead = myHead;
    }

    /**
     * @return the myTail
     */
    public Node getMyTail() {
        return myTail;
    }

    /**
     * @param myTail the myTail to set
     */
    public void setMyTail(Node myTail) {
        this.myTail = myTail;
    }

    /**
     * @return the iMySize
     */
    public int getiMySize() {
        return iMySize;
    }

    /**
     * @param iMySize the iMySize to set
     */
    public void setiMySize(int iMySize) {
        this.iMySize = iMySize;
    }
}
