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
public interface List {

    public void add(Object item);

    public void add(Object item, int pos);

    public Object get(int pos);

    public int getSize();

    @Override
    public String toString();

    public Object remove(int i);

    public boolean remove(Node d);
}
