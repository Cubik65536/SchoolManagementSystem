package org.qianq.dto;

import java.util.Arrays;

/**
 * Student of the school.
 * @author Qian Qian (2362597)
 */
public class Student {
    private static final int MAX_COURSE_NUM = 5;
    private static int nextId = 1;

    private String id;
    private String lastName;
    private String firstName;
    private Department department;
    private Course[] courses;
    private int courseNum;

    /**
     * Constructor. Initialize the id with nextId and
     * last name, first name, and department with arguments.
     * @param lastName The first name of the student.
     * @param firstName The last name of the student.
     * @param department The department of the student.
     */
    public Student(String lastName, String firstName, Department department) {
        this.id = String.format("S%03d", nextId++);
        this.lastName = lastName;
        this.firstName = firstName;
        this.department = department;
    }

    /**
     * Returns a string that represents this student.
     * @return The string that represents this student.
     */
    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", department=" + department +
                ", courses=" + Arrays.toString(courses) +
                ", courseNum=" + courseNum +
                '}';
    }
}
