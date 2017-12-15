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

    private String firstName;
    private String lastName;
    private Integer priority;

    @Override
    public String toString() {
        return firstName + " " + lastName + ": " + priority;
    }

    @Override
    public int compareTo(Object o) {
        Patient patient = (Patient) o;
        if (firstName.compareTo(patient.firstName) == 0) {
            if (lastName.compareTo(patient.lastName) == 0) {
                return priority.compareTo(patient.priority);
            }
        }
        return -1;
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
