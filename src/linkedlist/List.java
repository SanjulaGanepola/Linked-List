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
public interface List {
    public void add(Object item);

    public void add(Object item, int pos);

    public Object set(Object item, int pos);

    public void add(List other);

    public Object get(int pos);

    public Object remove(int pos);

    public int size();

    @Override
    public String toString();
}