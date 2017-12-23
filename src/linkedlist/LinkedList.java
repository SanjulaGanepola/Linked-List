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

    public LinkedList() {
        myHead = null;
        myTail = null;
    }

    /**
     * Method is used to return the node of a given index in the Linked List. 
     * Returns the node at the specified index.
     * @param pos The index in the list to retrieve the Node from
     * @return The node at that index
     */
    @Override
    public Node get(int pos) {
        //If the position is out of the linked list boundaries, return null and print an error
        if (pos>getSize()-1||pos<0){
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
     * Method used to return the whole linked list into a string. Returns a String
     * holding all Nodes in the Linked List
     * @return All Nodes in the Linked List into a String
     */
    @Override
    public String toString(){
        //String is initiated to hold all the patients data
        String data = "";
        //Loops through all patient nodes 
        for (int i = 0; i<getSize();i++){
        //Adds each patient to the String
            data += get(i) + ",";
        }
        //Returns the String excluding the last comma
        return data.substring(0,data.length()-1);
    }
   
   /**
    * Method used to get the size of the linked list. Returns the size of the 
    * linked list.
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
        Node n = (Node) item;
        if (myHead == null) {
            myHead = n;
            myTail = n;
        } else {
            add(item,this.getSize());
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
            myTail.setNext(n);
            myTail = n;
            myTail.setNext(null);
        } 
        else if(pos==0){
            n.setNext(myHead);
            myHead = n;
        }
        else if(pos>this.getSize()){
            throw new IndexOutOfBoundsException("Index Out Of Bounds");
        }
        else {
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
        System.out.println("Removing " + remove);
        try {
            //Node previous to the node at i
            Node previous = get(i - 1);
            System.out.println("prev " + previous);
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
            System.out.println("head" + getMyHead());
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
        System.out.println(getSize());
        for (int i = 0; i < getSize(); i++) {
            if (temp.compareTo(n) == 0) {
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
