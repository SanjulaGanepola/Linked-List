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
        //Test Cases
        LinkedList patientList = new LinkedList();
        System.out.println(patientList.getSize());
        patientList.add(new Node (new Patient ("Sanju","Riser",1)));
        System.out.println(patientList.getSize());
        patientList.add(new Node (new Patient ("Hawk","Glazing",2)));
        System.out.println(patientList.getSize());
        patientList.remove(0);
        System.out.println(patientList.get(0));
    }
    
}

