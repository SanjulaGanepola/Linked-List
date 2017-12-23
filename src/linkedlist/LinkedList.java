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

    //Head of the LinkedList
    private Node myHead;
    //Tail of the LinkedList
    private Node myTail;

    /**
     * Constructor for a new Linked List
     */
    public LinkedList() {
        myHead = null;
        myTail = null;
    }

    /**
     * Method is used to return the node of a given index in the Linked List.
     * Returns the node at the specified index.
     *
     * @param pos The index in the list to retrieve the Node from
     * @return The node at that index
     */
    @Override
    public Node get(int pos) {
        //If the position is out of the linked list boundaries, return null and print an error
        if (pos > getSize() - 1 || pos < 0) {
            //Throws an out of bounds error if the user enters an index higher or lower than the size
            throw new IndexOutOfBoundsException("Index Out of Bounds");
        }
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

    /**
     * Method used to return the whole linked list into a string. Returns a
     * String holding all Nodes in the Linked List
     *
     * @return All Nodes in the Linked List into a String
     */
    @Override
    public String toString() {
        //String is initiated to hold all the patients data
        String data = "";
        //Loops through all patient nodes 
        for (int i = 0; i < getSize(); i++) {
            //Adds each patient to the String
            data += get(i) + ",";
        }
        //Returns the String excluding the last comma
        return data.substring(0, data.length() - 1);
    }

    /**
     * Method used to get the size of the linked list. Returns the size of the
     * linked list.
     *
     * @return Size of Linked List
     */
    @Override
    public int getSize() {
        //A temporary variable is used to take in the value of the head
        Node temp = myHead;
        //Integer to keep count of the amount of nodes in the linked list
        int i = 1;
        //If there is nothing in the list, return 0
        if (temp == null) {
            return 0;
        }
        //While there is still another node in the list, add to i
        while (temp.getNext() != null) {
            temp = temp.getNext();
            i++;
        }
        //Return i
        return i;
    }

    /**
     * Adds an element item to the end of the list.
     *
     * @param item Element to add to end of the list.
     */
    @Override
    public void add(Object item) {
        //the node to add
        Node n = (Node) item;
        //if there is no head node
        if (this.getSize() == 0) {
            //set both head and tail to node
            myHead = n;
            myTail = n;
        } else {
            //add node to end of list
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
        //the node to add
        Node n = (Node) item;
        //if added to end of list
        if (pos == this.getSize()) {
            //set the node after the tail
            myTail.setNext(n);
            //set the tail to that node
            myTail = n;
            //set that node's next is empty
            myTail.setNext(null);
        } 
        //if adding to front of list
        else if (pos == 0) {
            //set the node's next to the head node
            n.setNext(myHead);
            //set the head to the node
            myHead = n;
        } 
        //if a node is added past the linked list size
        else if (pos > this.getSize()) {
            //throw index out of bounds exception
            throw new IndexOutOfBoundsException("Index Out Of Bounds");
        } 
        else {
            //find the node before the node at target position
            Node prev = this.get(pos - 1);
            //set node's next to the position
            n.setNext(prev.getNext());
            //set the previous node's next to current node
            prev.setNext(n);
        }
    }

    /**
     * Delete an item at a given index i.
     *
     * @param i The index of the item.
     * @return The node removed
     */
    @Override
    public Object remove(int i) {
        //The node to remove
        Node remove = get(i);
        try {
            //The node previous to the node to remove
            Node previous = get(i - 1);
            //Remove the tail node
            if (remove.getNext() == null) {
                //Set the next node of the previous node to null
                previous.setNext(null);
                //Set the tail node to the previous node
                myTail = previous;
                System.out.println("b");
            } //Remove a node located middle of the linked list
            else {
                //Set the next node of the previous node to the node after the node to remove
                previous.setNext(remove.getNext());
                System.out.println("c");
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("a");
            //Remove the head
            myHead = remove.getNext();
        }
        return remove;
    }

    /**
     * Delete a matching item d.
     *
     * @param d The item to remove.
     * @return True if the node was removed or false if the node was not
     * removed.
     */
    @Override
    public boolean remove(Object d) {
        //The node to remove
        Node n = (Node) d;
        //The temporary head node
        Node temp = myHead;
        //Loop through the LinkedList
        for (int i = 0; i < getSize(); i++) {
            System.out.println("try");
            //Check if the node to remove exists at a specific node in the LinkedList
            if (n.getItem().equals(temp.getItem())) {
                System.out.println("sucess" + i);
                //Remove the node
                remove(i);
                return true;
            }
            //Get the next node
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
