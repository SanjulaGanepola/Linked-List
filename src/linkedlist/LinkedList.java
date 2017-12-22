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
        //change below - change to - 1
        if (pos > getSize() - 1) {
            System.out.println("ERROR");
            return null;
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
            Node prev = (Node) this.get(pos - 1);
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
        Node remove;

        //Node previous to the node at i
        Node previous;
        //Node at i is empty
        if (get(i) == null) {
            return null;
        } //Node at i has a node
        else {
            //the node to remove
            remove = get(i);
            //remove the head
            if (remove == getMyHead()) {
                setMyHead(remove.getNext());
            } //remove tail
            else if (remove == getMyTail()) {
                previous = get(i - 1);
                previous.setNext(null);
                setMyTail(previous);
            } else {
                //the node previous to the node to remove
                previous = get(i - 1);
                Node after = previous.getNext().getNext();
                previous.setNext(after);
            }
            return remove;
        }
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
            //????????????????????????????
            //remove the head but i need to shift it all back
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
}
