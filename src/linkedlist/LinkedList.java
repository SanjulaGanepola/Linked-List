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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

    }
    /**
     * adds an element item to the end of the list
     * @param item element to add to end of the list
     */
    @Override
    public void add(Object item) {
        add(item,iMySize);
    }
    
    /**
     * adds an element item at the given index pos
     * @param item  element to add to list
     * @param pos   index to add element in list
     */
    @Override
    public void add(Object item, int pos) {
        Node n = (Node)item;
        
        if(myHead==null){
            myHead = n;
            myTail = n;
            iMySize = 1;
        }
        else if (pos==iMySize){
            myTail.setNext(n);
            myTail = n;
            myTail.setNext(null);
        }
        else{
            for(int i = 0;i<=pos;i++){
                
            }
        }
    }

    @Override
    public Object set(Object item, int pos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object get(int pos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object remove(int pos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int size() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
