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
        //Creating new Linked List
        LinkedList patientList = new LinkedList();
        System.out.println(patientList.getSize());
        
        //Testing Add Methods
        Patient Sanju = new Patient ("Sanju","Riser",1);
        patientList.add(new Node (Sanju));
        System.out.println(patientList.getSize());
        patientList.add(new Node (new Patient ("Hawk","Glazing",2)));
        patientList.add(new Node (new Patient ("Just", "Go", 3)),2);
        
        //Testing Remove Methods
        System.out.println(patientList.getSize());
        patientList.remove(Sanju);
        System.out.println(patientList);
    }
    
}

