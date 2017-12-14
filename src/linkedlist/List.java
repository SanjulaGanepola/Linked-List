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
    public Object get(int pos);

    public int getSize();

    @Override
    public String toString();

    public void add(Object item);

    public void add(List other);

    public void add(Object item, int pos);

    public Object remove(int pos);

    public Object remove(List other);
}
