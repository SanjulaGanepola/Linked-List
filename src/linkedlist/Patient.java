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
public class Patient implements Comparable {

    //A patient class' fields 
    private String firstName;
    private String lastName;
    private Integer priority;

    /**
     * Empty Constructor for a new patient
     */
    public Patient() {
    
    }

    /**
     * Constructor for a new patient with the required fields.
     *
     * @param fName First name of the patient
     * @param lName Last name of the patient
     * @param Priority Priority of the patient
     */
    public Patient(String fName, String lName, Integer Priority) {
        firstName = fName;
        lastName = lName;
        priority = Priority;
    }

    /**
     * Method to return the patient data as a String. Returns the data of the
     * patient as a String.
     *
     * @return String of the Patient data
     */
    @Override
    public String toString() {
        return firstName + " " + lastName + ": " + priority;
    }

    /**
     * Method is used to compare the priorities between two patients.
     *
     * @param o Object to be compared to
     * @return Negative integer if priority is lower, zero if priority is the
     * same and a positive number if priority is higher
     */
    @Override
    public int compareTo(Object o) {
        Patient patient = (Patient) o;
        return priority.compareTo(patient.priority);
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the priority
     */
    public int getPriority() {
        return priority;
    }

    /**
     * @param priority the priority to set
     */
    public void setPriority(int priority) {
        this.priority = priority;
    }
}
