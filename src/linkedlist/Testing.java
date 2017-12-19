/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

/**
 *
 * @author 072660210
 */
public class Testing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList patientList = new LinkedList();
        System.out.println(patientList.getSize());
        Patient a = new Patient ("Sanju","Riser",1);
        Node n = new Node (a);
        patientList.setMyHead(n);
        System.out.println(patientList.getSize());
    }
    
}

