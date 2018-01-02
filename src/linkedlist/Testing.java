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
        Patient A = new Patient("A", "B", 1);
        //Adds an already existing patient
        patientList.add(new Node(A));
        //Adds a new patient to the list
        patientList.add(new Node(new Patient("C", "D", 2)));
        //Adds a new patient to the first position
        patientList.add(new Node(new Patient("E", "F", 3)), 0);

        //Testing toString Method
        System.out.println(patientList);
        //Testing getSize Method
        System.out.println(patientList.getSize());
        //Testing get Method
        System.out.println(patientList.get(0));

        //Testing Remove Methods
        //Removes the first patient
        patientList.remove(0);
        System.out.println(patientList);
        //Remove an existing patient
        patientList.remove(new Node(A));
        System.out.println(patientList);
        //Removes the first patient
        patientList.remove(0);
        System.out.println(patientList);
    }
}
