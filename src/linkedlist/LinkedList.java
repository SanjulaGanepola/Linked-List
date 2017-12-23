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
        if (pos > getSize() + 1) {
            throw new IndexOutOfBoundsException("Index Out Of Bounds");
        }
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
    public String toString() {
        //change variable names
        String patients = "";
        for (int i = 0; i < getSize(); i++) {
            patients += get(i) + ",";
        }
        return patients.substring(0, patients.length() - 1);
    }

    @Override
    public int getSize() {
        Node temp = myHead;
        int i = 1;
        if (temp == null) {
            return 0;
        }
        //CHANGE BELOW - DELETE THE IF STATMENT

        while (temp.getNext() != null) {
            temp = temp.getNext();
            //if the next node is null, then stop the for loop
            i++;
        }
        return i;
    }

    /**
     * Adds an element item to the end of the list.
     *
     * @param item Element to add to end of the list.
     */
    @Override
    public void add(Object item) {
        Node n = (Node) item;
        if (myHead == null) {
            myHead = n;
            setMyTail(n);
        } else {
            add(item, this.getSize());
        }
    }

    /**
     * Adds an element item at the given index position.
     *
     * @param item Element to add to list.
     * @param pos Index to add element in list.
     */
    @Override
    public void add(Object item, int pos) {
        Node n = (Node) item;
        if (pos == this.getSize()) {
            getMyTail().setNext(n);
            setMyTail(n);
            getMyTail().setNext(null);
        } else if (pos == 0) {
            n.setNext(myHead);
            myHead = n;
        } else if (pos > this.getSize()) {
            throw new IndexOutOfBoundsException("Index Out Of Bounds");
        } else {
            Node prev = this.get(pos - 1);
            n.setNext(prev.getNext());
            prev.setNext(n);
        }
    }

    /**
     * Delete an item at a given index i.
     *
     * @param i The index of the item.
     * @return
     */
    @Override
    public Object remove(int i) {
        //the node to remove
        Node remove = get(i);
        try {
            //Node previous to the node at i
            Node previous = get(i - 1);
            //Remove the tail
            if (remove.getNext() == null) {
                previous.setNext(null);
                setMyTail(previous);
            } else {
                //Remove the node that is located in the middle of the linked list
                previous.setNext(remove.getNext());
            }
        } catch (IndexOutOfBoundsException e) {
            //remove the head
            setMyHead(remove.getNext());
        }
        return remove;
    }

    /**
     * Delete a matching item d.
     *
     * @param d The item to remove.
     * @return
     */
    @Override
    public boolean remove(Object d) {
        Node n = (Node) d;
        //The head
        Node temp = myHead;
        for (int i = 0; i < getSize(); i++) {
            if (temp == n) {
                remove(i);
                return true;
            }
            temp = temp.getNext();
        }
        return false;
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
}
