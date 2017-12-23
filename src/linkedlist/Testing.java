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
        
        //Testing Add Methods
        //Creating a New Patient using Patient class
        Patient Sanju = new Patient ("Sanju","Riser",1);
        //Adds an already existing patient
        patientList.add(new Node (Sanju));
        //Adds a new patient to the list
        patientList.add(new Node (new Patient ("Hawk","Jamin",2)));
        //Adds a new patient to the first position
        patientList.add(new Node (new Patient ("Just", "Go", 3)),0);
        
        //Testing toString Method
        System.out.println(patientList);
        //Testing getSize Method
        System.out.println(patientList.getSize());
        //Testing get Method
        System.out.println(patientList.get(0));
        
        //Testing Remove Methods
        patientList.remove(0);
        System.out.println(patientList);
        patientList.remove(new Node(Sanju));
        System.out.println(patientList);
        
    }
    
}

