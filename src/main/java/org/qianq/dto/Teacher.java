package org.qianq.dto;

/**
 * Teacher of the school.
 * @author Qian Qian (2362597)
 */
public class Teacher {
    private static int nextId = 1;

    private String id;
    private String lastName;
    private String firstName;
    private Department department;


    /**
     * Constructor. Initialize the id based on the nextId and other fields with the arguments.
     * @param lastName The last name of the teacher.
     * @param firstName The first name of the teacher.
     * @param department The department of the teacher.
     */
    public Teacher(String lastName, String firstName, Department department) {
        this.id = String.format("T%03d", nextId++);
        this.lastName = lastName;
        this.firstName = firstName;
        this.department = department;
    }

    /**
     * Returns a string that represents this teacher.
     * @return The string that represents this teacher.
     */
    @Override
    public String toString() {
        return "Teacher{" +
                "id='" + id + '\'' +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", department=" + department +
                '}';
    }
}
