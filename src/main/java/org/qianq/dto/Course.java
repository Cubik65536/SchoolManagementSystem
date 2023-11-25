package org.qianq.dto;

import java.util.Arrays;

/**
 * Course of the school.
 * @author Qian Qian (2362597)
 */
public class Course {
    private static final int MAX_STUDENT_NUM = 5;
    private static int nextId = 1;

    private String id;
    private String courseName;
    private double credit;
    private Department department;
    private Teacher teacher;
    private Student[] students;
    private int studentNum;

    /**
     * Constructor. Initialize the id based on the nextId and
     * credit, department, and course name with arguments.
     * @param courseName The name of this course.
     * @param credit The credit of this course.
     * @param department The department this course belongs to.
     */
    public Course(String courseName, double credit, Department department) {
        this.id = String.format("C%03d", nextId++);
        this.courseName = courseName;
        this.credit = credit;
        this.department = department;
    }

    /**
     * Returns a string that represents this course.
     * @return The string that represents this course.
     */
    @Override
    public String toString() {
        return "Course{" +
                "id='" + id + '\'' +
                ", courseName='" + courseName + '\'' +
                ", credit=" + credit +
                ", department=" + department +
                ", teacher=" + teacher +
                ", students=" + Arrays.toString(students) +
                ", studentNum=" + studentNum +
                '}';
    }
}
