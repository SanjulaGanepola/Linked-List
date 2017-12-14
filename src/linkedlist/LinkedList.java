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
    private int iMySize;

    public LinkedList() {
        myHead = null;
        myTail = null;
        iMySize = 0;
    }

    @Override
    public Object get(int pos) {
        Node temp = myHead;
        for (int i = 0; i < pos; i++) {
            temp = temp.getNext();
        }
        return temp;
    }

    @Override
    public int getSize() {
        Node temp = myHead;
        int i;
        //for (i = 0; i<){
        //if the next node is null, then stop the for loop
        if (temp.getNext() == null) {

            //  }
        }
        return 1;
    }

    @Override
    public void add(Object item) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void add(List other) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void add(Object item, int pos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object remove(int pos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object remove(List other) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
